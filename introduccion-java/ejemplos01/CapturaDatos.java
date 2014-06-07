/*
 Probar entrada de datos desde la consola y la importacion de paquetes
*/
import java.util.Scanner;

class CapturaDatos{


 public static void main(String[] args){
 
   // crear un objeto de la clase Scanner
   Scanner sc = new Scanner(System.in);

  // leer un string
  System.out.print("Escriba el codigo del producto: ");
  String productCode = sc.next();
   
  // leer un valor double
  System.out.print("Escriba el precio: ");
  double price = sc.nextDouble();
  
  // leer un valor entero
  System.out.print("Escriba la cantidad: ");

  int quantity = sc.nextInt();
  // realizar calculo del total
  double total = price * quantity;
  
  System.out.println();
  System.out.println(quantity + " " + productCode + " @ " + price + " = " + total);
  System.out.println(); 
    
 }
}
