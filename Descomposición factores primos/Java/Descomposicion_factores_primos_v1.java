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
        int productoria = 1;
        int copia_n = n;
        int factor_primo = 2;
        do {
            int resto = copia_n % factor_primo;
            if (resto == 0) {
                if (productoria > 1) {
                    System.out.printf("x");
                }
                System.out.printf("%d", factor_primo);
                copia_n /= factor_primo;
                productoria *= factor_primo;
            } else {
                factor_primo = siguiente_primo(factor_primo);
            }
        } while (productoria != n);
    }

    private static int siguiente_primo(int n) {
        do {
            n++;
        } while (!es_primo(n));
        return n;
    }

    private static boolean es_primo(int n) {
        if (n <= 0) {
            return false;
        }
        int cant_divisores = 0;
        boolean encontro_divisores = false;
        int limite = (int) sqrt(n);
        int i = 2;
        while (i <= limite && !encontro_divisores) {
            if (n % i == 0) {
                cant_divisores++;
                encontro_divisores = true;
            }
            i++;
        }
        if (cant_divisores > 0 || n == 1) {
            return false;
        }
        return true;
    }
}
