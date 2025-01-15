package tarea1;

/**
 * Clase que contiene un método que recorre un array de números enteros y suma los valores 
 * que están en posiciones impares
 */
public class ConditionalSum {
    public static void main(String[] args) {
        int[][] testCases = {
            {2, 4, 6, 8},
            {1, 3, 5},
            {10, 20, 30, 40},
            {5, 10, 15, 20, 25},
            {7, 14, 21, 28, 35, 42}
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            try {
                int result = calculateConditionalSum(testCases[i]);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static int calculateConditionalSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) { 
                sum += numbers[i];
            }
        }
        return sum;
    }
}
