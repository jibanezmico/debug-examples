package tarea3;

/**
 * Esta clase compara dos cadenas para verificar si tienen el mismo contenido,
 * diferenciando entre mayúsculas y minúsculas (por ejemplo, "apple" y "APPLE"
 * no son iguales).
 */
public class StringComparison {
    public static void main(String[] args) {
        // Casos de prueba
        String[][] testCases = {
            {"apple", "apple"},
            {"banana", new String("banana")},
            {"cherry", "CHERRY"},
            {new String("date"), new String("date")}
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
