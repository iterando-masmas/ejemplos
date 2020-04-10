/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/e-elevado-a-la-x-en-c/
 */
#include <stdio.h>
#include <math.h>

int main() {
    double x;
    int n;
    printf("Ingrese el valor de x: ");
    scanf("%lf", &x);
    printf("Ingrese la cantidad de términos: ");
    scanf("%d", &n);

    if (n >= 24)
        printf("La cantidad de términos debe ser menor a 24\n");
    else {
        int i = 0;
        double sumatoria = 0;
        double factorial = 1;
        do {
            if (i != 0)
                factorial *= i;
            sumatoria += pow(x, i) / factorial;
            i++;
        } while (i < n);
        printf("e^x = %lf\n", sumatoria);
    }
    return 0;
}

