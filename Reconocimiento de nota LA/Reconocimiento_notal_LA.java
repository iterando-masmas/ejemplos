/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: 
 */
package reconocimiento_notal_la;

import java.util.Scanner;

public class Reconocimiento_notal_LA {

    public static void main(String[] args) {
        int frecuencia;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese frecuencia (Hz): ");
        frecuencia = reader.nextInt();

        if (frecuencia == 440) {
            System.out.printf("La nota leída es LA%n");
        }
    }

}
