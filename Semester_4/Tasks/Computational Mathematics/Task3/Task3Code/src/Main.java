import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

/**
 * Created by vahriin on 5/9/17.
 */
public class Main {
    public static void main(String[] args) {
        RealVector currentApprox = MatrixUtils.createRealVector(new double[]{0.5, 0.5, 1.5, -1.0, -0.5, 1.5, 0.5, -0.5, 1.5, -1.5});
        // RealVector currentApprox = MatrixUtils.createRealVector(new double[]{0.5, 0.5, 1.5, -1.0, -0.2, 1.5, 0.5, -0.5, 1.5, -1.5});


        /*RealVector simplyAns = simpleNewton(currentApprox);
        RealVector modifyAns = modifyFirstIterationMatrixNewton(currentApprox);
        RealVector changeAns = changeMethod(currentApprox, 4);
        RealVector hybridMethod = hybridMethod(currentApprox,4);*/
        //print(hybridMethod.toArray());
        /*for (int i = 1; i < 26; ++i) {
            long start = System.nanoTime();
            //RealVector simplyAns = simpleNewton(currentApprox);
            //RealVector modifyAns = modifyFirstIterationMatrixNewton(currentApprox);
            //RealVector changeAns = changeMethod(currentApprox, 4);
            RealVector hybridMethod = hybridMethod(currentApprox,i);
            long finish = System.nanoTime();
            long timeConsumedMillis = finish - start;
            System.out.println(i + " " + timeConsumedMillis);
        }*/
        //long start = System.nanoTime();
        RealVector simplyAns = simpleNewton(currentApprox);
        RealVector modifyAns = modifyFirstIterationMatrixNewton(currentApprox);
        RealVector changeAns = changeMethod(currentApprox, 4);
        RealVector hybridMethod = hybridMethod(currentApprox,4);
        /*long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        //System.out.println(timeConsumedMillis);*/

        /*long min = Long.MAX_VALUE;
        int mink = 0;
        for (int k = 1; k < 500; ++k) {
            long start = System.nanoTime();
            RealVector changeAns = changeMethod(currentApprox, k);
            long finish = System.nanoTime();
            long timeConsumedMillis = finish - start;
            if (timeConsumedMillis < min) {
                min = timeConsumedMillis;
                mink = k;
            }
        }*/

        // лучший вариант - 4 или 5

        //System.out.println(mink + " " + min);

        print(simplyAns.toArray());
        print(modifyAns.toArray());
        print(changeAns.toArray());
        print(hybridMethod.toArray());
    }



    public static RealVector simpleNewton(RealVector currentApprox) {
        RealVector nextApprox = simpleNewtonIteration(currentApprox);
        int i = 0;
        while (nextApprox.add(currentApprox.mapMultiply(-1)).getLInfNorm() > 1E-15) {
            currentApprox = nextApprox;
            nextApprox = simpleNewtonIteration(currentApprox);
            ++i;
        }
        return nextApprox;
    }

    public static RealVector simpleNewtonIteration(RealVector currentApprox) {
        NewtonMethod method = new NewtonMethod();
        double[] temp = currentApprox.toArray();
        method.setJacobiMatrix(temp);
        method.setEquationSystem(temp);
        RealVector vector = method.solveOfEquation();
        return vector.add(currentApprox);
    }



    public static RealVector modifyFirstIterationMatrixNewton(RealVector currentApprox) {
        NewtonMethod method = new NewtonMethod();
        method.setJacobiMatrix(currentApprox.toArray());
        method.setEquationSystem(currentApprox.toArray());
        RealVector nextApprox = method.solveOfEquation().add(currentApprox);
        while (nextApprox.add(currentApprox.mapMultiply(-1)).getLInfNorm() > 1E-15) {
            currentApprox = nextApprox;
            method.setEquationSystem(currentApprox.toArray());
            nextApprox = method.solveOfEquation().add(currentApprox);
        }
        return nextApprox;
    }


    public static RealVector changeMethod(RealVector currentApprox, int k) {
        RealVector nextApprox = simpleNewtonIteration(currentApprox);
        while (--k > 0) {
            currentApprox = nextApprox;
            nextApprox = simpleNewtonIteration(currentApprox);
        }
        return modifyFirstIterationMatrixNewton(currentApprox);
    }

    // Метод с выпущенными кишками. Зато быстро работает... в теории
    public static RealVector hybridMethod(RealVector currentApprox, int k) {
        System.out.println();
        NewtonMethod method = new NewtonMethod();
        method.setJacobiMatrix(currentApprox.toArray());
        method.setEquationSystem(currentApprox.toArray());
        LUDecomposition ludec = new LUDecomposition(method.jacobiMatrix);
        RealVector nextApprox = ludec.getSolver().solve(method.equationSystem.mapMultiply(-1)).add(currentApprox);
        int iter = 0;
        while (nextApprox.add(currentApprox.mapMultiply(-1)).getLInfNorm() > 1E-15) {
            //print(nextApprox.toArray());
            currentApprox = nextApprox;
            if (iter % k == 0) {
                method.setJacobiMatrix(currentApprox.toArray());
                ludec = new LUDecomposition(method.jacobiMatrix);
            }
            method.setEquationSystem(currentApprox.toArray());
            nextApprox = ludec.getSolver().solve(method.equationSystem.mapMultiply(-1)).add(currentApprox);
            iter++;
        }
        return nextApprox;
    }

    public static void print(double[] column) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(column[i]);
        }
        System.out.println();
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
