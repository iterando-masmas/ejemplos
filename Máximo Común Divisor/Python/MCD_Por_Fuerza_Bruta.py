def MCD(a,b):
    if a>=b:
        divisor=a
    else:
        divisor=b
    while divisor>=1:
        if a%divisor==0 and b%divisor==0:
            return divisor;	
        divisor-=1
        
a=int(input("Ingrese número a: "))
b=int(input("Ingrese número b: "))
if a>0 and b>0:
    print("El MCD({:d},{:d})={:d}".format(a,b,MCD(a,b)))
else:
    print("Números inválidos")