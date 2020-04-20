/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/factorial-en-c/
 */
#include<stdio.h>

long factorial(int n);

int main() {
    int n;
    printf("Ingrese número n (0<=n<=20): ");
    scanf("%d", &n);

    if (n < 0 || n > 20)
        printf("Debe ingresar un número en el rango [0..20]");
    else
        printf("%d!=%li", n, factorial(n));
    return 0;
}

long factorial(int n) {
    long productoria = 1;
    int i = 1;
    do {
        productoria *= i;
        i++;
    } while (i <= n);
    return productoria;
}