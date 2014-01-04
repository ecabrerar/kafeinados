/*
  Declaracion e inicializacion de variales
  type variableName = value;	
*/
class TestVariables2{

public static void main(String[] args){
   /*Declarando e inicializando cadenas de caracteres
     String variableName = value;*/

   String message1 = "Probando cadenas de caracteres"; 
    
   System.out.println("message1 : "+message1);
   System.out.println(message1);

  //Unir cadenas de caracteres

   String nombre = "Bob"; 
   String apellido = "Smith"; 
   String nombreCompleto = nombre + " " + apellido; // name is Bob Smith

   System.out.println("nombreCompleto : "+nombreCompleto);

   //Unir una cadena de caracteres con un valor numérico
   double precio = 14.95;
   String precioString = "Precio:" + precio;
   
   System.out.println("precioString : "+precioString);
  
   //Ejercicio: Incluir caracteres especiales dentro de una cadena de caracteres de Java  

  }
}
