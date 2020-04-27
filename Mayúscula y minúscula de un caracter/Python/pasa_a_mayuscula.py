#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: 
c=input("Ingrese caracter en minúscula: ")
if c>='a' and c<='z':
    c=chr(ord(c)-ord('a')+ord('A'))
print("En mayúscula es: {}".format(c))