/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/factorial-en-java/
 */
package factorial_v2;

import java.util.Scanner;

public class Factorial_v2 {

    public static long factorial(int n) {
        long productoria = 1;
        int i = 1;
        do {
            productoria *= i;
            i++;
        } while (i <= n);
        return productoria;
    }

    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese número n (0<=n<=20): ");
        n = reader.nextInt();

        if (n < 0 || n > 20) {
            System.out.printf("Debe ingresar un número en el rango [0..20]");
        } else {
            System.out.printf("%d!=%d%n", n, factorial(n));
        }
    }

}