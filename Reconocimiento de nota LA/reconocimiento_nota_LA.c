/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/reconocimiento-de-notas-musicales-en-ansi-c/
 */
#include <stdio.h>

int main() {
    int frecuencia;
    printf("Ingrese frecuencia (Hz): ");
    scanf("%d", &frecuencia);

    if (frecuencia == 440)
        printf("La nota leída es LA\n");

    return 0;
}