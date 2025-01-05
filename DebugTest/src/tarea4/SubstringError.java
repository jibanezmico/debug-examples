package tarea4;

public class SubstringError {
    public static void main(String[] args) {
        String[] testCases = {
            "HelloWorld",
            "JavaProgramming",
            "Debugging",
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            try {
                String result = extractSubstring(testCases[i]);
                System.out.println("Substring: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static String extractSubstring(String input) {
        return input.substring(5, 15);
    }
}
