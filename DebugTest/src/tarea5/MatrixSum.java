package tarea5;

/**
 * Esta clase calcula la suma de los elementos en una matriz bidimensional.
 */
public class MatrixSum {
    public static void main(String[] args) {
        int[][][] testCases = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} },
            { {10, 20}, {30, 40} },
            { {50, 60}, {70, 80, 90} },
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            try {
                int result = calculateMatrixSum(testCases[i]);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static int calculateMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
