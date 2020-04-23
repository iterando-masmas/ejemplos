#include<stdio.h>
#define MAX_TERMINOS 93

void inicializar_arreglo(long *fibonacci) {
    fibonacci[1] = 0;
    fibonacci[2] = 1;
    int i;
    for (i = 3; i <= MAX_TERMINOS; i++)
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
}

int main() {
    int n;
    long fibonacci[MAX_TERMINOS + 1];

    printf("Ingrese número de términos: ");
    scanf("%d", &n);

    if (n <= 0 || n > 93)
        printf("Debe ingresar un número en el rango [0..93]");
    else {
        inicializar_arreglo(fibonacci);
        int i;
        for (i = 1; i <= n; i++)
            printf("%ld ", fibonacci[i]);
    }
    return 0;
}