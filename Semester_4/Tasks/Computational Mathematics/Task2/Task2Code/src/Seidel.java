/**
 * Created by vahriin on 3/31/17.
 */
public class Seidel {
    private final double accuracy = 1E-6;
    public int numberOfIterations = 0;

    public Seidel(double[][] matrix_) {
        matrix = matrix_;
    }

    public double[] solveOfEquation(double[] column) {
        double[] previousVariableValues = {0,0,0};

        while (true) {
            double[] currentVariableValues = new double[Constants.DIM];
            for (int i = 0; i < Constants.DIM; i++) {
                currentVariableValues[i] = column[i];
                for (int j = 0; j < Constants.DIM; j++) {
                    if (j < i) {
                        currentVariableValues[i] -= matrix[i][j] * currentVariableValues[j];
                    } else if (j > i) {
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
            ++numberOfIterations;
        }
        return previousVariableValues;
    }

    private double[][] matrix;
}
