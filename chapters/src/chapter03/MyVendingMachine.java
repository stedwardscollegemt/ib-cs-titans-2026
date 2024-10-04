package chapter03;

import java.util.Scanner;

/**
 * You are offering the user a very strange vending machine.
 */
public class MyVendingMachine {

  public static void main(String[] args) {

    // TODO: Really cool ASCII art title
    // https://ascii.today/

    // TODO: Format your bizarre menu nicely, with a price list
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please choose an item.");
    int number = input.nextInt();

    // TODO: User must agree to make the purchase by confirming the right amount

    // TODO: Declare a variable for change

    switch(number) {
      case 1:
        // TODO: Case 1
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