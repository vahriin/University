import java.util.Random;

/**
 * Created by vahriin on 3/3/17.
 */
public class Matrix {
    private static Random random = new Random();

    public static double[][] clone(double[][] matrix) {
        double [][] matrixClone = new double[matrix.length][];
        for(int i = 0; i < matrix.length; i++) {
            matrixClone[i] = matrix[i].clone();
        }
        return matrixClone;
    }

    public static int[][] transponse(int[][] matrix) {
        int[][] result = new int[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i) {
            for (int j = 0; j < Constants.DIM; ++j) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static double[][] transponse(double[][] matrix) {
        double[][] result = new double[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i) {
            for (int j = 0; j < Constants.DIM; ++j) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static double conditionalityNumber(double[][] matrix) {
        return norm(matrix) * norm(new PLU(matrix).inverse());
    }

    public static double norm(double[][] matrix) {
        double maximum = 0;
        for (int i = 0; i < Constants.DIM; ++i) {
            double summ = 0;
            for (int j = 0; j < Constants.DIM; ++j) {
                summ += Math.abs(matrix[i][j]);
            }
            maximum = (summ > maximum ? summ : maximum);
        }
        return maximum;
    }

    public static double[][] multiplicateToMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i) {
            for (int j = 0; j < Constants.DIM; ++j) {
                for (int k = 0; k < Constants.DIM; ++k) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] multiplicateToMatrix(double[][] matrix1, int[][] matrix2) {
        double[][] result = new double[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i) {
            for (int j = 0; j < Constants.DIM; ++j) {
                for (int k = 0; k < Constants.DIM; ++k) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static double[] multiplicateToColumn(double[][] matrix, double[] column) {
        double[] result = new double[Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i) {
            for (int j = 0; j < Constants.DIM; ++j) {
                result[i] += matrix[i][j] * column[j];
            }
        }
        return result;
    }

    public static double[] multiplicateToColumn(int[][] matrix, double[] column) {
        double[] result = new double[Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i) {
            for (int j = 0; j < Constants.DIM; ++j) {
                result[i] += matrix[i][j] * column[j];
            }
        }
        return result;
    }

    public static int[][] generateInt() {
        final int MAX = 200;
        int matrix[][] = new int[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; i++){
            for (int j = 0; j < Constants.DIM; j++){
                matrix[i][j] = random.nextInt(MAX) - 99;
            }
        }
        return matrix;
    }

    public static double[][] generateDouble() {
        final int MAX = 200;
        double matrix[][] = new double[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; i++){
            for (int j = 0; j < Constants.DIM; j++){
                matrix[i][j] = random.nextInt(MAX) - 99;
            }
        }
        return matrix;
    }

    public static double[][] generateDiagPrevalence() {
        final int MAX = 180;
        double[][] matrix = new double[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i) {
            int summOfLine = 0;
            for (int j = 0; j < Constants.DIM; ++j) {
                if (i != j) {
                    summOfLine += matrix[i][j] = random.nextInt(MAX) - 89;
                }
            }
            matrix[i][i] = summOfLine + random.nextInt(10);
        }
        return matrix;
    }

    public static void swapRows(double[][] matrix, int number1, int number2) {
        double[] swap = matrix[number1];
        matrix[number1] = matrix[number2];
        matrix[number2] = swap;
    }

    public static void swapColumns(double[][] matrix, int number1, int number2) {
        double swap;
        for (int i = 0; i < Constants.DIM; i++){
            swap = matrix[i][number1];
            matrix[i][number1] = matrix[i][number2];
            matrix[i][number2] = swap;
        }
    }

    public static void swapRows(int[][] matrix, int number1, int number2){
        int[] swap = matrix[number1];
        matrix[number1] = matrix[number2];
        matrix[number2] = swap;
    }

    public static void swapColumns(int[][] matrix, int number1, int number2){
        int swap;
        for (int i = 0; i < Constants.DIM; i++){
            swap = matrix[i][number1];
            matrix[i][number1] = matrix[i][number2];
            matrix[i][number2] = swap;
        }
    }

    public static int[][] generateId () {
        int[][] matrix = new int[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i){
            matrix[i][i] = 1;
        }
        return matrix;
    }

    public static double[][] generateIdDouble () {
        double[][] matrix = new double[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i){
            matrix[i][i] = 1;
        }
        return matrix;
    }

    public static void println(double[] column) {
        for (int i = 0; i < Constants.DIM; ++i) {
            System.out.println(column[i]);
        }
        System.out.println();
    }

    public static void println(int[] column) {
        for (int i = 0; i < Constants.DIM; ++i) {
            System.out.println(column[i]);
        }
        System.out.println();
    }

    public static void println(double[][] matrix) {
        for (int i = 0; i < Constants.DIM; ++i){
            for (int j = 0; j < Constants.DIM; ++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void println(int[][] matrix) {
        for (int i = 0; i < Constants.DIM; i++){
            for (int j = 0; j < Constants.DIM; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
