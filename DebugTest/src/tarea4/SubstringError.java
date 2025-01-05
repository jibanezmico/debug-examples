package tarea4;

/**
 * Esta clase propone un ejercicio para trabajar con substrings de cadenas. 
 * El programa extrae una parte de cada cadena utilizando índices definidos 
 * y muestra el resultado.
 * 
 * Objetivo:
 * - Extraer un substring de cada cadena de entrada basándose en índices definidos.
 * 
 * Se espera que el programa:
 * - Extraiga correctamente un substring de cada cadena, sin generar errores.
 * 
 */
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
