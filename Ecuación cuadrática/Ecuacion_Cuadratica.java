/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: 
 */
package ecuacion_cuadratica;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ecuacion_Cuadratica {

    public static void main(String[] args) {
        int a, b, c;
        double discriminante;

        System.out.printf("Ingrese coeficientes a, b y c de la ecuación: ");
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();

        discriminante = pow(b, 2) - 4 * a * c;
        if (discriminante >= 0) {
            if (discriminante == 0) {
                double x = -b / 2 * a;
                System.out.printf("La raíz única es %.3f%n", x);
            } else {
                double x1, x2;
                x1 = (-b + sqrt(discriminante)) / (2 * a);
                x2 = (-b - sqrt(discriminante)) / (2 * a);
                System.out.printf("La raíz real x1 es %.3f%n", x1);
                System.out.printf("La raíz real x2 es %.3f%n", x2);
            }
        } else {
            double parteReal, parteImaginaria;
            discriminante = abs(discriminante);
            parteReal = -b / (2 * a);
            parteImaginaria = sqrt(discriminante) / (2 * a);
            System.out.printf("La raíz compleja x1 es %.3f + %.3fi%n", parteReal, parteImaginaria);
            System.out.printf("La raíz compleja x2 es %.3f - %.3fi%n", parteReal, parteImaginaria);
        }
    }

}
