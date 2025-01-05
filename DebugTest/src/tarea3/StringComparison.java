package tarea3;

public class StringComparison {
    public static void main(String[] args) {
        String[][] testCases = {
            {"apple", "apple"},
            {"banana", "banana"},
            {"cherry", "CHERRY"},
            {"date", "DATE"}
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            boolean result = compareStrings(testCases[i][0], testCases[i][1]);
            System.out.println("Strings are equal: " + result);
        }
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1 == str2;
    }
}
