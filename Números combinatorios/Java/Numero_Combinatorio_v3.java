/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/numero-combinatorio-en-java/
 */
package numero_combinatorio_v3;

import java.util.Scanner;

public class Numero_Combinatorio_v3 {

    public static long combinatorio(int n, int k) {
        int n_menos_k = n - k;
        int numero_mayor, numero_menor;
        if (k > n_menos_k) {
            numero_mayor = k;
            numero_menor = n_menos_k;
        } else {
            numero_mayor = n_menos_k;
            numero_menor = k;
        }
        long numerador = 1;        
        for (int i = numero_mayor + 1; i <= n; i++) {
            numerador *= i;
        }
        long denominador = 1;
        for (int i = 1; i <= numero_menor; i++) {
            denominador *= i;
        }
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese n: ");
        int n = reader.nextInt();
        System.out.printf("Ingrese k: ");
        int k = reader.nextInt();

        if (n < 0 || k < 0) {
            System.out.printf("n y k deben ser mayores o iguales que cero%n");
        } else if (k > n) {
            System.out.printf("n debe ser mayor o igual que k%n");
        } else {
            System.out.printf("El combinatorio de n en k es %d%n", combinatorio(n, k));
        }
    }
}
