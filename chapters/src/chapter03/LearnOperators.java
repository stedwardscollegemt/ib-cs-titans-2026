package chapter03;

import java.util.Scanner;

public class LearnOperators {
    public static void main(String[] args) {
        // display a title for my program
        System.out.println("*** Let's Learn About Operators ***");

        // input component of our program
        Scanner input = new Scanner(System.in);

        // Enter x as input
        System.out.println("Please enter an integer value for x: ");
        int x = input.nextInt();

        // Enter y as input
        System.out.println("Please enter an integer value for y: ");
        int y = input.nextInt();

        // Defining equals (==)
        boolean isXEqualY = (x == y);
        System.out.println("Is X Equal to Y (==): " + isXEqualY);

        // Defining bigger than (>)
        boolean isXBiggerY = (x > y);
        System.out.println("Is X Bigger than Y (>): " + isXBiggerY);

        // Defining smaller than (<)
        boolean isXSmallerY = (x < y);
        System.out.println("Is X Smaller than Y (<): " + isXSmallerY);

    } 
}
