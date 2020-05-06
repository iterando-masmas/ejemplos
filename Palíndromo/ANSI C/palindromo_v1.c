/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/numero-palindromo-en-c/
 */
#include <stdio.h>
#include <stdlib.h>

int es_palindromo(int numero);
int invierte_numero(int numero);

int main() {
    int numero;
    printf("Ingrese un número: ");
    scanf("%d", &numero);

    numero = abs(numero);
    if (es_palindromo(numero))
        printf("El número es palíndromo");
    else
        printf("El número no es palíndromo");
    return 0;
}

int es_palindromo(int numero) {
    int numero_invertido = invierte_numero(numero);
    return numero == numero_invertido;
}

int invierte_numero(int numero) {
    int numero_invertido = 0;
    while (numero > 0) {
        int digito = numero % 10;
        numero_invertido *= 10;
        numero_invertido += digito;
        numero /= 10;
    }
    return numero_invertido;
}