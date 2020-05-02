package palindromo_v1;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Palindromo_v1 {

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
        int numero_invertido = invierte_numero(numero);
        return numero == numero_invertido;
    }

    private static int invierte_numero(int numero) {
        int numero_invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            numero_invertido *= 10;
            numero_invertido += digito;
            numero /= 10;
        }
        return numero_invertido;
    }
}
