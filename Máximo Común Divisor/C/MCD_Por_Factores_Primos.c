#include <stdio.h>
#include <math.h>

int MCD(int a, int b);
int siguiente_primo(int n);
int es_primo(int n);

int main(){
	printf("Ingrese dos números: ");
	int a, b;
	scanf("%d %d", &a, &b);
	if (a>0 && b>0) 
		printf("El MCD(%d,%d)=%d",a, b, MCD(a,b));
	else
		printf("Números inválidos");	
	return 0;
}

int MCD(int a, int b){
	int factor=2;
	int producto = 1;
	while (factor<=a && factor<=b){
		if (a%factor==0 || b%factor==0){
			if (a%factor==0 && b%factor==0)
				producto *= factor;
			if (a%factor==0)
				a /= factor;
			if (b%factor==0)
				b /= factor;
		}
		else
			factor = siguiente_primo(factor);
	}
	return producto;
}

int es_primo(int n) {
    if (n <= 1)
        return 0;
    int encontro_divisores = 0;
    int i = 2;
    while (i <= sqrt(n) && !encontro_divisores) {
        if (n % i == 0)
            encontro_divisores = 1;
        i++;
    }
    return !encontro_divisores;
}

int siguiente_primo(int n) {
    do {
        n++;
    } while (!es_primo(n));
    return n;
}
