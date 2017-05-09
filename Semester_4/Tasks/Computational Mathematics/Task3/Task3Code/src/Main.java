import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

/**
 * Created by vahriin on 5/9/17.
 */
public class Main {
    public static void main(String[] args) {
        RealVector currentApprox = MatrixUtils.createRealVector(new double[]{0.5, 0.5, 1.5, -1.0, -0.5, 1.5, 0.5, -0.5, 1.5, -1.5});

        RealVector simplyAns = simpleNewton(currentApprox);
        RealVector modifyAns = modifyNewton(currentApprox);

        print(simplyAns.toArray());
        print(modifyAns.toArray());
    }

    public static RealVector simpleNewton(RealVector currentApprox) {
        RealVector nextApprox = simpleNewtonIteration(currentApprox);
        while (currentApprox.add(nextApprox.mapMultiply(-1)).getLInfNorm() > 1E-16) {
            currentApprox = nextApprox;
            nextApprox = simpleNewtonIteration(currentApprox);
        }
        return nextApprox;
    }

    public static RealVector modifyNewton(RealVector currentApprox) {
        RealVector nextApprox = simpleNewtonIteration(currentApprox);
        while (currentApprox.add(nextApprox.mapMultiply(-1)).getLInfNorm() > 1E-22) {
            currentApprox = nextApprox;
            nextApprox = modifyNewtonIteration(currentApprox);
        }
        return nextApprox;
    }

    public static RealVector simpleNewtonIteration(RealVector currentApprox) {
        NewtonMethod method = new NewtonMethod();
        double[] temp = currentApprox.toArray();
        method.setJacobiMatrix(temp);
        method.setEquationSystem(temp);
        RealVector vector = method.simplyNewtonMultiply();
        return vector.add(currentApprox);
    }

    public static RealVector modifyNewtonIteration(RealVector currentApprox) {
        NewtonMethod method = new NewtonMethod();
        double[] temp = currentApprox.toArray();
        method.setJacobiMatrix(temp);
        method.setEquationSystem(temp);
        RealVector vector = method.modifyNewtonMultiply();
        return vector.add(currentApprox);
    }

    public static void print(double[] column) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(column[i]);
        }
        System.out.println();
    }
}
