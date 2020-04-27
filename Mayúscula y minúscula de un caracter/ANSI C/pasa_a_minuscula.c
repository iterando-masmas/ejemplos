/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: 
 */
#include<stdio.h>

int main() {
    char c;
    printf("Ingrese un caracter en mayúscula: ");
    scanf("%c", &c);

    if (c >= 'A' && c <= 'Z')
        c = c - 'A' + 'a';
    printf("En minúscula es: %c\n", c);

    return 0;
}