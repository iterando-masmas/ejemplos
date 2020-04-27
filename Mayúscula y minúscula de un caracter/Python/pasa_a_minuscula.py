#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: 
c=input("Ingrese caracter en mayúscula: ")
if c>='A' and c<='Z':
    c=chr(ord(c)-ord('A')+ord('a'))
print("En minúscula es: {}".format(c))

