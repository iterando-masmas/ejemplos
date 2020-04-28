/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/cambio-de-base-en-c/
 */
#include <stdio.h>

void imprime_en_otra_base(int numero, int base);
int encuentra_mayor_potencia_menor_o_igual_a_numero(int numero, int base);
void imprime_digito_en_base(int digito);

int main() {
    int base, numero;
    printf("Ingrese número en base 10: ");
    scanf("%d", &numero);
    printf("Ingrese base: ");
    scanf("%d", &base);

    if (base >= 2 && base <= 36) {
        imprime_en_otra_base(numero, base);
    } else
        printf("Debe ingresar una base entre 2 y 36\n");
    return 0;
}

void imprime_en_otra_base(int numero, int base) {
    int factor = encuentra_mayor_potencia_menor_o_igual_a_numero(numero, base);    
    do {
        int digito = numero / factor;
        imprime_digito_en_base(digito);
        numero %= factor;
        factor /= base;
    } while (factor > 0);
}

int encuentra_mayor_potencia_menor_o_igual_a_numero(int numero, int base) {
    int factor = 1;
    while (factor <= numero)
        factor *= base;
    return factor/base;
}

void imprime_digito_en_base(int digito) {
    if (digito < 10)
        printf("%d", digito);
    else {
        char digito_transformado = digito - 10 + 'A';
        printf("%c", digito_transformado);
    }
}