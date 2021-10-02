/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-c/
 */
#include <stdio.h>

void descomponer_factores(int n);

int main() {
    int n;
    printf("Ingrese un número (>1): ");
    scanf("%d", &n);

    if (n <= 1)
        printf("Debe ingresar un número mayor que uno\n");
    else
        descomponer_factores(n);
    return 0;
}

void descomponer_factores(int n) {
    printf("%d = ", n);
    int factor_primo = 2;
    int primer_factor = 1;
    do {
        if (n % factor_primo == 0) {
            if (primer_factor) {
                printf("%d", factor_primo);
                primer_factor = 0;
            } else
                printf("x%d", factor_primo);
            n /= factor_primo;
        } else
            factor_primo++;
    } while (n > 1);
}