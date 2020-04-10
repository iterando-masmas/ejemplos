/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: 
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
        int i = 0;
        double suma = 0;
        while (i < n) {
            suma += pow(x, i);
            i++;
        }
        printf("El valor de 1/(1-x) es: %lf\n", suma);
    }
    return 0;
}
