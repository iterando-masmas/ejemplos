#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: 

operacion=input("Ingrese operación (+,-,*,/):")
par_real1=float(input("Ingrese parte real del número 1: "))
par_imag1=float(input("Ingrese parte imaginaria del número 1: "))
par_real2=float(input("Ingrese parte real del número 2: "))
par_imag2=float(input("Ingrese parte imaginaria del número 2: "))

division_por_cero = False
operacion_valida = True

if operacion=='+':
    par_real = par_real1 + par_real2
    par_imag = par_imag1 + par_imag2
elif operacion=='-':
    par_real = par_real1 - par_real2
    par_imag = par_imag1 - par_imag2
elif operacion=='*':
    par_real = par_real1 * par_real2 - par_imag1 * par_imag2
    par_imag = par_real1 * par_imag2 + par_imag1 * par_real2
elif operacion=='/':
    denominador = par_real2**2 + par_imag2**2
    if denominador == 0:
        division_por_cero = True
    else:
        par_real = par_real1 * par_real2 + par_imag1 * par_imag2
        par_real /= denominador
        par_imag = par_imag1 * par_real2 - par_real1 * par_imag2
        par_imag /= denominador
else:                
    operacion_valida = False
    print("La opereación no es válida")

if operacion_valida:
    if division_por_cero:
        print("No se puede dividir entre cero")
    else:
        print("El resultado es: {:.3f} + {:.3f}i".format(par_real, par_imag))