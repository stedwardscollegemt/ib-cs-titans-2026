package oop_2_quiz_example.oop_refactor;

public class MultQuizLearningLogic extends MultQuizTestLogic {
    
    public MultQuizLearningLogic(int numberOfQuestions, int mulTable) {
        // just use my parent's
        super(12, mulTable);
    }

    @Override
    public void initTest(int mulTable) {
        // logic unqiue to this class only
        System.out.println("Here I am learning.");
    }
}
