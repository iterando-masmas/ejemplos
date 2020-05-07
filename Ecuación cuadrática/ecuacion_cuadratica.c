/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/raices-de-la-ecuacion-cuadratica-en-c/
 */
#include <stdio.h>
#include <math.h>

int main() {
    double a, b, c;
    double discriminante;

    printf("Ingrese coeficientes a, b y c de la ecuación: ");
    scanf("%lf %lf %lf", &a, &b, &c);

    discriminante = pow(b, 2) - 4 * a*c;
    if (discriminante >= 0)
        if (discriminante == 0) {
            double x = -b / 2 * a;
            printf("La raíz única es %.3lf\n", x);
        } else {
            double x1, x2;
            x1 = (-b + sqrt(discriminante)) / (2 * a);
            x2 = (-b - sqrt(discriminante)) / (2 * a);
            printf("La raíz real x1 es %.3lf\n", x1);
            printf("La raíz real x2 es %.3lf\n", x2);
        } 
    else {
        double parteReal, parteImaginaria;
        discriminante = fabs(discriminante);
        parteReal = -b / (2 * a);
        parteImaginaria = sqrt(discriminante) / (2 * a);
        printf("La raíz compleja x1 es %.3lf + %.3lfi\n", parteReal, parteImaginaria);
        printf("La raíz compleja x2 es %.3lf - %.3lfi\n", parteReal, parteImaginaria);
    }
    return 0;
}