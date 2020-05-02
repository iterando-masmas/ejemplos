def invierte_numero(numero):
    numero_invertido = 0
    while numero > 0:
        digito = numero % 10
        numero_invertido *= 10
        numero_invertido += digito
        numero //= 10
    return numero_invertido
    
def es_palindromo(numero):
    numero_invertido = invierte_numero(numero)
    return numero == numero_invertido

numero=int(input("Ingrese un número: "))
numero = abs(numero)
if es_palindromo(numero):
    print("El número es palíndromo")
else:
    print("El número no es palíndromo")