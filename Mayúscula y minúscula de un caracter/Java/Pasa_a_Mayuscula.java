/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/pasar-a-mayuscula-minuscula-un-caracter-en-java/
 */
package pasa_a_mayuscula;

import java.util.Scanner;

public class Pasa_a_Mayuscula {

    public static void main(String[] args) {
        char c;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese caracter en minúscula: ");
        c = reader.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            c = (char)(c - (int) 'a' + (int) 'A');
        }
        System.out.printf("En mayúscula es: %c%n", c);
    }
}
