

/**
 * Created by vahriin on 3/10/17.
 */
public class QR {
    public double[][] QMatrix;
    public double[][] RMatrix;

    public QR(double[][] matrix) {
        RMatrix = Matrix.clone(matrix);
        QMatrix = Matrix.generateIdDouble();
        decomposition();
    }

    public double[] solveOfEquation(double[] column) {
        column = Matrix.multiplicateToColumn(QMatrix, column);
        column[Constants.DIM - 1] /= RMatrix[Constants.DIM - 1][Constants.DIM - 1];
        for (int i = Constants.DIM - 2; i >= 0; --i) {
            for (int j = i + 1; j < Constants.DIM; ++j) {
                column[i] -= RMatrix[i][j] * column[j];
            }
            column[i] /= RMatrix[i][i];
        }
        return column;
    }

    private void decomposition() {
        for (int i = 0; i < Constants.DIM; i++) {
            for(int j = i + 1; j < Constants.DIM; j++) {
                double[][] currentQMatrix = generateCurrentQMatrix(i,j);
                RMatrix = Matrix.multiplicateToMatrix(currentQMatrix, RMatrix);
                QMatrix = Matrix.multiplicateToMatrix(currentQMatrix, QMatrix);
            }
        }
    }

    private double[][] generateCurrentQMatrix(int row1, int row2) {
        double[][] result = Matrix.generateIdDouble();
        double xi = RMatrix[row2][row1];
        double xj = RMatrix[row1][row1];
        result[row2][row2] = result[row1][row1] = getCos(xi, xj);
        result[row2][row1] = getSin(xi, xj);
        result[row1][row2] = -result[row2][row1];
        return result;
    }

    private double getCos(double xi, double xj) {
        return xj / Math.sqrt(xi * xi + xj * xj);
    }

    private double getSin(double xi, double xj) {
        return -xi / Math.sqrt(xi * xi + xj * xj);
    }
}
