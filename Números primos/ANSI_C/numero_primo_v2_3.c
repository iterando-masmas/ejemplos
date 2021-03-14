/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-c/
 */
#include <stdio.h>
#include <math.h>

int main() {
    int n;
    printf("Ingrese un número natural (>0): ");
    scanf("%d", &n);

    if (n <= 0)
        printf("El número debe ser mayor que cero\n");
    else {
        int encontro_divisores = 0;
        int i = 2;
        while (i <= sqrt(n) && !encontro_divisores) {
            if (n % i == 0)
                encontro_divisores = 1;
            i++;
        }
        if (!encontro_divisores && n > 1)
            printf("El número es primo\n");
        else
            printf("El número no es primo\n");
    }
    return 0;
}