package cuenta_digitos_v1;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Cuenta_Digitos_v1 {

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
        while (numero > 0) {
            total_digitos++;
            numero /= 10;
        }
        if (total_digitos == 0) {
            total_digitos++;
        }
        return total_digitos;
    }

}
