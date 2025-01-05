package tarea6;


/**
 * Este programa analiza una lista de números enteros y realiza cálculos condicionales
 * basados en sus valores. Contiene múltiples errores en la lógica, en el manejo 
 * de la lista y en las operaciones aritméticas.
 * 
 * Objetivo: 
 * - Calcular la suma de los números impares de la lista.
 * - Calcular el producto de los números pares de la lista.
 * - Determinar el promedio de los números impares basado en el tamaño total de la lista.
 * - Devolver un resultado final que combina los valores calculados según ciertas condiciones:
 *     - Si el producto de los pares es mayor que 100, devolver la suma del promedio y el producto.
 *     - Si el producto de los pares es 0, devolver el promedio menos 10.
 *     - En otros casos, devolver el resultado de dividir el producto entre la suma de los impares.
 * 
 * Se espera que el programa maneje listas de cualquier tamaño, incluyendo listas vacías
 * y listas que contengan ceros, pares e impares. El programa debe evitar excepciones y
 * generar resultados correctos en todos los casos.
 * 
 * Contiene múltiples errores que afectan tanto la lógica como el flujo de ejecución. 
 *
 */
import java.util.List;

public class ComplexListTask {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 0, 20, 25, 30);

        try {
            int result = processNumbers(numbers);
            System.out.println("Final Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int processNumbers(List<Integer> numbers) {
        int sumOdd = 0;
        int productEven = 1;
        int count = numbers.size();

        for (int i = 0; i <= numbers.size(); i++) { 
            int num = numbers.get(i);

            if (num % 2 == 0) {
                productEven *= num;
            } else {
                sumOdd += num;
            }
        }

        int average = sumOdd / count;

        if (productEven > 100) {
            return average + productEven;
        } else if (productEven == 0) {
            return average - 10;
        } else {
            return productEven / sumOdd;
        }
    }
}
