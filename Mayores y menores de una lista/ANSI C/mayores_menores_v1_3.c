/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/mayores-y-menores-de-un-conjunto-de-numeros-en-ansi-c/
 */
#include <stdio.h>
#include <limits.h>

int main() {
    int n, i = 0;
    int mayor_magnitud = INT_MIN;
    int menor_magnitud = INT_MAX;
    do {
        printf("Ingrese número %d: ", i + 1);
        scanf("%d", &n);

        if (n < 0)
            break;
        i++;
        if (n > mayor_magnitud)
            mayor_magnitud = n;
        if (n < menor_magnitud)
            menor_magnitud = n;
    } while (1);
    if (i == 0)
        printf("No se ha ingresado ningún número\n");
    else {
        printf("El número con mayor magnitud es: %d\n", mayor_magnitud);
        printf("El número con menor magnitud es: %d\n", menor_magnitud);
    }
    return 0;
}