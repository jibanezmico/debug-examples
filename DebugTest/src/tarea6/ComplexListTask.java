package tarea6;

import java.util.List;

/**
 * Esta clase procesa una lista de números enteros y realiza operaciones
 * sobre los elementos impares y pares. Devuelve un resultado basado en
 * las siguientes condiciones:
 * 
 * 1. Suma los valores impares de la lista.
 * 2. Calcula el producto de los valores pares, excluyendo el número 0.
 * 3. Calcula el promedio de los valores impares como la suma impar dividida
 *    entre el número total de elementos de la lista.
 * 
 * El resultado final se determina según estas reglas:
 * - Si el producto de los números pares es mayor que 100, el resultado será
 *   la suma del promedio de los impares más el producto de los pares.
 * - Si el producto de los números pares es igual a 1 (es decir, no hay pares
 *   válidos en la lista), el resultado será el promedio de los impares menos 10.
 * - En cualquier otro caso, el resultado será el cociente del producto de los
 *   números pares dividido entre la suma de los impares.
 * 
 * Casos especiales:
 * - Si la lista está vacía, se lanza una excepción con el mensaje:
 *   "La lista no puede estar vacía."
 * - Si la suma de los números impares es 0, se lanza una excepción con el
 *   mensaje: "No se puede calcular el promedio con suma impar igual a cero."
 */
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
