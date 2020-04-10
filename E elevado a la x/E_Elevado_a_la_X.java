/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/e-elevado-a-la-x-en-java/
 */
package e_elevado_a_la_x;

import static java.lang.Math.pow;
import java.util.Scanner;

public class E_Elevado_a_la_X {

    public static void main(String[] args) {
        double x;
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese el valor de x: ");
        x = reader.nextDouble();
        System.out.printf("Ingrese la cantidad de términos: ");
        n = reader.nextInt();

        if (n >= 23) {
            System.out.printf("La cantidad de términos debe ser menor a 23%n");
        } else {
            int i = 0;
            double sumatoria = 0;
            double factorial = 1;
            do {
                if (i != 0) {
                    factorial *= i;
                }
                sumatoria += pow(x, i) / factorial;
                i++;
            } while (i < n);
            System.out.printf("e^x = %f%n", sumatoria);
        }
    }
}
