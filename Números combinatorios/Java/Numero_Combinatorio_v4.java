/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/numero-combinatorio-en-java/
 */
package numero_combinatorio_v4;

import java.util.Scanner;

public class Numero_Combinatorio_v4 {

    private static final int DIMENSION = 20;
    private static long combinatorio[][];

    public static void inicializar_arreglo() {
        for (int i = 0; i < DIMENSION; i++) {            
            combinatorio[i][0] = 1;
            combinatorio[i][i] = 1;
        }
        for (int n = 1; n < DIMENSION; n++) {
            for (int k = 1; k <= n-1; k++) {
                combinatorio[n][k] = combinatorio[n - 1][k - 1] + combinatorio[n - 1][k];
            }
        }
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
            combinatorio = new long[DIMENSION][DIMENSION];
            inicializar_arreglo();
            System.out.printf("El combinatorio de n en k es %d%n", combinatorio[n][k]);
        }
    }
}
