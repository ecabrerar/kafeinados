import java.util.Scanner;
/**
Un ejemplo sencillo que trata de demostrar la comparacion de variables numericas y tambien la comparacion de cadena de caracteres, asi como tambien el uso de las sentencias IF/ELSE y WHILE.

Toma una serie de valores digitados por el usuario y saca el total y la media

*/

public class EstructurasControl1
{
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Por favor, introduzca resultados de las pruebas que van desde 0 a 100.");
        System.out.println("Para finalizar el programa ingresar un valor mayor a 100 .");
        System.out.println();  //imprimir una linea en blanco

        // crear un objeto de la clase Scanner llamado sc e initializar variables
        double scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

    	// obtener una serie de resultados de las pruebas por parte del usuario
        while (testScore <= 100)
        {
		    // obtener la informacion del usuario
            System.out.print("Registre la puntuacion: ");
        	testScore = sc.nextInt();

        	// cuenta los puntos acomulados y la puntuacion total
        	if (testScore <= 100)
        	{
        		scoreCount = scoreCount + 1;
        		scoreTotal = scoreTotal + testScore;
			}
		}

    	// mostrar el numero de puntuacion, la puntuacion total, y la puntuacion media
    	double averageScore = scoreTotal / scoreCount;
    	String message = "\n" +
    	                 "Cantidad de muestra:   " + scoreCount + "\n"
    	               + "puntuacion total:   " + scoreTotal + "\n"
		               + "puntuacion media: " + averageScore + "\n";
		System.out.println(message);
	}
}
