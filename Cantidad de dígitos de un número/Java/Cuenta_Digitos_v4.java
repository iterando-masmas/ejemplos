package cuenta_digitos_v4;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Cuenta_Digitos_v4 {

    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese un número: ");
        numero = reader.nextInt();

        numero = abs(numero);
        System.out.printf("El número tiene %d dígito(s)%n", numero == 0 ? 1 : cuenta_digitos(numero));
    }

    private static int cuenta_digitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return 1 + cuenta_digitos(numero / 10);
    }

}
