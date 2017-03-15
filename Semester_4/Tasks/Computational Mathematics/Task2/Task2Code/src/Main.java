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
        Matrix.println(pluDecomposition.LUMatrix);
        Matrix.println(pluDecomposition.PMatrix);
        Matrix.println(pluDecomposition.QMatrix);
        System.out.println(pluDecomposition.determinant());
        System.out.println(pluDecomposition.rang);
        Matrix.println(pluDecomposition.solveOfEquation(column));
        Matrix.println(pluDecomposition.inverse());
        System.out.println(Matrix.norm(matrix) * Matrix.norm(pluDecomposition.inverse()));



        //Matrix.printlnColumn(Matrix.multiplicateToColumn(matrix, re));
        //double[] ans = dec.solveOfEquation(re);
        //Matrix.println(dec.inverse());
        //Matrix.println(Matrix.transponse(dec.QMatrix));
        //System.out.println(dec.determinant());
    }
}
