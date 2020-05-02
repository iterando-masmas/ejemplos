/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-java/
 */
package numero_primo_v2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Numero_Primo_v2 {

    public static void main(String[] args) {
        System.out.printf("Ingrese un número natural (>0): ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        if (n <= 0 || n > 20) {
            System.out.printf("El número debe estar entre [1..20]%n");
        } else {
            long factorial = 1;
            int i = 2;
            while (i < n) {
                factorial *= i;
                i++;
            }
            if ((factorial + 1) % n == 0 && n > 1) {
                System.out.printf("El número es primo%n");
            } else {
                System.out.printf("El número no es primo%n");
            }
        }
    }
}