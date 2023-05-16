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
    
    
    
