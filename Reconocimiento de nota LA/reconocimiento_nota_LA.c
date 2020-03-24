/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: 
 */
#include <stdio.h>
#include <math.h>

int main() {
    int frecuencia;
    printf("Ingrese frecuencia (Hz): ");
    scanf("%d", &frecuencia);

    if (frecuencia == 440)
        printf("La nota leída es LA\n");

    return 0;
}

