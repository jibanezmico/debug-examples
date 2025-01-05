package tarea1;

public class ArrayIndexCalculation {
    public static void main(String[] args) {
        // Test cases
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
                int result = calculateSpecialSum(testCases[i]);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static int calculateSpecialSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int index = (i + 1) % numbers.length;
            sum += numbers[index] - numbers[i];
        }
        return sum;
    }
}
