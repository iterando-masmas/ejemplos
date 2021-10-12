def MCD(a,b):
   while True:
    if b<a:
        a,b=b,a
    if a==0:
        return b
    else:
        b-=a
        
a=int(input("Ingrese número a: "))
b=int(input("Ingrese número b: "))
if a>0 and b>0:
    print("El MCD({:d},{:d})={:d}".format(a,b,MCD(a,b)))
else:
    print("Números inválidos")