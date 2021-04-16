/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-java/
 */
package descomposicion_factores_primos_v2_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Descomposicion_factores_primos_v2_1 {

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
        int cant_factores = 0;
        do {
            if (n % factor_primo == 0) {
                cant_factores++;
                n /= factor_primo;
            } else {
                if (cant_factores > 0) {
                    if (!primer_factor) {
                        System.out.printf("x");
                    } else {
                        primer_factor = false;
                    }
                    if (cant_factores == 1) {
                        System.out.printf("%d", factor_primo);
                    } else {
                        System.out.printf("%d^%d", factor_primo, cant_factores);
                    }
                    cant_factores = 0;
                }
                factor_primo = siguiente_primo(factor_primo);
            }
        } while (n > 1);
        if (cant_factores > 0) {
            if (!primer_factor) {
                System.out.printf("x");
            } else {
                primer_factor = false;
            }
            if (cant_factores == 1) {
                System.out.printf("%d", factor_primo);
            } else {
                System.out.printf("%d^%d", factor_primo, cant_factores);
            }
            cant_factores = 0;
        }
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