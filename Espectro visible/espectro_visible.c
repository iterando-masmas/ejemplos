/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: 
 */
#include <stdio.h>
#include <math.h>

int main() {
    double lon_onda;
    printf("Ingrese longitud de onda (nm): ");
    scanf("%lf", &lon_onda);
    
    if (lon_onda>=380 && lon_onda<=780)
        printf("La longitud de onde se encuentra dentro del espectro visible");
    else
        printf("La longitud de onde no se encuentra dentro del espectro visible");
    return 0;
}

