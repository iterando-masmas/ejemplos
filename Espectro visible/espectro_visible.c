/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/validacion-de-rango-del-espectro-de-luz-visible-en-ansi-c/
 */
#include <stdio.h>

int main() {
    double lon_onda;
    printf("Ingrese longitud de onda (nm): ");
    scanf("%lf", &lon_onda);
    
    if (lon_onda>=380 && lon_onda<=780)
        printf("La longitud de onda se encuentra dentro del espectro visible");
    else
        printf("La longitud de onda no se encuentra dentro del espectro visible");
    return 0;
}

