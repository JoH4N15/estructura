# Historia de usuario
Soy el  administrador del Autódromo de Tocancipá.

Requiero documentar y analizar la información de los tiempos que se hacen por vuelta en una carrera, para calcular el tiempo de vuelta por categorías 

 
ESCENARIO
 

Escenario 1: 

Given que debo Ingresar el tiempo por vuelta  de todos los pilotos

verificar que los tiempos coincidan con el cronometro oficial, que los datos tanto del piloto y vehículo sean correctos   

When Seleccione la opción de calcular el promedio por vuelta

 

Then el programa debe poder guardar y actualizar la información de cada uno de los pilotos como el nombre, edad, categoría y su promedio de vuelta 
*****************************************************************************************************************************************
#Caso de usuario
<p align="left">  <img src="https://i.ibb.co/1JGvSTg/img.png">  </p>
*****************************************************************************************************************************************
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
#Diagrama de flujo:
<p align="left">  <"https://i.ibb.co/7GZgtyQ/ddfjh.png">  </p>
*****************************************************************************************************************************************
 #Pseudocodigo
 Caracteres: nombres [30], numeros[30], categorias[30]
real: tiempo1[50], tiempo2[50], tiempo3[50]
caracteres: nombre, numero, categoria
Entero: numpilotos, i
real: tiempo1, tiempo2, tiempo3, promedio <- 0
imprimir: "Digite el numero de ciclistas: "
asignar: numpilotos
para i=0 hasta numpilotos - 1, 1
imprimir: 'Digite el nombre del piloto: '
asignar: nombre
Imprimir: “Digite el numero del piloto:”
Asignar: numero
Imprimir: ‘Digite la categoria del piloto:’
Asignar: categoria
Imprimir: ‘Digite el tiempo 1 del piloto:’
Asignar: tiempo1
Imprimir: ‘Digite el tiempo 2 del piloto:’
Asignar: tiempo2
Imprimir: ‘Digite el tiempo 3 del piloto’
Asignar: tiempo3
nombres[i] <- nombre
numeros[i] <- numeros
categorias [i] <- categoria
tiempouno[i] <- tiempo1
tiempodos[i] <- tiempo2
tiempotres[i] <- tiempo3
finPara
Para i=0 hasta numpilotos -1, 1
promedio <-
*****************************************************************************************************************************************
 #Codigo Estructurado java
 ```
 import java.util.Scanner;
public class PilotoEstr
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[50];
        String[] numeros = new String[50];
        String[] categorias = new String[50];
        double[] tiempouno = new double[50];
        double[] tiempodos = new double[50];
        double[] tiempotres = new double[50];
        
        int numeroPilotos;
        String nombre, numero, categoria;
        double tiempo1, tiempo2, tiempo3;
        double promedio = 0;
        System.out.println("Digite la cantidad de pilotos: ");
        numeroPilotos = sc.nextInt();
        for(int i = 0; i < numeroPilotos; i++){
            System.out.println("Digite el nombre del piloto: ");
            nombre = sc.next();
            System.out.println("Digite el numero del piloto: ");
            numero = sc.next();
            System.out.println("Digite la categoria del piloto: ");
            categoria = sc.next();
            System.out.println("Digite el tiempo de vuelta: ");
            tiempo1=sc.nextDouble();
            System.out.println("Digite el tiempo de vuelta: ");
            tiempo2=sc.nextDouble();
            System.out.println("Digite el tiempo de vuelta: ");
            tiempo3=sc.nextDouble();
            nombres[i] = nombre;
            numeros[i] = numero;
            categorias[i] = categoria;
            tiempouno[i] = tiempo1;
            tiempodos[i] = tiempo2;
            tiempotres[i] = tiempo3;
        }
        for(int i = 0; i < numeroPilotos; i++){
            promedio = promedio + ((tiempouno[i] + tiempodos[i] + tiempotres[i]) / 3) / numeroPilotos;
        }
        System.out.println("El promedio de vuelta es: " + promedio);
    }
}
 ```
*****************************************************************************************************************************************
 #Codigo orientado a objetos
 ```
 public class PilotoPOO
{
  String nombre;
  String numero;
  String categoria;
  double tiempouno;
  double tiempodos;
  double tiempotres;
}
 ```
