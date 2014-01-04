/*
Probar la definicion de metodos en java
*/

class TestConstructor{
 int a;
 int b;
  
 TestConstructor(int a, int b){
   this.a = a;
   this.b = b;
 }

 int sumar(){
    return a+b;
 } 
 
  public static void main(String[] args){
    TestConstructor constructor = new TestConstructor(10,20);
    int resultado = constructor.sumar();
   
    System.out.println("Resultado : "+resultado);

  }

}
