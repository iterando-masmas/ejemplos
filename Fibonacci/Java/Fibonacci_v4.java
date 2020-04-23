package fibonacci_v4;

import java.util.Scanner;

public class Fibonacci_v4 {

    public static long fibonacci(int n) {
        if (n <= 2) {
            return n - 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
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
