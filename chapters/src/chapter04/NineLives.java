package chapter04;

import java.util.Scanner;

public class NineLives {

    public static void main(String[] args) {

        // Display a title for your program
        System.out.println("*** Let's Play Nine Lives ***");
        System.out.println(""); // just an empty new line to make my UI look neater

        // Variables we need (e.g., int lives, char guessLetter, String secretWord)
        int lives = 9;
        char guessLetter;
        String secretWord = "CODES"; // A String is a list of characters

        // Ask the user whether they want to play
        Scanner input = new Scanner(System.in);
        System.out.println("Hold on... we just want to make sure you want to play. Please verify with y/n.");
        char response = input.next().charAt(0);

        // If they do want to play, then display the number of lives and the first hint e.g.,
        // Lives: 9       Hint: _ _ _ _ _
        if (response == 'y') {
            System.out.println(""); // just an empty new line to make my UI look neater
            System.out.println("Alright! Let's jump in then. I already thought of a word... can you guess it?");
            System.out.println(""); // just an empty new line to make my UI look neater

            System.out.println("Lives: " + lives);
            System.out.println(""); // just an empty new line to make my UI look neater
            System.out.print("Hint: ");
            String hint = "";
            for (int letter = 0; letter < secretWord.length(); letter++) {
                hint = hint + "_";
            }
            System.out.println(hint);
            System.out.println(""); // just an empty new line to make my UI look neater

            while (lives > 0) {
                System.out.println(""); // just an empty new line to make my UI look neater
                // Ask the user to guess a letter
                System.out.println("Guess a letter...");
                guessLetter = input.next().charAt(0);

                // I did some research for this one
                // https://www.w3schools.com/java/ref_string_contains.asp#:~:text=The%20contains()%20method%20checks,exist%20and%20false%20if%20not.
                boolean isLetterGuessed = secretWord.contains(guessLetter + "");
    
                // Check whether the guess is correct, 
                //       if it is then update hint
                //       else update lives
                if (isLetterGuessed) {
                    // update hint - this is complicated so I might need to tackle this separately
                    // we will get some guidance from the teacher probably
                    String newHint = "";
                    for (int s = 0; s < secretWord.length(); s++) {
                        char nextHintChar = hint.charAt(s);
                        if (nextHintChar == '_') {
                            char nextSecretWordChar = secretWord.charAt(s);
                            if (nextSecretWordChar == guessLetter) {
                                newHint = newHint + nextSecretWordChar;
                            } else {
                                newHint = newHint + "_";
                            }
                        }
                    }
                    hint = newHint;
                    System.out.println(hint);
                    System.out.println(""); // just an empty new line to make my UI look neater
                } else {
                    System.out.println("Nope! The letter is not there...");
                    lives = lives - 1;
                }
            } 
        }

        input.close();
    }
}
