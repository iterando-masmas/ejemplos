/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/numero-armstrong-en-c/
 */
#include <stdio.h>
#include <limits.h>
#include <math.h>

int cuenta_digitos(int numero);
int es_Armstrong(int numero);

int main() {
    int i;
    for (i = 1; i <= INT_MAX; i++)
        if (es_Armstrong(i))
            printf("%d\n", i);
    return 0;
}

int es_Armstrong(int numero) {
    int total_digitos = cuenta_digitos(numero);
    int i;
    int copia_numero = numero;
    int suma_de_potencias = 0;
    for (i = 1; i <= total_digitos; i++) {
        int digito = copia_numero % 10;
        copia_numero /= 10;
        suma_de_potencias += pow(digito, total_digitos);
    }
    return numero == suma_de_potencias;
}

int cuenta_digitos(int numero) {
    if (numero == 0)
        return 1;
    return log10(numero) + 1;
}