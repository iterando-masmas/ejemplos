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
    if (n >= 0 && k == 0)
        return 1;
    if (n == 0 && k > 0)
        return 0;
    return combinatorio(n - 1, k - 1) + combinatorio(n - 1, k);
}

