#include<stdio.h>

long fibonacci(int n) {
    if (n <= 2)
        return n - 1;
    long anterior = 0;
    long actual = 1;
    int i = 2;
    do {
        long copia_actual = actual;
        actual = actual + anterior;
        anterior = copia_actual;
        i++;
    } while (i < n);
    return actual;
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