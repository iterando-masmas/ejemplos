/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-c/
 */
#include <stdio.h>

int main() {
    int n;
    printf("Ingrese un número natural (>0): ");
    scanf("%d", &n);

    if (n <= 0)
        printf("El número debe ser mayor que cero\n");
    else {
        int cant_divisores = 0;
        int i = 1;
        while (i <= n) {
            if (n % i == 0)
                cant_divisores++;
            i++;
        }
        if (cant_divisores==2)
            printf("El número es primo\n");
        else
            printf("El número no es primo\n");
    }
    return 0;
}