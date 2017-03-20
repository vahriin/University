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
        double[] column = {2, 3, 4};


        PLU pluDecomposition = new PLU(matrix);
        System.out.println("PLU разложение:");
        Matrix.println(pluDecomposition.LUMatrix);
        Matrix.println(pluDecomposition.PMatrix);
        Matrix.println(pluDecomposition.QMatrix);
        System.out.println();

        System.out.println("Определитель:");
        System.out.println(pluDecomposition.determinant());
        System.out.println();

        System.out.println("Ранг:");
        System.out.println(pluDecomposition.rang);
        System.out.println();

        System.out.println("Решение уравнения:");
        Matrix.println(pluDecomposition.solveOfEquation(column));
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
        Matrix.println(qrDecomposition.RMatrix);
        Matrix.println(qrDecomposition.QMatrix);

        System.out.println("Решение уравнения:");
        Matrix.println(qrDecomposition.solveOfEquation(column));

    }
}
