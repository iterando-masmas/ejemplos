package suma_potencias_x;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Suma_Potencias_X {

    public static void main(String[] args) {
        double x;
        int n;
        System.out.printf("Ingrese el valor de x(|x|<1): ");
        Scanner reader = new Scanner(System.in);
        x = reader.nextDouble();
        System.out.printf("Ingrese la cantidad de términos: ");
        n = reader.nextInt();

        if (abs(x) >= 1) {
            System.out.printf("Valor de x incorrecto%n");
        } else {
            int i = 0;
            double suma = 0;
            while (i < n) {
                suma += pow(x, i);
                i++;
            }
            System.out.printf("El valor de 1/(1-x) es: %f%n", suma);
        }
    }
}
