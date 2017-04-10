/**
 * Created by vahriin on 3/25/17.
 */
public class Jacobi {
    private final double accuracy = 1E-2;

    public Jacobi(double[][] newMatrix) {
        matrix = newMatrix;
    }

    public double[] solveOfEquation(double[] column) {
        double[] previousVariableValues = new double[]{0,0,0};

        while (true) {
            double[] currentVariableValues = new double[Constants.DIM];

            for (int i = 0; i < Constants.DIM; i++) {
                currentVariableValues[i] = column[i];
                for (int j = 0; j < Constants.DIM; j++) {
                    if (i != j) {
                        currentVariableValues[i] -= matrix[i][j] * previousVariableValues[j];
                    }
                }
                currentVariableValues[i] /= matrix[i][i];
            }

            double error = 0.0;

            for (int i = 0; i < Constants.DIM; i++) {
                error += Math.abs(currentVariableValues[i] - previousVariableValues[i]);
            }

            if (error < accuracy) {
                break;
            }
            previousVariableValues = currentVariableValues;
        }
        return previousVariableValues;
    }

    private double[][] matrix;
}
