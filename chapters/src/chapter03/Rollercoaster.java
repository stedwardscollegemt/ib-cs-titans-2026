package chapter03;

import java.util.Scanner;

/**
 * Adapt the program in Java In Two Semesters Page 44
 * So that the program checks for your height
 */
// @Developer: Lenka Year 12 2024
public class Roller {
    
    public static void main(String[] args) {
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in m: ");
        height = input.nextDouble();

        // test controls if the next instruction is executed
        if (height < 1.5)  {
            System.out.println("Hello Junior!");
        } else {
            System.out.println("Enjoy your ride");
        }

        input.close();
    }
}
