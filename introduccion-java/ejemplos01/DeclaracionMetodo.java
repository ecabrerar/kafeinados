/*
Probar la definicion de metodos en java
*/

class DeclaracionMetodo{

 int sumar(int a, int b){
    return a+b;
 } 
 
  public static void main(String[] args){
    DeclaracionMetodo metodo = new DeclaracionMetodo();
    int resultado = metodo.sumar(10,20);
   
    System.out.println("Resultado : "+resultado);

  }

}
