package oop_2_quiz_example.oop_refactor;

public class UnitTestMultQuizTestLogic {

    public static MultQuizTestLogic mock;

    public static void main(String[] args) {

    }

    public static void initTestUnit() {
        // set up
        mock = new MultQuizTestLogic();

        // expected results
        String[] questions = {"1 X 5=", "2 X 5=", "3 X 5"};
        int[] answers = {5, 10, 15};

        // run the piece of code we want to test
        mock.initTest(5);

        // assertions - has it worked (pass/fail)
        boolean pass = true;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i] != mock.questions[i] || answers[i] != mock.answers[i]) {
                pass = false;
            }
        }

        if (pass) {
            System.out.println(". ");
        } else {
            System.out.println("F ");
        }

    }
    
}
