def MCD(a,b):
    if b>a:
        a,b=b,a
    while True:
        resto=a%b
        if resto==0:
            return b
        else:
            a=b
            b=resto
        
a=int(input("Ingrese número a: "))
b=int(input("Ingrese número b: "))
if a>0 and b>0:
    print("El MCD({:d},{:d})={:d}".format(a,b,MCD(a,b)))
else:
    print("Números inválidos")