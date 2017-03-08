/**
 * Created by vahriin on 3/2/17.
 */
public class PLU {
    public int trans;
    public int rang;
    public int[][] PMatrix;
    public int[][] QMatrix;
    public double[][] LUMatrix;

    public PLU(double[][] matrix){
        PMatrix = Matrix.generateId();
        QMatrix = Matrix.generateId();
        LUMatrix = matrix;

        decomposition(LUMatrix, PMatrix, QMatrix);
        PMatrix = Matrix.transponse(PMatrix);
        QMatrix = Matrix.transponse(QMatrix);
    }

    public void decomposition(double[][] UMatrix, int[][]PMatrix, int[][]QMatrix) {
        for (int i = 0; i < Constants.DIM; ++i) {
            moveMainElementToCurrentRow(UMatrix, PMatrix, QMatrix, i);
            double m;
            for (int j = i + 1; j < Constants.DIM; ++j) {
                m = UMatrix[j][i] / UMatrix[i][i];
                for (int k = i; k < Constants.DIM; ++k) {
                    UMatrix[j][k] -= m * UMatrix[i][k];
                }
                UMatrix[j][i] = m;
            }
        }
    }

    public double determinant() {
        double result = 1;
        for (int i = 0; i < Constants.DIM; ++i) {
            result *= LUMatrix[i][i];
        }
        return (trans % 2 == 0 ? result : -result);
    }

    public double[] solveOfEquation(double[] column) {
        column = Matrix.multiplicateToColumn(PMatrix, column);
        for (int i = 1; i < Constants.DIM; ++i) {
            for (int j = 0; j < i; ++j) {
                column[i] -= LUMatrix[i][j] * column[j];
            }
        }

        column[Constants.DIM - 1] /= LUMatrix[Constants.DIM - 1][Constants.DIM - 1];
        for (int i = Constants.DIM - 2; i >= 0; --i) {
            for (int j = i + 1; j < Constants.DIM; ++j) {
                column[i] -= LUMatrix[i][j] * column[j];
            }
            column[i] /= LUMatrix[i][i];
        }
        column = Matrix.multiplicateToColumn(QMatrix, column);
        return column;
    }

    public double[][] inverse() {
        double[][] temp = Matrix.generateIdDouble();
        double[][] result = new double[Constants.DIM][Constants.DIM];
        for (int i = 0; i < Constants.DIM; ++i) {
            result[i] = solveOfEquation(temp[i]);
        }
        return Matrix.transponse(result);
    }



    private void moveMainElementToCurrentRow(
            double[][] matrix, int[][] PMatrix, int[][] QMatrix, int currentRow) {

        int[] coordinatesOfMainElement = searchMainElement(matrix, currentRow);

        Matrix.swapRows(matrix, coordinatesOfMainElement[0], currentRow);
        Matrix.swapColumns(matrix, coordinatesOfMainElement[1], currentRow);

        Matrix.swapRows(PMatrix, coordinatesOfMainElement[0], currentRow);
        Matrix.swapRows(QMatrix, coordinatesOfMainElement[1], currentRow);
    }

    private int[] searchMainElement(double[][] matrix, int currentRow){
        double maximum = 0;
        int[] ret = new int[2];
        for (int i = currentRow; i < Constants.DIM; ++i){
            for (int j = currentRow; j < Constants.DIM; ++j){
                if (Math.abs(matrix[i][j]) > maximum ) {
                    maximum = matrix[i][j];
                    ret[0] = i;
                    ret[1] = j;
                }
                if (i != currentRow && j != currentRow) {
                    ++trans; //number of transposition
                }
            }
        }
        if (Math.abs(maximum) > 1E-10) {
            ++rang; //rang of matrix
        }
        return ret;
    }
}

