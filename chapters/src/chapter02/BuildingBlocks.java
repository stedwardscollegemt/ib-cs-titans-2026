package chapter02;

/**
 * The { } are "scope"
 */
public class BuildingBlocks {

    public static void main(String[] args) {

        // 2.5
        // Declare and assign a constant for NO_OF_WEEK_DAYS
        int NO_OF_WEEK_DAYS = 7;
        System.out.println(NO_OF_WEEK_DAYS);

        // 2.2, 2.3, 2.4, 2.6
        // The following data types are also referred to as "primitive data types"

        // Declaring a variable of data type integer and assigning a value
        int appleUnitPriceCents = 50;
        // Display "Apple Unit Price: $<appleUnitPrice>"
        System.out.println("Apple Unit Price: " + appleUnitPriceCents);

        // Declaring a variable of data type int for appleQty and assign 10 as a value
        int appleQty = 10;
        // Display "Qty: 10"
        System.out.println("Qty: " + appleQty);

        // Declare a variable named amountDue and assign it to appleUnitPrice * appleQty
        int amountDue = appleQty * appleUnitPriceCents;
        // Display "Amount due: $<amountDue>"
        System.out.println("Amount due: " + amountDue);
        
        System.out.println("------------------------------------------------------------------------------------------");

        // Declaring a variable of data type float to store temperature and assigning a value
        float temperature = 10.2f;
        
        // Increase the temperature by 5.7 degrees celcius
        // Note that we do not need to retype 'float' again, that we do only once
        // We can use variables as many times as we like in our programs
        temperature = 5.7f + temperature;
        
        // Display "Temperature: <temperature> degrees celcius"
        System.out.println("Temperature: " + temperature + " degrees celcius.");

        System.out.println("------------------------------------------------------------------------------------------");

        // Declaring a variable called balance of data type double and assigning a value
        double balance = 20.50;
        // Decrease the balance by 4.95 dollars
        balance = balance - 4.95;
        // Display "Account Balance: $<balance>"
        System.out.println("Account Balance: $" + balance);

        System.out.println("------------------------------------------------------------------------------------------");

        // Declaring a variable of data type char and assigning a value
        char myFavouriteLetter = 'E';

        // Declaring a variable of data type boolean and assigning a value
        boolean isHungry = true;
        boolean isCoding = true;
    }
}