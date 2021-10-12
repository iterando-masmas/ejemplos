#include <stdio.h>

int MCD(int a, int b);

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
	int divisor;
	if (a>=b)
		divisor=b;
	else
		divisor=a;
	while (divisor>=1){
		if (a % divisor==0 && b%divisor==0)
			return divisor;	
		divisor--;
	}
}
