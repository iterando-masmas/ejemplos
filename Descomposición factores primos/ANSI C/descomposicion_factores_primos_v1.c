/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/descomposicion-en-factores-primos-en-c/
 */
 #include <stdio.h>
#include <math.h>

int es_primo(int n);
int siguiente_primo(int n);
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

int es_primo(int n) {
    if (n <= 0)
        return 0;
    int cant_divisores = 0;
    int encontro_divisores = 0;
    int limite = sqrt(n);
    int i = 2;
    while (i <= limite && !encontro_divisores) {
        if (n % i == 0) {
            cant_divisores++;
            encontro_divisores = 1;
        }
        i++;
    }
    if (cant_divisores > 0 || n == 1)
        return 0;
    return 1;
}

int siguiente_primo(int n) {
    do {
        n++;
    } while (!es_primo(n));
    return n;
}

void descomponer_factores(int n) {
    int productoria = 1;
    int copia_n = n;
    int factor_primo = 2;
    do {        
        int resto = copia_n % factor_primo;                
        if (resto == 0) {
            if (productoria > 1)
                printf("x");
            printf("%d", factor_primo);
            copia_n /= factor_primo;
            productoria *= factor_primo;
        } else
            factor_primo = siguiente_primo(factor_primo);
    } while (productoria != n);
}