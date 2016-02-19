package org.ecabrerar.kafeinados.cs_algorithms;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ecabrerar
 * @date   Feb 19, 2016
 */
public class GuessingGame {

  public static void main(String [] args){

	 int min = 1;
	 int max = 16;

	 Random rand = new Random();

     int numberToGuess = rand.nextInt(max-min)+ min ;

     int numberToGuesses = 0;

	 try(Scanner sc = new Scanner(System.in)){

		   int guess;
		   boolean win = false;

		   while (win == false){
			    	  System.out.println(String.format("Guess a number between %d and %d:", min, max));

			    	  guess = sc.nextInt();
			    	  numberToGuesses++;

			    	  if(guess == numberToGuess){
			    		  win = true;
			    	  } else if(guess < numberToGuess){
			    		  System.out.println("You guessed too low!");
			    	  } else if(guess > numberToGuess){
			    		  System.out.println("You guessed too high!");
			    	  }

			    	  if(numberToGuesses==6){
			    		  break;
			    	  }
		  }

		  if (win == true) {
		         System.out.println("You WIN!!!");
		         System.out.println(String.format("The correct answer was  %d", numberToGuess));
		         System.out.println(String.format("It took you %d tries!",numberToGuesses));

		  } else {
		    	 System.out.println("Sorry you lose.");
		  }

	    } catch(Exception ex){
	    	 System.out.println(String.format("Error %s", ex.getMessage()));
	    }

  }
}
