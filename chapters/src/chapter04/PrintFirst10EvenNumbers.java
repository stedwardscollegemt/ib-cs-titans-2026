package chapter04;

public class PrintFirst10EvenNumbers {

    public static void main(String[] args) {

        // title
        System.out.println("*** Print First 10 Even Numbers ***");
        System.out.println("-----------------------------------");
        
        // initialising our algorithm with the variables we need
        int nextEvenNumber = 2;

        // here is a while loop in Java
        // it is very similar to an if statement
        while (nextEvenNumber <= 20) {
            // the action we want repeated
            System.out.println("Next even number: " + nextEvenNumber);
            // make my problem smaller
            nextEvenNumber = nextEvenNumber + 2;
        }
    }
}
