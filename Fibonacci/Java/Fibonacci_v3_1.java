/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-java/
 */
package fibonacci_v3_1;

import java.util.Scanner;

public class Fibonacci_v3_1 {

    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese número de términos: ");
        n = reader.nextInt();

        if (n <= 0) {
            System.out.printf("Debe ingresar un número mayor que cero");
        } else {
            System.out.printf("0 ");
            if (n >= 2) {
                long anterior = 0;
                long actual = 1;
                int i = 2;
                do {
                    long copia_actual = actual;
                    actual = actual + anterior;
                    anterior = copia_actual;
                    System.out.printf("%d ", actual);
                    i++;
                } while (i <= n);
            }
        }
    }
}