package chapter03;

import java.util.Scanner;

// This program is an example of the use of selection in a Java program
// @Developer: Weipeng Chen Year 12 2024
public class RollerCoaster2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.println("How tall are you?(m)");
        int heightp = input.nextInt();
        
        if (heightp <= 1.4) // test controls if the next instruction is executed
        {
            System.out.println("Your height is in junier");
        }
        else if (heightp >= 1.4 && heightp <= 1.6)
        {
            System.out.println("Your height is in intermediate");
        }
        else
        {
            System.out.println("Your height is in high-level");
        }

        input.close();
    }
}
