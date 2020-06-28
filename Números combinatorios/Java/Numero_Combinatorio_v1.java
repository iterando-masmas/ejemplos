package numero_combinatorio_v1;

import java.util.Scanner;

public class Numero_Combinatorio_v1 {

    public static long factorial(int n) {
        long productoria = 1;
        for (int i = 2; i <= n; i++) {
            productoria *= i;
        }
        return productoria;
    }

    public static long combinatorio(int n, int k) {
        return factorial(n) / (factorial(n - k) * factorial(k));
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
