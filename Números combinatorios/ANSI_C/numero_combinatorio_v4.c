#include <stdio.h>
#define DIMENSION 20

long combinatorio[DIMENSION][DIMENSION];
void inicializa_arreglo();

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
    else {
        inicializa_arreglo();
        printf("El combinatorio de n en k es %li\n", combinatorio[n][k]);
    }
    return 0;
}

void inicializa_arreglo() {
    int i;
    for (i = 0; i < DIMENSION; i++) {
        combinatorio[0][i] = 0;
        combinatorio[i][0] = 1;
    }
    int n;
    for (n = 1; n < DIMENSION; n++) {
        int k;
        for (k = 1; k <= n; k++)
            combinatorio[n][k] = combinatorio[n - 1][k - 1] + combinatorio[n - 1][k];
    }
}