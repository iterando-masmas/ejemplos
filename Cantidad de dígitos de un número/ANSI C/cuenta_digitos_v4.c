/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/cantidad-de-digitos-de-un-numero-en-c/
 */
#include <stdio.h>
#include <stdlib.h>

int cuenta_digitos(int n);

int main() {
    int numero;
    printf("Ingrese un número: ");
    scanf("%d", &numero);

    numero = abs(numero);
    printf("El número tiene %d dígito(s)\n", numero == 0 ? 1 : cuenta_digitos(numero));
    return 0;
}

int cuenta_digitos(int numero) {    
    if (numero == 0)
        return 0;
    return 1 + cuenta_digitos(numero / 10);
}