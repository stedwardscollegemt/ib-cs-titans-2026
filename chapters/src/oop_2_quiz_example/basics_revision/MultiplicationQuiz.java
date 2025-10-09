package oop_2_quiz_example.basics_revision;

import helpers.Keyboard;

public class MultiplicationQuiz {

    public static void main(String[] args) {

        System.out.println("***-- Multiplication Quiz --***");

        newTest(5);
    } 

    public static void newTest(int mulTable) {
        int score = 0;
        // an algorithm for generating questions for any mulTable

        // create a String[] to store my questions
        String[] questions = new String[5]; 
        // create an int[] to store my answers
        int[] answers = new int[5]; 

        // arrays love for loops
        for(int i = 0; i < questions.length; i++) {
            // generate the question e.g., 1 X 5 =
            answers[i] = (i + 1) * mulTable;
            questions[i] = "" + (i + 1) + " X " + mulTable + "=";
        }

        // loop through the questions to test the student
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int userAnswer = Keyboard.readInt(); 
            // how do I check that the userAnswer is correct?
            if (userAnswer == answers[i]) {
                score = score + 1;
            }
        }

        if (score == 5) {
            System.out.println("Wow, full marks!");
        } else {
            System.out.println("You need a bit more practice.");
        }
    }
}
