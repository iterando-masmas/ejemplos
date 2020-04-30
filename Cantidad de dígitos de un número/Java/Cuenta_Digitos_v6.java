package cuenta_digitos_v6;

import static java.lang.Math.abs;
import static java.lang.Math.log;
import java.util.Scanner;

public class Cuenta_Digitos_v6 {

    public static void main(String[] args) {
        int numero, base;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese un número: ");
        numero = reader.nextInt();
        System.out.printf("Ingrese la base: ");
        base = reader.nextInt();

        numero = abs(numero);
        if (base > 1) {
            System.out.printf("El número tiene %d dígito(s) en la base %d%n", cuenta_digitos(numero, base), base);
        } else {
            System.out.printf("La base debe ser mayor que 1\n");
        }
    }

    private static int cuenta_digitos(int numero, int base) {
        if (numero == 0) {
            return 1;
        }
        return (int) (log(numero) / log(base)) + 1;
    }

}
