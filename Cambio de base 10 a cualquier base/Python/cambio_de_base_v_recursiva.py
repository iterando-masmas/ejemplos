def imprime_digito_en_base(digito):
    if digito < 10:
        print("{:d}".format(digito), end="")
    else:
        digito_transformado = chr(digito - 10 + ord('A'))
        print("{}".format(digito_transformado), end="")

def imprime_en_otra_base(numero, base):
    if numero > 0:
        digito = numero % base
        numero //= base
        imprime_en_otra_base(numero, base)
        imprime_digito_en_base(digito)
    
numero=int(input("Ingrese número en base 10: "))
base=int(input("Ingrese base: "))

if base >= 2 and base <= 36:
    imprime_en_otra_base(numero, base)
else:
    print("Debe ingresar una base entre 2 y 36")




