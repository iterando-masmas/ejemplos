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
	while (1){
		if (b<a){
			int aux=a;
			a=b;
			b=aux;
		}
		if (a==0)
			return b;
		else
			b-=a;
	}
}
