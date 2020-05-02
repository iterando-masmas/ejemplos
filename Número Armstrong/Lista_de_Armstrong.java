package lista_de_armstrong;

import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class Lista_de_Armstrong {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= Integer.MAX_VALUE; i++) {
            if (es_Armstrong(i)) {
                System.out.printf("%d%n", i);
            }
        }
    }

    private static boolean es_Armstrong(int numero) {
        int total_digitos = cuenta_digitos(numero);
        int copia_numero = numero;
        int suma_de_potencias = 0;
        for (int i = 1; i <= total_digitos; i++) {
            int digito = copia_numero % 10;
            copia_numero /= 10;
            suma_de_potencias += pow(digito, total_digitos);
        }
        return numero == suma_de_potencias;
    }

    private static int cuenta_digitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        return (int) (log10(numero) + 1);
    }

}
