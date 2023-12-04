package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.COUNTOFROUND;

public class GreatestCommonDivisor {
    private static final String GAMERULES = "Find the greatest common divisor of given numbers.";

    public static void runGCD() {
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(GAMERULES, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        String[][] questionsAndCorrectAnswers = new String[COUNTOFROUND][2];
        for (int i = 0; i < COUNTOFROUND; i++) {
            int number1 = Utils.generatorNumber();
            int number2 = Utils.generatorNumber();
            String question = (number1) + " " + (number2);
            String correctAnswer = String.valueOf(findGCD(number1, number2));
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        return questionsAndCorrectAnswers;
    }

    private static int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }
}
