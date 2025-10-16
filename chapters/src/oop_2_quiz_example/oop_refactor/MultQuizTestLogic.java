package oop_2_quiz_example.oop_refactor;

public class MultQuizTestLogic {

    /**
     * --- STATE: Declare Member Variables
     */
    String[] questions;
    
    int[] answers;

    int score;

    /**
     * --- BEHAVIOUR: Methods
     */
    public void initTest(int mulTable) {
        for(int i = 0; i < questions.length; i++) {
            // generate the question e.g., 1 X 5 =
            answers[i] = (i + 1) * mulTable;
            questions[i] = "" + (i + 1) + " X " + mulTable + "=";
        }
    }

    public void updateScore(int questionIndex, int userAnswer) {
        if (userAnswer == answers[questionIndex]) {
            score = score + 1;
        }
    }
}
