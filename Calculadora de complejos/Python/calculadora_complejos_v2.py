#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/calculadora-de-numeros-complejos-en-python/
operacion=input("Ingrese operación (+,-,*,/): ")
par_real1=float(input("Ingrese parte real del número 1: "))
par_imag1=float(input("Ingrese parte imaginaria del número 1: "))
par_real2=float(input("Ingrese parte real del número 2: "))
par_imag2=float(input("Ingrese parte imaginaria del número 2: "))

division_por_cero = False
operacion_valida = True

n1=complex(par_real1, par_imag1)
n2=complex(par_real2, par_imag2)
if operacion=='+':
    n3=n1+n2
elif operacion=='-':
    n3=n1-n2
elif operacion=='*':
    n3=n1*n2
elif operacion=='/':
    denominador = par_real2**2 + par_imag2**2
    if denominador == 0:
        division_por_cero = True
    else:
        n3=n1/n2
else:                
    operacion_valida = False
    print("La operación no es válida")

if operacion_valida:
    if division_por_cero:
        print("No se puede dividir entre cero")
    else:
        print("El resultado es: {}".format(n3))



