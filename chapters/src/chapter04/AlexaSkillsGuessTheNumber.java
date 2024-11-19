package chapter04;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AlexaSkillsGuessTheNumber {
    
    public static void main(String[] args) {
        
        // on board the user and give instruction
        System.out.println("Hello there, let's play: Guess The Number.");
        System.out.println("Are you ready?");

        Scanner input = new Scanner(System.in);
        char response = input.next().charAt(0);

        // check whether the user wants to play
        if (response == 'y') {
            System.out.println("Hmm... all right let me think of a number...");

            // get a random number using Random provided by Java
            // the following code mimics rolling a dice and gives a number between 0 and 10
            int number = (new Random()).nextInt(10);
            
            // fake Alexa thinking
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.println("");

            // alert the user that they are going to start
            int triesLeft = 3;
            System.out.println("Ok. You have 3 tries left. Have a go at your first guess.");
            int guess = input.nextInt();
            
            // guess not equal number AND triesLest is greater than 1
            while (guess != number && triesLeft > 1) {
                if (guess < number) { // give hints after a wrong guess
                    System.out.println("You are not correct! The number I am thinking of, is larger. Take another guess...");
                } else { 
                    System.out.println("You are not correct! The number I am thinking of, is smaller. Take another guess...");
                }
                //
                guess = input.nextInt();
                // we make the problem smaller by decreasing the tries
                triesLeft = triesLeft - 1;
            }
               
            // triesLeft greater than 0 AND guess is equal to number
            if (triesLeft > 0 && guess == number) { // a congratulations message for a win
                System.out.println("Well done, you guessed. That was a good round.");
            } else { // a consolation message for a loss and close off game
                System.out.println("You lost! The number I thought of was: " + number);
                System.out.println("Better luck next time.");
            }

        } else { // the user does not want to engage end program
            System.out.println("That is all right. Maybe some other time...");
            System.out.println("Have a great day!");
        }

        input.close();
    }

    // a method that will make the process idle
    // for a number of seconds
    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
    }
    }
}
