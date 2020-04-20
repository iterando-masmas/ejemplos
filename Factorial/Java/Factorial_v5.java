/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/factorial-en-java/
 */
package factorial_v5;

import java.util.Scanner;

public class Factorial_v5 {

    private static final int MAX_FACTORIALES = 20;
    private static long[] factorial;

    public static void inicializar_arreglo() {
        int i;
        factorial[0] = 1;
        for (i = 1; i <= MAX_FACTORIALES; i++) {
            factorial[i] = i * factorial[i - 1];
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese número n (0<=n<=20): ");
        n = reader.nextInt();

        if (n < 0 || n > 20) {
            System.out.printf("Debe ingresar un número en el rango [0..20]");
        } else {
            factorial = new long[21];
            inicializar_arreglo();
            System.out.printf("%d!=%d%n", n, factorial[n]);
        }
    }

}
