package chapter02;

/**
 * Are you up to the challenge?
 * How will this program look like?
 * 
 * 10 Euros equals
 * *** 8.33 Pound Sterling ***
 */
public class EuroGBPConverter {
    public static void main(String[] args) {
        // Declaring a variable called euros of data type double and we assigned it to 10.00
        double euros = 10.00;
        
        // Declaring a variable called poundSterling of data type double and we assigned it to euros 
        double poundSterling = 0.83 * euros;

        // Display text
        System.out.println(euros + " Euros equals");
        System.out.println(poundSterling + " Pound sterling");
    }
}
