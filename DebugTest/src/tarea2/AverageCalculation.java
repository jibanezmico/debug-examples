package tarea2;

/**
 * Esta clase implementa un ejercicio para calcular el promedio de los valores 
 * de un array. El programa realiza la suma de todos los elementos y divide 
 * el total entre el número de elementos del array.
 * 
 * Objetivo:
 * - Recorrer un array de enteros y calcular su promedio.
 * - Manejar correctamente la división para evitar errores como divisiones por cero.
 * 
 * Se espera que el programa:
 * - Calcule el promedio correctamente para cualquier array de números enteros.
 * - Proporcione resultados consistentes en diferentes situaciones.
 * 
 */
public class AverageCalculation {
    public static void main(String[] args) {
        int[][] testCases = {
            {10, 20, 30},
            {5, 15, 25, 35},
            {100, 200, 300, 400},
            {1, 2, 3, 4, 5},
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            try {
                double average = calculateAverage(testCases[i]);
                System.out.println("Average: " + average);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / (numbers.length - 1);
    }
}
