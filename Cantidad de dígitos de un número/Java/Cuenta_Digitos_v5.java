package cuenta_digitos_v5;

import static java.lang.Math.abs;
import static java.lang.Math.log10;
import java.util.Scanner;

public class Cuenta_Digitos_v5 {

    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese un número: ");
        numero = reader.nextInt();

        numero = abs(numero);
        System.out.printf("El número tiene %d dígito(s)%n", cuenta_digitos(numero));
    }

    private static int cuenta_digitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        return (int)log10(numero) + 1;
    }

}
