/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/fibonacci-en-c/
 */
#include<stdio.h>

long fibonacci(int n) {
    if (n <= 2)
        return n - 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int n;
    printf("Ingrese número de términos: ");
    scanf("%d", &n);

    if (n <= 0)
        printf("Debe ingresar un número mayor que cero");
    else {
        int i;
        for (i = 1; i <= n; i++)
            printf("%ld ", fibonacci(i));
    }
    return 0;
}