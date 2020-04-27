/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/pasar-a-mayuscula-minuscula-un-caracter-en-c/
 */
#include<stdio.h>

int main() {
    char c;
    printf("Ingrese un caracter en minúscula: ");
    scanf("%c", &c);

    if (c >= 'a' && c <= 'z')
        c = c - 'a' + 'A';
    printf("En mayúscula es: %c\n", c);

    return 0;
}