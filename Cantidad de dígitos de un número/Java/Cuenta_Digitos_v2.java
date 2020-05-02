/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/cantidad-de-digitos-de-un-numero-en-java/
 */
package cuenta_digitos_v2;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Cuenta_Digitos_v2 {

    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese un número: ");
        numero = reader.nextInt();

        numero = abs(numero);
        System.out.printf("El número tiene %d dígito(s)%n", cuenta_digitos(numero));
    }

    private static int cuenta_digitos(int numero) {
        int total_digitos = 0;
        for (; numero > 0; numero /= 10) {
            total_digitos++;
        }
        if (total_digitos == 0) {
            total_digitos++;
        }
        return total_digitos;
    }

}
