package fibonacci_v3_2;

import java.util.Scanner;

public class Fibonacci_v3_2 {

    public static long fibonacci(int n) {
        if (n <= 2) {
            return n - 1;
        }
        long anterior = 0;
        long actual = 1;
        int i = 2;
        do {
            long copia_actual = actual;
            actual = actual + anterior;
            anterior = copia_actual;
            i++;
        } while (i < n);
        return actual;
    }

    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese número de términos: ");
        n = reader.nextInt();

        if (n <= 0) {
            System.out.printf("Debe ingresar un número mayor que cero");
        } else {
            int i;
            for (i = 1; i <= n; i++) {
                System.out.printf("%d ", fibonacci(i));
            }
        }
    }
}
