/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-c/
 */
#include<stdio.h>

int main() {
    int n;
    printf("Ingrese número de términos: ");
    scanf("%d", &n);

    if (n <= 0)
        printf("Debe ingresar un número mayor que cero");
    else {
        if (n >= 1)
            printf("0 ");
        if (n >= 2)
            printf("1 ");
        long anterior = 0;
        long actual = 1;
        int i;
        for (i = 3; i <= n; i++) {
            long copia_actual = actual;
            actual = actual + anterior;
            anterior = copia_actual;
            printf("%ld ", actual);
        }
    }
    return 0;
}