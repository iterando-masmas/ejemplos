/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 */
#include <stdio.h>

int main() {
    char operacion;
    double par_real1, par_imag1, par_real2, par_imag2;

    printf("Ingrese operación (+,-,*): ");
    scanf("%c", &operacion);
    printf("Ingrese parte real del número 1: ");
    scanf("%lf", &par_real1);
    printf("Ingrese parte imaginaria del número 1: ");
    scanf("%lf", &par_imag1);
    printf("Ingrese parte real del número 2: ");
    scanf("%lf", &par_real2);
    printf("Ingrese parte imaginaria del número 2: ");
    scanf("%lf", &par_imag2);

    int operacion_valida = 1;
    double par_real, par_imag;
    if (operacion == '+') {
        par_real = par_real1 + par_real2;
        par_imag = par_imag1 + par_imag2;
    } else if (operacion == '-') {
        par_real = par_real1 - par_real2;
        par_imag = par_imag1 - par_imag2;
    } else if (operacion == '*') {
        par_real = par_real1 * par_real2 - par_imag1*par_imag2;
        par_imag = par_real1 * par_imag2 + par_imag1*par_real2;
    } else
        operacion_valida = 0;
    printf("La operación no es válida\n");

    if (operacion_valida)
        printf("El resultado es: %.3lf + %.3lfi\n", par_real, par_imag);
    return 0;
}