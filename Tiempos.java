


import java.util.Scanner;
public class Tiempos
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numpilotos;
       PilotoPOO[] losPilotos = new PilotoPOO[50];
       String nombre, numero, categoria;
       double tiempo1, tiempo2, tiempo3;
       double promedio = 0;
       System.out.println("Digite la cantida de pilotos: ");
       numpilotos = sc.nextInt();
       for (int i = 0; i < numpilotos; i++){
           System.out.println("Digite el nombre del piloto: ");
           nombre = sc.next();
           System.out.println("Digite el numero del piloto: ");
           numero = sc.next();
           System.out.println("Digite la categoria del piloto: ");
           categoria = sc.next();
           System.out.println("Digite el tiempo 1 del piloto: ");
           tiempo1 = sc.nextDouble();
           System.out.println("Digite el tiempo 2 del piloto: ");
           tiempo2 = sc.nextDouble();
           System.out.println("Digite el tiempo 3 del piloto: ");
           tiempo3 = sc.nextDouble();
           PilotoPOO unPiloto = new PilotoPOO();
           unPiloto.nombre = nombre;
          unPiloto.numero = numero;
           unPiloto.categoria = categoria;
           unPiloto.tiempouno = tiempo1;
           unPiloto.tiempodos = tiempo2;
           unPiloto.tiempotres = tiempo3;
           losPilotos[i] = unPiloto; 
       }
       
       for(int i = 0; i < numpilotos; i++){
           double sum = (losPilotos[i].tiempouno +losPilotos[i].tiempodos + losPilotos[i].tiempotres)/3;
           promedio = promedio + sum / numpilotos;
       }
       System.out.println("El promedio de tiempos es: " + promedio);
    }
}