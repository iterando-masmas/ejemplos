//Creado por Andrés Melgar
//para iterando++ http://iterando.online/
//entrada: http://iterando.online/ejercicios-resueltos/validacion-de-rango-del-espectro-de-luz-visible-en-pseint/
Algoritmo Espectro_visible
	Escribir 'Ingrese longitud de onda (nm): '
	Leer lon_onda
	Si lon_onda>=380 Y lon_onda<=780 Entonces
		Escribir 'Dentro del espectro visible'
	SiNo
		Escribir 'Fuera del espectro visible'
	FinSi
FinAlgoritmo