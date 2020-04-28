package cambio_de_base_v_recursiva;

import java.util.Scanner;

public class Cambio_de_Base_v_Recursiva {

    public static void main(String[] args) {
        int base, numero;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese número en base 10: ");
        numero = reader.nextInt();
        System.out.printf("Ingrese base: ");
        base = reader.nextInt();

        if (base >= 2 && base <= 36) {
            imprime_en_otra_base(numero, base);
        } else {
            System.out.printf("Debe ingresar una base entre 2 y 36%n");
        }
    }

    private static void imprime_en_otra_base(int numero, int base) {
        if (numero > 0) {
            int digito = numero % base;
            numero /= base;
            imprime_en_otra_base(numero, base);
            imprime_digito_en_base(digito);
        }
    }

    private static void imprime_digito_en_base(int digito) {
        if (digito < 10) {
            System.out.printf("%d", digito);
        } else {
            char digito_transformado = (char) (digito - 10 + (int) 'A');
            System.out.printf("%c", digito_transformado);
        }
    }

}
