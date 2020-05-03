/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/cantidad-de-digitos-de-un-numero-en-c/
 */
#include <stdio.h>
#include <stdlib.h>

int cuenta_digitos(int numero);

int main() {
    int numero;
    printf("Ingrese un número: ");
    scanf("%d", &numero);

    numero = abs(numero);
    printf("El número tiene %d dígito(s)\n", cuenta_digitos(numero));
    return 0;
}

int cuenta_digitos(int numero) {
    int total_digitos = 0;
    for (; numero > 0; numero /= 10)
        total_digitos++;
    if (total_digitos == 0)
        total_digitos++;
    return total_digitos;
}