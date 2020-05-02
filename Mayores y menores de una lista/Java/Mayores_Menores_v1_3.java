/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/mayores-y-menores-de-un-conjunto-de-numeros-en-java/
 */
package mayores_menores_v1_3;

import java.util.Scanner;

public class Mayores_Menores_v1_3 {

    public static void main(String[] args) {
        int n, i = 0;
        int mayor_magnitud = Integer.MIN_VALUE;
        int menor_magnitud = Integer.MAX_VALUE;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.printf("Ingrese número %d: ", i + 1);
            n = reader.nextInt();

            if (n < 0) {
                break;
            }
            i++;
            if (n > mayor_magnitud) {
                mayor_magnitud = n;
            }
            if (n < menor_magnitud) {
                menor_magnitud = n;
            }
        } while (true);
        if (i == 0) {
            System.out.printf("No se ha ingresado ningún número%n");
        } else {
            System.out.printf("El número con mayor magnitud es: %d%n", mayor_magnitud);
            System.out.printf("El número con menor magnitud es: %d%n", menor_magnitud);
        }
    }
}