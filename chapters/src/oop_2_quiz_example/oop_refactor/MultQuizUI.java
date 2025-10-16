package oop_2_quiz_example.oop_refactor;

import helpers.Keyboard;

public class MultQuizUI {

    public static void main(String[] args) {
        System.out.println("***-- Multiplication Quiz --***");

        // create an instance of a MuliQuizTestLogic
        MultQuizTestLogic test0 = new MultQuizTestLogic();

        test0.initTest(5);
        
        // loop through the questions to test the student
        for (int i = 0; i < test0.questions.length; i++) {
            System.out.println(test0.questions[i]);
            int userAnswer = Keyboard.readInt(); 
            // how do I check that the userAnswer is correct?
            test0.updateScore(i, userAnswer);
        }

        if (test0.score == 5) {
            System.out.println("Wow, full marks!");
        } else {
            System.out.println("You need a bit more practice.");
        }
    }
    
}
