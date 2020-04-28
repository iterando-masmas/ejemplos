package cambio_de_base_v_iterativa;

import java.util.Scanner;

public class Cambio_de_Base_v_Iterativa {

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
        int factor = encuentra_mayor_potencia_menor_o_igual_a_numero(numero, base);
        do {
            int digito = numero / factor;
            imprime_digito_en_base(digito);
            numero %= factor;
            factor /= base;
        } while (factor > 0);
    }

    private static int encuentra_mayor_potencia_menor_o_igual_a_numero(int numero, int base) {
        int factor = 1;
        while (factor <= numero) {
            factor *= base;
        }
        return factor / base;
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
