/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/suma-de-potencias-de-x-en-java/
 */
package suma_potencias_x;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Suma_Potencias_X_v2 {

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
            double suma = 0;
            for(int i=0; i<n; i++)            
                suma += pow(x, i);               
            System.out.printf("El valor de 1/(1-x) es: %f%n", suma);
        }
    }

}
