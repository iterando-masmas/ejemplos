/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/suma-de-potencias-de-x-en-ansi-c/
 */
#include <stdio.h>
#include <math.h>

int main() {
    double x;
    int n;
    printf("Ingrese el valor de x(|x|<1): ");
    scanf("%lf", &x);
    printf("Ingrese la cantidad de términos: ");
    scanf("%d", &n);

    if (fabs(x) >= 1)
        printf("Valor de x incorrecto\n");
    else {
        int i;
        double suma = 0;
        for (i = 0; i < n; i++)
            suma += pow(x, i);
        printf("El valor de 1/(1-x) es: %lf\n", suma);
    }
    return 0;
}

