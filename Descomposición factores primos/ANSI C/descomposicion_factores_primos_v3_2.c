/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-c/
 */
#include <stdio.h>
#include <math.h>

int es_primo(int n);
int siguiente_primo(int n);
void descomponer_factores(int n);
void escribe_factor(int *primer_factor, int factor_primo, int *cant_factores);

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
    int cant_factores = 0;
    int primer_factor = 1;
    do {
        if (n % factor_primo == 0) {
            cant_factores++;
            n /= factor_primo;
        } else {
            escribe_factor(&primer_factor, factor_primo, &cant_factores);
            factor_primo = siguiente_primo(factor_primo);
        }
    } while (n > 1);
    escribe_factor(&primer_factor, factor_primo, &cant_factores);
}

void escribe_factor(int *primer_factor, int factor_primo, int *cant_factores) {
    if (*cant_factores > 0) {
        if (!*primer_factor)
            printf("x");
        else
            *primer_factor = 0;
        if (*cant_factores == 1)
            printf("%d", factor_primo);
        else
            printf("%d^%d", factor_primo, *cant_factores);
        *cant_factores = 0;
    }
}

int es_primo(int n) {
    if (n <= 1)
        return 0;
    int encontro_divisores = 0;
    int i = 2;
    while (i <= sqrt(n) && !encontro_divisores) {
        if (n % i == 0)
            encontro_divisores = 1;
        i++;
    }
    return !encontro_divisores;
}

int siguiente_primo(int n) {
    do {
        n++;
    } while (!es_primo(n));
    return n;
}