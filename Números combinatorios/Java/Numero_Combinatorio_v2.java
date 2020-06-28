package numero_combinatorio_v2;

import java.util.Scanner;

public class Numero_Combinatorio_v2 {

    public static long combinatorio(int n, int k) {
        if (n >= 0 && k == 0) {
            return 1;
        }
        if (n == 0 && k > 0) {
            return 0;
        }
        return combinatorio(n - 1, k - 1) + combinatorio(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese n: ");
        int n = reader.nextInt();
        System.out.printf("Ingrese k: ");
        int k = reader.nextInt();

        if (n <= 0 || k <= 0) {
            System.out.printf("n y k deben ser mayores que cero%n");
        } else if (k > n) {
            System.out.printf("n debe ser mayor o igual que k%n");
        } else {
            System.out.printf("El combinatorio de n en k es %d%n", combinatorio(n, k));
        }
    }
}
