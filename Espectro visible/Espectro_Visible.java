/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/validacion-de-rango-del-espectro-de-luz-visible-en-java/
 */
package espectro_visible;

import java.util.Scanner;

public class Espectro_Visible {

    public static void main(String[] args) {
        double lon_onda;

        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese longitud de onda (nm): ");
        lon_onda = reader.nextDouble();

        if (lon_onda >= 380 && lon_onda <= 780) {
            System.out.printf("La longitud de onda se encuentra dentro del espectro visible");
        } else {
            System.out.printf("La longitud de onda no se encuentra dentro del espectro visible");
        }
    }

}