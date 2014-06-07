/*
Probar la definicion de metodos en java
*/

class MetodoConstructor{
 int a;
 int b;
  
 MetodoConstructor(int a, int b){
   this.a = a;
   this.b = b;
 }

 int sumar(){
    return a+b;
 } 
 
  public static void main(String[] args){
    MetodoConstructor constructor = new MetodoConstructor(10,20);
    int resultado = constructor.sumar();
   
    System.out.println("Resultado : "+resultado);

  }

}
