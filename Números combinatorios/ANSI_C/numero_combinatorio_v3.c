#include <stdio.h>

long combinatorio(int n, int k);

int main() {
    int n, k;
    printf("Ingrese n: ");
    scanf("%d", &n);
    printf("Ingrese k: ");
    scanf("%d", &k);

    if (n <= 0 || k <= 0)
        printf("n y k deben ser mayores que cero\n");
    else if (k > n)
        printf("n debe ser mayor o igual que k\n");
    else
        printf("El combinatorio de n en k es %li\n", combinatorio(n, k));
    return 0;
}

long combinatorio(int n, int k) {
    int n_menos_k = n - k;
    int numero_mayor, numero_menor;
    if (k > n_menos_k) {
        numero_mayor = k;
        numero_menor = n_menos_k;
    } else {
        numero_mayor = n_menos_k;
        numero_menor = k;
    }
    long numerador = 1;
    int i;
    for (i = numero_mayor + 1; i <= n; i++)
        numerador *= i;
    long denominador = 1;
    for (i = 1; i <= numero_menor; i++)
        denominador *= i;
    return numerador / denominador;
}

