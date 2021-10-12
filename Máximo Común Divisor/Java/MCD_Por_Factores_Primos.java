package MCD;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class MCD_Por_Factores_Primos {

    public void main(String[] args) {
        System.out.printf("Ingrese dos números: ");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        if (a > 0 && b > 0) {
            System.out.printf("El MCD(%d,%d)=%d", a, b, MCD(a, b));
        } else {
            System.out.printf("Números inválidos");
        }
    }

    int MCD(int a, int b) {
        int factor = 2;
        int producto = 1;
        while (factor <= a && factor <= b) {
            if (a % factor == 0 || b % factor == 0) {
                if (a % factor == 0 && b % factor == 0) {
                    producto *= factor;
                }
                if (a % factor == 0) {
                    a /= factor;
                }
                if (b % factor == 0) {
                    b /= factor;
                }
            } else {
                factor = siguiente_primo(factor);
            }
        }
        return producto;
    }
    
    private static int siguiente_primo(int n) {
        do {
            n++;
        } while (!es_primo(n));
        return n;
    }

    private static boolean es_primo(int n) {
        if (n <= 1) {
            return false;
        }
        boolean encontro_divisores = false;
        int i = 2;
        while (i <= sqrt(n) && !encontro_divisores) {
            if (n % i == 0) {
                encontro_divisores = true;
            }
            i++;
        }
        return !encontro_divisores;
    }
}
