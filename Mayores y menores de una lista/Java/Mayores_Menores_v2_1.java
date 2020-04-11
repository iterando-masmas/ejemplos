/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/mayores-y-menores-de-un-conjunto-de-numeros-en-java/
 */
package mayores_menores_v2_1;

import java.util.Scanner;

public class Mayores_Menores_v2_1 {

    public static void main(String[] args) {
        int n, i = 0, mayor_magnitud1, mayor_magnitud2, menor_magnitud1, menor_magnitud2;
        mayor_magnitud1 = mayor_magnitud2 = menor_magnitud1 = menor_magnitud2 = 0;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.printf("Ingrese número %d: ", i + 1);
            n = reader.nextInt();

            if (n < 0) {
                break;
            }
            i++;
            if (i == 1) {
                mayor_magnitud1 = menor_magnitud1 = n;
            } else {
                if (i == 2 || n > mayor_magnitud1 || n > mayor_magnitud2) {
                    if (n > mayor_magnitud1) {
                        mayor_magnitud2 = mayor_magnitud1;
                        mayor_magnitud1 = n;
                    } else {
                        mayor_magnitud2 = n;
                    }
                }
                if (i == 2 || n < menor_magnitud1 || n < menor_magnitud2) {
                    if (n < menor_magnitud1) {
                        menor_magnitud2 = menor_magnitud1;
                        menor_magnitud1 = n;
                    } else {
                        menor_magnitud2 = n;
                    }
                }
            }
        } while (true);
        if (i == 0) {
            System.out.printf("No se ha ingresado ningún número%n");
        } else {
            System.out.printf("El 1er número con mayor magnitud es: %d%n", mayor_magnitud1);
            if (i > 1) {
                System.out.printf("El 2do número con mayor magnitud es: %d%n", mayor_magnitud2);
            }
            System.out.printf("El 1er número con menor magnitud es: %d%n", menor_magnitud1);
            if (i > 1) {
                System.out.printf("El 2do número con menor magnitud es: %d%n", menor_magnitud2);
            }
        }
    }

}
