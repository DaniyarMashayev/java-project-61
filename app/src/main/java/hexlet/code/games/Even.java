package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.COUNTOFROUND;

public class Even {
    private static final String GAMERULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEven() {
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(GAMERULES, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        String[][] questionsAndCorrectAnswers = new String[COUNTOFROUND][2];
        for (int i = 0; i < COUNTOFROUND; i++) {
            int number = Utils.generatorNumber();
            String question = String.valueOf(number);
            String correctAnswer = isEven(number) ? "yes" : "no";
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        return questionsAndCorrectAnswers;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
