/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/numero-palindromo-en-c/
 */
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int es_palindromo(int numero);
int cuenta_digitos(int numero);

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
    int total_digitos = cuenta_digitos(numero);
    int mitad = total_digitos / 2;
    int i;
    int factor = pow(10, total_digitos - 1);
    for (i = 1; i <= mitad; i++) {
        int digito_derecha = numero % 10;
        int digito_izquierda = numero / factor;        
        if (digito_derecha != digito_izquierda)
            return 0;
        numero %= factor;        
        numero /= 10;        
        factor /= 100;        
    }
    return 1;
}

int cuenta_digitos(int numero) {
    if (numero == 0)
        return 1;
    return log10(numero) + 1;
}