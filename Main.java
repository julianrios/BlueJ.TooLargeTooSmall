
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main
{
    // instance variables - replace the example below with your own
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        letsPlay();

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void letsPlay() {
        // generate random numbers from 1-10
        int randomNum = (int)(Math.random() * 10)+1;
        int counter = 0;
        boolean guess = false;
        while(!guess) {
            System.out.println("Guess a number from 1 to 10.");
            int userGuess = scanner.nextInt();

            if(userGuess > randomNum) {
                System.out.println("Your guess: " + userGuess + " too large");
                counter++;
            } else if(userGuess < randomNum) {
                System.out.println("Your guess: " + userGuess + " too small");
                counter++;
            } else {
                System.out.println("Bingo your guess: " + userGuess + " is correct!");
                guess = true;
            }
        }
        System.out.println("You made " + counter + " incorrect guesses.");
    }
}
