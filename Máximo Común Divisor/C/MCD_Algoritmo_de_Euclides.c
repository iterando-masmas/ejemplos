#include <stdio.h>

int MCD(int a, int b);

int main(){
	printf("Ingrese dos n�meros: ");
	int a, b;
	scanf("%d %d", &a, &b);
	if (a>0 && b>0) 
		printf("El MCD(%d,%d)=%d",a, b, MCD(a,b));
	else
		printf("N�meros inv�lidos");	
	return 0;
}

int MCD(int a, int b){
	if (b>a){
		int aux=a;
		a=b;
		b=aux;
	}
	while(1){
		int resto=a%b;
		if (resto==0)
			return b;
		else{
			a=b;
			b=resto;
		}			
	}
}
