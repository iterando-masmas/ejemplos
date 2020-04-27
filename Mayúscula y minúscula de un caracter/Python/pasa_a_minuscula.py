#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/pasar-a-mayuscula-minuscula-un-caracter-en-python/
c=input("Ingrese caracter en mayúscula: ")
if c>='A' and c<='Z':
    c=chr(ord(c)-ord('A')+ord('a'))
print("En minúscula es: {}".format(c))

