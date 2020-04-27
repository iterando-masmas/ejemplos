/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: 
 */
package pasa_a_minuscula;

import java.util.Scanner;

public class Pasa_a_Minuscula {

    public static void main(String[] args) {
        char c;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese caracter en mayúscula: ");
        c = reader.next().charAt(0);

        if (c >= 'A' && c <= 'Z') {
            c = (char)(c - (int) 'A' + (int) 'a');
        }
        System.out.printf("En minúscula es: %c%n", c);
    }
    
}
