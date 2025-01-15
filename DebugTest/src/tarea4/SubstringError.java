package tarea4;

/**
 * Esta clase calcula el substring correspondiente a la segunda mitad
 * de las cadenas de prueba. Si la longitud de la cadena es impar, incluye
 * el carácter del medio en la segunda mitad.
 */
public class SubstringError {
    public static void main(String[] args) {
        String[] testCases = {
            "HelloWorld",
            "JavaProgramming",
            "Debugging",
            "Short",
            "EdgeCaseExample"
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            try {
                String result = extractSecondHalf(testCases[i]);
                System.out.println("Second half: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static String extractSecondHalf(String input) {
        return input.substring(5, 15);
    }
}
