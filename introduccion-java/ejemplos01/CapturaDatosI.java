/*
 Probar entrada de datos desde la consola y la importacion de paquetes
*/
import java.util.Scanner;
class CapturaDatosI{


 public static void main(String[] args){
 
    // crear un objeto de la clase Scanner
   Scanner sc = new Scanner(System.in);

   // Leer 3 valores enteros
   System.out.print("Digite 3 enteros: ");
   int i1 = sc.nextInt();
   int i2 = sc.nextInt();
   int i3 = sc.nextInt();

   // calcular el promedio y desplegar el resultado
   int total = i1 + i2 + i3;
   int avg = total / 3;
   System.out.println("Promedio: " + avg);
   System.out.println();
    
 }
}
