package chapter03;

import java.util.Scanner;

/**
 * A very simple program that checks whether
 * a number inputted by the user is even or odd.
 * 
 * @author Luca Lanfranco
 */
public class IsItEven {
    public static void main(String[] args) {
        
        // TODO: Make a Scanner object and store it in input
        // This helps to get a number from the user
        Scanner input = new Scanner(System.in);

        // Onboarding the user
        System.out.println("Welcome, this program checks whether your number is odd or even.");
        
        // TODO: The number typed in by the user
        // is stored as an integer
        // Display an instruction to the user
        
        // TODO: Use the mod operator to get remainder
        
        // We are good devs and close bulky resources
        input.close();
    }
}