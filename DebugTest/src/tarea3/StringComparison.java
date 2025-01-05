package tarea3;

/**
 * Este ejercicio plantea un problema relacionado con la comparación de cadenas en Java.
 * El programa verifica si dos cadenas son iguales utilizando una condición específica.
 * 
 * Objetivo:
 * - Comparar dos cadenas y determinar si son iguales en contenido.
 * 
 * Se espera que el programa:
 * - Devuelva "true" si las cadenas tienen el mismo contenido y "false" en caso contrario.
 * - Maneje correctamente tanto cadenas idénticas como cadenas que difieren en mayúsculas, 
 *   minúsculas u otros caracteres.
 * 
 */
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
