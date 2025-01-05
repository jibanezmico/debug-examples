package tarea5;

/**
 * Este ejercicio se centra en el cálculo de la suma de elementos en una matriz
 * bidimensional. El programa recorre la matriz fila por fila, suma los elementos
 * y devuelve el total.
 * 
 * Objetivo:
 * - Recorrer una matriz bidimensional y calcular la suma total de sus elementos.
 * 
 * Se espera que el programa:
 * - Sume correctamente todos los elementos de la matriz.
 * - Maneje matrices de diferentes tamaños, incluidas aquellas con filas de longitudes
 *   distintas.
 * 
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
