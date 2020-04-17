#include<stdio.h>
#define MAX_FACTORIALES 20

void inicializar_arreglo(long* factorial);

int main() {
    int n;

    long factorial[MAX_FACTORIALES + 1];
    inicializar_arreglo(factorial);

    printf("Ingrese número n (0<=n<=20): ");
    scanf("%d", &n);

    if (n < 0 || n > MAX_FACTORIALES)
        printf("Debe ingresar un número en el rango [0..20]");
    else
        printf("%d!=%li", n, factorial[n]);
    return 0;
}

void inicializar_arreglo(long* factorial) {
    int i;
    factorial[0] = 1;
    for (i = 1; i <= MAX_FACTORIALES; i++)
        factorial[i] = i * factorial[i - 1];
}