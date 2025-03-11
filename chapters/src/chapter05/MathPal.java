package chapter05;

import helpers.Keyboard;

/**
 * A group of Year 12 students from 2022 designed this program in class.
 * The program makes use of methods.
 */
public class MathPal {
    public static void main(String[] args) {
        // On board the user with a welcoming message 
        System.out.println("***Welcome to MatPal***");
        System.out.println("***********************");
        
        // Declare a boolean variable isPlay and set it to true
        boolean isPlay = true;

        // Use isPlay in the while loop
        while(isPlay) {
            System.out.println("1. Counting");
            System.out.println("2. Add");
            System.out.println("3. Subtract");
            System.out.println("4. Multiply");
            System.out.println("5. Divide");

            System.out.println("What to you want to try?");
            String function = Keyboard.readString();

            System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();

            int output = -1;

            if (function.equals("Add")) {
                output = calc(n1, n2, '+');
                System.out.println(n1 + " * " + n2 + " = " + output);
                explainer(n1, n2, '+');
            } else if (function.equals("Multiply")) {
                output = calc(n1, n2 , '*');
                System.out.println(n1 + " * " + n2 + " = " + output);
                explainer(n1, n2, '*');
            } else if (function.equals("Divide")) {
                output = calc(n1, n2 , '/');
                System.out.println(n1 + " / " + n2 + " = " + output);
                explainer(n1, n2, '/');
            } else if (function.equals("Subtract")) {
                output = calc(n1, n2 , '-');
                System.out.println(n1 + " - " + n2 + " = " + output);
                explainer(n1, n2, '-');
            } else {
                // Counting Code
                // Use the method signature to invoke
                // and in place of the parameters pass in your
                // arguments (variables with concrete values)
                counting(n1, n2);
            }
        }
    }

    /**
     * A method that performs a calculation of two numbers based on an operator
     * @param n1
    *  @param n2
    *  @param operator
    *  @return
    */
    public static int calc(int n1, int n2, char operator) {
        int result = -1;
        switch(operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '/':
                result = (int) (n1 / n2); // 
                break;
            case '*':
                result = n1 * n2;
                break;
            default:
                System.out.println("ERR: I cannot recognise this operator: " + operator);
            }   
        return result;
    }

    public static void explainer(int n1, int n2, char operator) {
        switch(operator) {
            case '+':
                System.out.println("Start counting from n1: " + n1);
                System.out.println("Keep counting for n2 (" + n2 + ") times.");
                System.out.println("Example...");
                for (int count = n1; count <= n2; count++) {
                    System.out.println(count);
                }
                break;
            case '-':
                System.out.println("Start counting from n1: " + n1);
                System.out.println("Keep counting for n2 (" + n2 + ") times but backwards.");
                System.out.println("Example...");
                for (int count = n1; count >= n2; count--) {
                    System.out.println(count);
                }
                break;
            case '/':
                System.out.println("Imagine you are sharing toys equally among children.");
                System.out.println("If you have 5 toys but 2 children... each child will get...");
                System.out.println("Each child gets 2 whole toys, and a broken toy...");
                break;
            case '*':
                System.out.println("You are on your own kid, do this by heart!");
                break;
            default:
                System.out.println("ERR: I cannot recognise this operator: " + operator);
        }
    }

    /**
     * 
     * @param n1 e.g., 2; 10
     * @param n2 e.g., 3; 3;
     * // Example output 1
     * We are going to count from 2 up to 3
     * 2... 3.
     * 
     * // Example output 2
     * We are going to count backwards from 10 down to 3
     * 10... 9... 8... 7... 6... 5... 4... 3.
     */

    public static void counting(int n1, int n2) {
        // Check if we counting up or down.
        if (n1 < n2) {
            // Counting up...
            for (int i = n1; i <= n2; i++) {
                System.out.print(i);
                if (n1 == n2) {
                    System.out.print(".");
                } else {
                    System.out.print("...");
                    // TODO: Pause the program in Java
                }
            }
        } else if (n1 > n2) {
            // Counting down...
            for (int i = n2; i >= n1; i--) {
                System.out.print(i);
                if (n1 == n2) {
                    System.out.print(".");
                } else {
                    System.out.print("...");
                    // TODO: Pause the program in Java
                }
            }
        } else {
           // They are equal!
           System.out.println("We can only count between two different numbers! Please try again."); 
        }
        System.out.println("");
        System.out.println("");
    }

}