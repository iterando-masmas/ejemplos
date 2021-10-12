package MCD;

import java.util.Scanner;

public class MCD_Por_Fuerza_Bruta {

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
        int divisor;
        if (a >= b) {
            divisor = b;
        } else {
            divisor = a;
        }
        while (divisor >= 1) {
            if (a % divisor == 0 && b % divisor == 0) {
                return divisor;
            }
            divisor--;
        }
        return 1;
    }
}
