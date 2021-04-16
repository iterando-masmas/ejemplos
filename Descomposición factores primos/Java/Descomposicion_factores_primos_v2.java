/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-java/
 */
package descomposicion_factores_primos_v1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Descomposicion_factores_primos_v1 {

    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese un número (>1): ");
        n = reader.nextInt();

        if (n <= 1) {
            System.out.printf("Debe ingresar un número mayor que uno%n");
        } else {
            descomponer_factores(n);
        }
    }

    private static void descomponer_factores(int n) {
        System.out.printf("%d = ", n);
        int factor_primo = 2;
        boolean primer_factor = true;
        do {
            if (n % factor_primo == 0) {
                if (primer_factor) {
                    System.out.printf("%d", factor_primo);
                    primer_factor = false;
                } else {
                    System.out.printf("x%d", factor_primo);
                }
                n /= factor_primo;
            } else {
                factor_primo = siguiente_primo(factor_primo);
            }
        } while (n > 1);
    }

    private static int siguiente_primo(int n) {
        do {
            n++;
        } while (!es_primo(n));
        return n;
    }

    private static boolean es_primo(int n) {
        if (n <= 1) {
            return false;
        }
        boolean encontro_divisores = false;
        int i = 2;
        while (i <= sqrt(n) && !encontro_divisores) {
            if (n % i == 0) {
                encontro_divisores = true;
            }
            i++;
        }
        return !encontro_divisores;
    }
}