/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-java/
 */
package numero_primo_v1_4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Numero_Primo_v1_4 {

    public static void main(String[] args) {
        System.out.printf("Ingrese un número natural (>0): ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        if (n <= 0) {
            System.out.printf("El número debe ser mayor que cero%n");
        } else {
            int cant_divisores = 0;
            boolean encontro_divisores = false;
            int mitad = (int) sqrt(n);
            int i = 2;
            while (i <= mitad && !encontro_divisores) {
                if (n % i == 0) {
                    cant_divisores++;
                    encontro_divisores = true;
                }
                i++;
            }
            if (cant_divisores == 0 && n > 1) {
                System.out.printf("El número es primo%n");
            } else {
                System.out.printf("El número no es primo%n");
            }
        }
    }
}
