package chapter03;

import java.util.Scanner;

/**
 * Jumping into code directly can be challenging, write instructions in pseudocode first
 * https://ib.compscihub.net/wp-content/uploads/2018/05/Pseudo-Code-IB-1.pdf 
 * 
 * This program helps a user assemble a hamburger by selecting ingredients
 */
public class AssembleHamburger {
    public static void main(String[] args) {
        
        // Make a Scanner object and store it in input
        // This helps to get a yes/no from the user
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println(" Welcome to our Assemble Hamburger joint.");
        System.out.println("------------------------------------------");

        // Ask the user if they want to assemble a hamburger
        System.out.println("Do you want to assemble a hamburger? (y/n)");

        
        // Here I am declaring a variable named response of data type char
        // char allows me to store characters like 'y' or 'n'
        char response = input.next().charAt(0);

        if (response == 'y') {
            System.out.println("Great, let us help you build a delicious hamburger...");
            // Start the hamburger decision tree
            String burgerOnPlate = "BB, ";

            // Ask the user...
            System.out.println("Would you add lettuce? (y/n)");
            // TODO: Based on response add LT
            // Let's get a response first
            response = input.next().charAt(0);
            if (response == 'y') {
                burgerOnPlate = burgerOnPlate + "LT, ";
            }

            System.out.println("Would you add tomatoe? (y/n)");
            // TODO: Based on response add TM
            response = input.next().charAt(0);
            if (response == 'y') {
                burgerOnPlate = burgerOnPlate + "TM, ";
            }

            System.out.println("Would you go for a double? (y/n)");
           // TODO: Based on response add DB
           response = input.next().charAt(0);
            if (response == 'y') {
                burgerOnPlate = burgerOnPlate + "DP, ";
            } else {
                burgerOnPlate = burgerOnPlate + "SP, ";
            }

            // Add cheese
            burgerOnPlate = burgerOnPlate + "CH, ";

            System.out.println("Would you add pickle? (y/n)");
            // TODO: Based on response add PK
            response = input.next().charAt(0);
            if (response == 'y') {
                burgerOnPlate = burgerOnPlate + "PK, ";
            }

            System.out.println("Would you add onion? (y/n)");
            // TODO: Based on response add ON
            response = input.next().charAt(0);
            if (response == 'y') {
                burgerOnPlate = burgerOnPlate + "ON, ";
            }

             // Add top bun
            burgerOnPlate = burgerOnPlate + "TB, ";

            System.out.println("Your delicious burger is served: " + burgerOnPlate);

        } else if (response == 'n') {
            System.out.println("That is a shame, come back when you are hungry!");
        } else {
            System.out.println("You seem undecided... maybe go for pizza!");
        }

        input.close();
    }
}
