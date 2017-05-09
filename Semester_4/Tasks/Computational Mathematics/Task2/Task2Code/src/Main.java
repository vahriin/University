/**
 * Created by vahriin on 3/3/17.
 */
public class Main {
    public static void main(String[] args) {
        double[][] matrix = {
                {2, 4, 6},
                {4, 8, 2},
                {6, 8, 2}
        };

        double[] column = {2, 6, 4};

        Matrix.println(matrix);

        PLU pluDecomposition = new PLU(matrix);
        System.out.println("PLU разложение:");
        System.out.println("LU Matrix: ");
        Matrix.println(pluDecomposition.LUMatrix);
        System.out.println("P Matrix");
        Matrix.println(pluDecomposition.PMatrix);
        System.out.println("Q Matrix");
        Matrix.println(pluDecomposition.QMatrix);
        System.out.println();

        System.out.println("Определитель:");
        System.out.println(pluDecomposition.determinant());
        System.out.println();

        System.out.println("Ранг:");
        System.out.println(pluDecomposition.rang - 1);
        System.out.println();

        System.out.println("Решение уравнения:");
        Matrix.println(pluDecomposition.solveOfEquation(column.clone()));
        System.out.println();

        System.out.println("Обратная матрица:");
        Matrix.println(pluDecomposition.inverse());
        System.out.println();

        System.out.println("Число обусловленности:");
        System.out.println(Matrix.norm(matrix) * Matrix.norm(pluDecomposition.inverse()));
        System.out.println();

        System.out.println('\n');


        QR qrDecomposition = new QR(matrix);
        System.out.println("QR-разложение:");
        System.out.println("R Matrix");
        Matrix.println(qrDecomposition.RMatrix);
        System.out.println("Q Matrix");
        Matrix.println(Matrix.transponse(qrDecomposition.QMatrix));

        System.out.println("Решение уравнения:");
        Matrix.println(qrDecomposition.solveOfEquation(column.clone()));

        System.out.println('\n');


        //matrix = Matrix.generateDiagPrevalence();
        double[][] matrix2 = {{64, -43, -16}, {42, 108, -66}, {90, 89, 187}};
        System.out.println("Матрица с диагональным преобладанием:");
        Matrix.println(matrix2);

        System.out.println("\n");

        Jacobi jacobiMatrix = new Jacobi(Matrix.clone(matrix2));
        System.out.println("Метод Якоби решения СЛАУ: ");
        Matrix.println(jacobiMatrix.solveOfEquation(column.clone()));
        System.out.println(jacobiMatrix.numberOfIterations);

        System.out.println('\n');

        Seidel seidelMatrix = new Seidel(Matrix.clone(matrix2));
        System.out.println("Метод Зейделя решения СЛАУ");
        Matrix.println(seidelMatrix.solveOfEquation(column.clone()));
        System.out.println(seidelMatrix.numberOfIterations);

        System.out.println("\n");


        System.out.println("Сходимость:");
        matrix2 = new double[][]{{1, 2, 3},{1, 3, 1},{1,2,4}};
        System.out.println("Матрица:");
        Matrix.println(matrix2);
        seidelMatrix = new Seidel(Matrix.clone(matrix2));
        jacobiMatrix = new Jacobi(Matrix.clone(matrix2));

        Matrix.println(seidelMatrix.solveOfEquation(column));
        System.out.println(seidelMatrix.numberOfIterations);
        /*здесь зависнет, это нормально, метод Якоби не сходится для новой матрицы*/
        Matrix.println(jacobiMatrix.solveOfEquation(column));
        System.out.println("Success");
    }
}
