/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/reconocimiento-de-notas-musicales-en-java/
 */
package reconocimieneto_nota;

import java.util.Scanner;

public class Reconocimiento_nota {

    public static void main(String[] args) {
        double frecuencia;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese frecuencia (Hz): ");
        frecuencia = reader.nextDouble();

        if (frecuencia == 440) {
            System.out.printf("A");
        }
    }
}
