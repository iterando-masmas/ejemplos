/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/reconocimiento-de-notas-musicales-en-ansi-c/
 */
#include <stdio.h>

int main() {
    double frecuencia;
    printf("Ingrese frecuencia (Hz): ");
    scanf("%lf", &frecuencia);

    if (frecuencia == 440)
        printf("A");

    return 0;
}