# Historia de usuario
Soy el  administrador del Autódromo de Tocancipá.

Requiero documentar y analizar la información de los tiempos que se hacen por vuelta en una carrera, para calcular el tiempo de vuelta por categorías 

 
ESCENARIO
 

Escenario 1: 

Given que debo Ingresar el tiempo por vuelta  de todos los pilotos

verificar que los tiempos coincidan con el cronometro oficial, que los datos tanto del piloto y vehículo sean correctos   

When Seleccione la opción de calcular el promedio por vuelta

 

Then el programa debe poder guardar y actualizar la información de cada uno de los pilotos como el nombre, edad, categoría y su promedio de vuelta 
******************************************************************************************************************************************
#Caso de usuario
<p align="left">  <img src="https://i.ibb.co/1JGvSTg/img.png">  </p>
******************************************************************************************************************************************
#Descripcion Caso de uso 

Nombre: Calcular el tiempo por vuelta en moto en el circuito
Actores: Administrador de pista
Propósito: Guardar nombre, numero, categoria y tres tiempos del piloto para calcular su promedio.
Carrera normal Eventos:
El administrador ingresa la cantidad de pilotos.
El entrenador ingresa el nombre, numero, categoria, tiempo 1,
tiempo 2 y tiempo 3 de los pilotos.
Se calcula el promedio a partir de:
( ∑(tiempo 1, tiempo 2, tiempo 3) / tiempo total) / Cantidad pilotos
Se Muestra el proemedio de los pilotos de su categoria,
Postcondiciones: Promedio de tiempos Calculado
*****************************************************************************************************************************************
