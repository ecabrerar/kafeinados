/*
Probar la definicion de metodos en java
*/

class TestMetodo{

 int sumar(int a, int b){
    return a+b;
 } 
 
  public static void main(String[] args){
    TestMetodo metodo = new TestMetodo();
    int resultado = metodo.sumar(10,20);
   
    System.out.println("Resultado : "+resultado);

  }

}
