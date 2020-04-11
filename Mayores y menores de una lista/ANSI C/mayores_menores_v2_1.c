/* Creado por Andrés Melgar
 * para iterando++ http://iterando.online/
 * entrada: http://iterando.online/ejercicios-resueltos/mayores-y-menores-de-un-conjunto-de-numeros-en-ansi-c/
 */
 #include <stdio.h>

int main() {
    int n, i = 0, mayor_magnitud1, mayor_magnitud2, menor_magnitud1, menor_magnitud2;
    do {
        printf("Ingrese número %d: ", i + 1);
        scanf("%d", &n);
        
        if (n < 0)
            break;
        i++;
        if (i == 1)
            mayor_magnitud1 = menor_magnitud1 = n;
        else {
            if (i == 2 || n > mayor_magnitud1 || n > mayor_magnitud2)
                if (n > mayor_magnitud1) {
                    mayor_magnitud2 = mayor_magnitud1;
                    mayor_magnitud1 = n;
                } else
                    mayor_magnitud2 = n;
            if (i == 2 || n < menor_magnitud1 || n < menor_magnitud2)
                if (n < menor_magnitud1) {
                    menor_magnitud2 = menor_magnitud1;
                    menor_magnitud1 = n;
                } else
                    menor_magnitud2 = n;
        }
    } while (1);
    if (i == 0)
        printf("No se ha ingresado ningún número\n");
    else {
        printf("El 1er número con mayor magnitud es: %d\n", mayor_magnitud1);
        if (i > 1)
            printf("El 2do número con mayor magnitud es: %d\n", mayor_magnitud2);
        printf("El 1er número con menor magnitud es: %d\n", menor_magnitud1);
        if (i > 1)
            printf("El 2do número con menor magnitud es: %d\n", menor_magnitud2);
    }
    return 0;
}