package oop_2_quiz_example.oop_refactor;

import helpers.Keyboard;

public class MultQuizUI {

    static MultQuizTestLogic[] learningExperience = new MultQuizTestLogic[22];

    public static void main(String[] args) {

        MultQuizLearningLogic learn2 = new MultQuizLearningLogic(12, 2);
        learningExperience[0] = learn2;
        MultQuizTestLogic test2 = new MultQuizTestLogic(5, 2);
        learningExperience[1] = test2;


        // System.out.println("***-- Multiplication Quiz --***");

        // // create an instance of a MuliQuizTestLogic
        // MultQuizTestLogic test0 = new MultQuizTestLogic(10, 5);

        // test0.initTest(5);
        
        // // loop through the questions to test the student
        // for (int i = 0; i < test0.getQuestions().length; i++) {
        //     System.out.println(test0.getQuestions()[i]);
        //     int userAnswer = Keyboard.readInt(); 
        //     // how do I check that the userAnswer is correct?
        //     test0.updateScore(i, userAnswer);
        // }

        // if (test0.getScore() == 5) {
        //     System.out.println("Wow, full marks!");
        // } else {
        //     System.out.println("You need a bit more practice.");
        // }
    }
    
}
