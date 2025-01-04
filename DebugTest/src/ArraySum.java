

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {Integer.MAX_VALUE, 1, 2, 3};
        System.out.println("Sum: " + calculateSum(numbers));
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}