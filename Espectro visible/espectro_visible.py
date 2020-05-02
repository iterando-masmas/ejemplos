#Creado por Andrés Melgar
#para iterando++ http://iterando.online/
#entrada: http://iterando.online/ejercicios-resueltos/validacion-de-rango-del-espectro-de-luz-visible-en-python/
lon_onda=float(input("Ingrese longitud de onda (nm): "))
         
if lon_onda >= 380 and lon_onda <= 780:
    print("La longitud de onda se encuentra dentro del espectro visible")
else:
    print("La longitud de onda no se encuentra dentro del espectro visible")