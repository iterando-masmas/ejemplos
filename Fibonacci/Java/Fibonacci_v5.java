/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-java/
 */
package fibonacci_v5;

import java.util.Scanner;

public class Fibonacci_v5 {

    private static final int MAX_TERMINOS = 93;
    private static long[] fibonacci;

    public static void inicializar_arreglo() {
        fibonacci[1] = 0;
        fibonacci[2] = 1;
        for (int i = 3; i <= MAX_TERMINOS; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese número de términos: ");
        n = reader.nextInt();

        if (n <= 0) {
            System.out.printf("Debe ingresar un número mayor que cero");
        } else {
            fibonacci = new long[MAX_TERMINOS+1];
            inicializar_arreglo();
            int i;
            for (i = 1; i <= n; i++) {
                System.out.printf("%d ", fibonacci[i]);
            }
        }
    }
}
