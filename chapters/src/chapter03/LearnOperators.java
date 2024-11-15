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

        // Defining mod which is short for modulus (%)
        double z = (x % y);
        System.out.println("X MOD Y (%): " + z);

        // Defining div which is short for integer division (/)
        int w = (x / y);
        System.out.println("X DIV Y (/): " + w);

        // Defining smaller than (!=)
        boolean isXNotEqualY = (x != y);
        System.out.println("Is X Not Equal to Y (<): " + isXNotEqualY);
    } 
}
