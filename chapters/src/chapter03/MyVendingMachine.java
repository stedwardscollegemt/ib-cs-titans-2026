package chapter03;

import java.util.Scanner;

/**
 * You are offering the user a very strange vending machine.
 */
public class MyVendingMachine {

  public static void main(String[] args) {

    // Really cool ASCII art title
    // https://ascii.today/
    System.out.println("__                    __                          __  ___");
    System.out.println("|  |_.----.-----.---.-|  |_.--.--.----.-----.-----|  .'  _|");
    System.out.println("|   _|   _|  -__|  _  |   _|  |  |   _|__ --|  -__|  |   _|");
    System.out.println("|____|__| |_____|___._|____|_____|__| |_____|_____|__|__|");

    // Format your bizarre menu nicely, with a price list
    System.out.println("[1] My cat's furball ----------- $7.30");
    System.out.println("[2] Already chewed gum --------- $0.30");
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please choose an item.");
    int number = input.nextInt();

    // User must agree to make the purchase by confirming the right amount
    System.out.println("You chose " + number + " please confirm amount: ");
    double amount = input.nextDouble();

    // Declare a variable for change
    double change = 0.00;

    switch(number) {
      case 1:
        // TODO: Case 1
        System.out.println("How many do you want?");
        int qty = input.nextInt();
        double amountDue = 7.30 * qty;

        System.out.println("Please pay me " + amountDue + ": ");
        double money = input.nextDouble();

        if (money >= amountDue) {
          System.out.println("Ok, " + qty + " of my cat's furballs coming right up...");
          if (money > amountDue) {
            change = money - amountDue;
            System.out.println("Your change: " + change);
          }
        } else {
          System.out.println("You did not pay enough, but guess what, I will keep the money anyway!");
        }

        break;
      case 2:
        // TODO: Case 2
        break;
      case 3:
        // TODO: Case 3
        break;
      default: 
          System.out.println("That was not on the menu you silly bean!");
    }

    // We are good devs and close bulky resources
    input.close();
  }
}