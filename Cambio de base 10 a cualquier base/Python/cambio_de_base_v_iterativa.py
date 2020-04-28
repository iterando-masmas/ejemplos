#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/cambio-de-base-en-python/
def imprime_digito_en_base(digito):
    if digito < 10:
        print("{:d}".format(digito), end="")
    else:
        digito_transformado = chr(digito - 10 + ord('A'))
        print("{}".format(digito_transformado), end="")
        
def encuentra_mayor_potencia_menor_o_igual_a_numero(numero, base):
    factor = 1
    while factor <= numero:
        factor *= base
    return factor//base

def imprime_en_otra_base(numero, base):
    factor = encuentra_mayor_potencia_menor_o_igual_a_numero(numero, base)
    while True:
        digito = numero // factor
        imprime_digito_en_base(digito)
        numero %= factor
        factor //= base;
        if factor == 0:
            break
    
numero=int(input("Ingrese número en base 10: "))
base=int(input("Ingrese base: "))

if base >= 2 and base <= 36:
    imprime_en_otra_base(numero, base)
else:
    print("Debe ingresar una base entre 2 y 36")