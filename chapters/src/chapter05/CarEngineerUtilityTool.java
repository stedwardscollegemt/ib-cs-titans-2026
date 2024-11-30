package chapter05;

import helpers.Keyboard;

public class CarEngineerUtilityTool {

    static final int RADIANS_PER_SECOND = 5252; // global variable
    
    public static void main(String[] args) {

        System.out.println("*** Car Engineer Utility Tool ***");

        boolean exitProgram = false;

        while(!exitProgram) {
            // TODO: call printMenu()

            // We are using the Keyboard class instead of the Scanner object
            // because its methods are easier to remember.
            System.out.println("Select your choice [1, 2, 3, 4]:");
            int userChoice = Keyboard.readInt();

            if (userChoice == 4) {
                System.out.println("Thanks for using the calculator, good bye!");
                exitProgram = true;
            } else if (userChoice == 1) {
                // display calculator option
                System.out.println("--- Fuel Efficiency Calculator ---");

                // get user input for our method
                System.out.println("Enter distance:");
                double distance = Keyboard.readDouble();
                System.out.println("Enter fuel:");
                double fuel = Keyboard.readDouble();

                // call calculateFuelEfficiency and pass in parameters
                // gets back a value in return
                double efficiency = calculateFuelEfficiency(distance, fuel);

                // output the value returned
                System.out.println("Efficiency is: " + efficiency + " miles per gallon.");
            } else if (userChoice == 2) {
                // TODO: calculateHorsePower option
            } else if (userChoice == 3) {
                // TODO: calculateBrakeDistance option
            }
        }
    }

    // TODO: Construct a method printMenu() without parameters and without a return value that
    //       displays the menu of options:
    //       1. Fuel Efficiency Calculator
    //       2. Engine Power Calculator
    //       3. Brake Distance Calculator
    //       4. Exit

    // Here is an example of a method with parameters and a return value
    private static double calculateFuelEfficiency(double distance, double fuel) {
        return distance / fuel; // simple formula: MPG = distance / fuel
    }

    // TODO: Construct a method calculateHorsePower() that accepts parameters for torque and rpm.
    //       As a result, it returns torque * rpm / RADIANS_PER_SECOND

    // TODO: Construct a method calculateBrakeDistance() that accepts speed and frictionCoefficient.
    //       As a result, it returns (speed * speed) / (2 * frictionCoefficient * 9.8)
}
