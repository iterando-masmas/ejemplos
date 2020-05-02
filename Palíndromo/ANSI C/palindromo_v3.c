#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int es_palindromo(int numero);
int cuenta_digitos(int numero);
int es_palindromo_recursivo(int numero, int factor);

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
    int factor = pow(10, total_digitos - 1);
    return es_palindromo_recursivo(numero, factor);
}

int es_palindromo_recursivo(int numero, int factor) {
    if (numero >= 0 && numero <= 9)
        return 1;

    int digito_derecha = numero % 10;
    int digito_izquierda = numero / factor;
    if (digito_derecha != digito_izquierda)
        return 0;
    
    numero %= factor;
    numero /= 10;
    factor /= 100;
    return es_palindromo_recursivo(numero, factor);
}

int cuenta_digitos(int numero) {
    if (numero == 0)
        return 1;
    return log10(numero) + 1;
}