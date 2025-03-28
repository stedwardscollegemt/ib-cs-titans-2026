package chapter02;

import java.util.Random;
//import java.util.Scanner;

public class Dicer 
{

public static int rollDice()
{
    Random rand = new Random();
    int roll = rand.nextInt(6) + 1;
    return roll;
}

public static void main(String[] args) 
{
    //Display welcome message 
    System.out.println("Calling a Math Function...");

    //Scanner keyIn = new Scanner(System.in);
    //Scanner userInput;
    //System.out.print("Press the ENTER key to roll the dice.");
    //keyIn.nextLine();

    int tries = 1;

    int sum = 0;

    while (sum < 10) // && sum != 6) 
    
    {
    // Here is where you call your newly created method
    int roll1 = rollDice();

    int roll2 = rollDice();

    sum = roll1 + roll2;
    
    //tries = tries + 1;

    System.out.println(roll1 + " + " + roll2 + " = " + sum + ", Roll number: "  + tries);

    tries++;
    }
}

}
