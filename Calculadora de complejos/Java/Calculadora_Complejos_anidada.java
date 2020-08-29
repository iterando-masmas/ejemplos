/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 */
package calculadora_complejos;

import static java.lang.Double.NaN;
import java.util.Scanner;

public class Calculadora_Complejos {

    public static void main(String[] args) {
        char operacion;
        double par_real1, par_imag1, par_real2, par_imag2;

        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese operación (+,-,*): ");
        operacion = reader.next().charAt(0);
        System.out.printf("Ingrese parte real del número 1: ");
        par_real1 = reader.nextDouble();
        System.out.printf("Ingrese parte imaginaria del número 1: ");
        par_imag1 = reader.nextDouble();
        System.out.printf("Ingrese parte real del número 2: ");
        par_real2 = reader.nextDouble();
        System.out.printf("Ingrese parte imaginaria del número 2: ");
        par_imag2 = reader.nextDouble();

        boolean operacion_valida = true;
        double par_real = NaN, par_imag = NaN, denominador;
        if (operacion == '+') {
            par_real = par_real1 + par_real2;
            par_imag = par_imag1 + par_imag2;
        } else if (operacion == '-') {
            par_real = par_real1 - par_real2;
            par_imag = par_imag1 - par_imag2;
        } else if (operacion == '*') {
            par_real = par_real1 * par_real2 - par_imag1 * par_imag2;
            par_imag = par_real1 * par_imag2 + par_imag1 * par_real2;
        } else {
            operacion_valida = false;
            System.out.printf("La operación no es válida%n");
        }

        if (operacion_valida) {
            System.out.printf("El resultado es: %.3f + %.3fi%n", par_real, par_imag);
        }
    }
}
