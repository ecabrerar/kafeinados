import java.util.Scanner;
/**
Un ejemplo sencillo que trata de demostrar la comparacion de variables númericas y también la comparación de cadena de caracteres, así como también el uso de las sentencias IF/ELSE y WHILE.

Toma una serie de valores digitados por el usuario y saca el total y la media

*/

public class TestEstructurasControl1
{
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Por favor, introduzca resultados de las pruebas que van desde 0 a 100.");
        System.out.println("Para finalizar el programa ingresar un valor mayor a 100 .");
        System.out.println();  //imprimir una línea en blanco

        // crear un objeto de la clase Scanner llamado sc e initializar variables
        double scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

    	// obtener una serie de resultados de las pruebas por parte del usuario
        while (testScore <= 100)
        {
		    // obtener la información del usuario
            System.out.print("Registre la puntuación: ");
        	testScore = sc.nextInt();

        	// cuenta los puntos acomulados y la puntuación total
        	if (testScore <= 100)
        	{
        		scoreCount = scoreCount + 1;
        		scoreTotal = scoreTotal + testScore;
			}
		}

    	// mostrar el número de puntuación, la puntuación total, y la puntuación media
    	double averageScore = scoreTotal / scoreCount;
    	String message = "\n" +
    	                 "Cantidad de muestra:   " + scoreCount + "\n"
    	               + "puntuación total:   " + scoreTotal + "\n"
		               + "puntuación media: " + averageScore + "\n";
		System.out.println(message);
	}
}
