/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/verificacion-de-numeros-primos-en-c/
 */
#include <stdio.h>

int main() {
    int n;
    printf("Ingrese un número natural (>0): ");
    scanf("%d", &n);

    if (n <= 0 || n > 20)
        printf("El número debe estar entre [1..20]\n");
    else {
        long factorial = 1;
        int i = 2;
        while (i < n) {
            factorial *= i;
            i++;
        }
        if ((factorial + 1) % n == 0 && n > 1)
            printf("El número es primo\n");
        else
            printf("El número no es primo\n");
    }
    return 0;
}