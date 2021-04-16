package MCD;

import java.util.Scanner;

public class MCD_Por_Sumas_y_Restas {

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
        while (true) {
            if (b < a) {
                int aux = a;
                a = b;
                b = aux;
            }
            if (a == 0) {
                return b;
            } else {
                b -= a;
            }
        }
    }

}
