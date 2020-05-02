package palindromo_v2;

import static java.lang.Math.abs;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Palindromo_v2 {

    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese un número: ");
        numero = reader.nextInt();

        numero = abs(numero);
        if (es_palindromo(numero)) {
            System.out.printf("El número es palíndromo%n");
        } else {
            System.out.printf("El número no es palíndromo%n");
        }
    }

    private static boolean es_palindromo(int numero) {
        int total_digitos = cuenta_digitos(numero);
        int mitad = total_digitos / 2;
        int i;
        int factor = (int) pow(10, total_digitos - 1);
        for (i = 1; i <= mitad; i++) {
            int digito_derecha = numero % 10;
            int digito_izquierda = numero / factor;
            if (digito_derecha != digito_izquierda) {
                return false;
            }
            numero %= factor;
            numero /= 10;
            factor /= 100;
        }
        return true;
    }

    private static int cuenta_digitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        return (int) (log10(numero) + 1);
    }
}
