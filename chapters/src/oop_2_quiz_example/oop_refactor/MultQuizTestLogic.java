package oop_2_quiz_example.oop_refactor;

public class MultQuizTestLogic {

    /**
     * --- STATE: Declare Member Variables
     */
    private String[] questions;
    
    private int[] answers;

    private int score;

    /**
     * Constructor
     * @param numberOfQuestions
     */
    public MultQuizTestLogic(int numberOfQuestions, int mulTable) {
        score = 0;
        questions = new String[numberOfQuestions];
        answers = new int[numberOfQuestions];
        initTest(mulTable);
    }

    /**
     * --- Mutators and Accessors -------------------
     */
    // to read the score
    public int getScore() {
        return score;
    }

    public String[] getQuestions() {
        return questions;
    }

    public int[] getAnswers() {
        return answers;
    }

    /**
     * --- BEHAVIOUR: Methods
     */
    public void initTest(int mulTable) {
        System.out.println("Here I am being tested");
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
