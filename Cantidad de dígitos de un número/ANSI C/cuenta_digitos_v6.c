#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int cuenta_digitos(int n, int base);

int main() {
    int numero, base;
    printf("Ingrese un número: ");
    scanf("%d", &numero);
    printf("Ingrese una base: ");
    scanf("%d", &base);

    numero = abs(numero);
    if (base>1)
    printf("El número tiene %d dígito(s) en la base %d\n", cuenta_digitos(numero, base), base);
    else
        printf("La base debe ser mayor que 1\n");
    return 0;
}

int cuenta_digitos(int numero, int base) {
    if (numero == 0)
        return 1;
    return log(numero)/log(base) + 1;
}