/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: 
 */
#include <stdio.h>
#include <math.h>

int main() {
    char operacion;
    double par_real1, par_imag1, par_real2, par_imag2;

    printf("Ingrese operación (+,-,*,/):");
    scanf("%c", &operacion);
    printf("Ingrese parte real del número 1: ");
    scanf("%lf", &par_real1);
    printf("Ingrese parte imaginaria del número 1: ");
    scanf("%lf", &par_imag1);
    printf("Ingrese parte real del número 2: ");
    scanf("%lf", &par_real2);
    printf("Ingrese parte imaginaria del número 2: ");
    scanf("%lf", &par_imag2);

    int division_por_cero = 0;
    int operacion_valida = 1;
    double par_real, par_imag, denominador;
    switch (operacion) {
        case '+':
            par_real = par_real1 + par_real2;
            par_imag = par_imag1 + par_imag2;
            break;
        case '-':
            par_real = par_real1 - par_real2;
            par_imag = par_imag1 - par_imag2;
            break;
        case '*':
            par_real = par_real1 * par_real2 - par_imag1*par_imag2;
            par_imag = par_real1 * par_imag2 + par_imag1*par_real2;
            break;
        case '/':
            denominador = pow(par_real2, 2) + pow(par_imag2, 2);
            if (denominador == 0)
                division_por_cero = 1;
            else {
                par_real = par_real1 * par_real2 + par_imag1*par_imag2;
                par_real /= denominador;
                par_imag = par_imag1 * par_real2 - par_real1*par_imag2;
                par_imag /= denominador;
            }
            break;
        default:
            operacion_valida = 0;
            printf("La operación no es válida\n");
    }
    if (operacion_valida)
        if (division_por_cero)
            printf("No se puede dividir entre cero\n");
        else
            printf("El resultado es: %.3lf + %.3lfi\n", par_real, par_imag);
    return 0;
}

