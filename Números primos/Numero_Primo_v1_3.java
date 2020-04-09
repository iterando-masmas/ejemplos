package numero_primo_v1_3;

import java.util.Scanner;

public class Numero_Primo_v1_3 {

    public static void main(String[] args) {
        System.out.printf("Ingrese un número natural (>0): ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        if (n <= 0) {
            System.out.printf("El número debe ser mayor que cero%n");
        } else {
            int cant_divisores = 0;
            int mitad=n/2;
            int i = 2;
            while (i <= mitad) {
                if (n % i == 0) {
                    cant_divisores++;
                }
                i++;
            }
            if (cant_divisores == 0 && n>1) {
                System.out.printf("El número es primo%n");
            } else {
                System.out.printf("El número no es primo%n");
            }
        }
    }
}
