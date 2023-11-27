package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.countOfRound;

public class GreatestCommonDivisor {
    public static void runGCD() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(rules, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        String[][] questionsAndCorrectAnswers = new String[countOfRound][2];
        for (int i = 0; i < countOfRound; i++) {
            int number1 = Engine.generatorNumber();
            int number2 = Engine.generatorNumber();
            questionsAndCorrectAnswers[i][0] = String.valueOf(number1) + " " + String.valueOf(number2);
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(number1, number2);
        }
        return questionsAndCorrectAnswers;
    }

    private static String getCorrectAnswer(int number1, int number2) {
        if (number2 == 0) {
            return String.valueOf(number1);
        }
        return getCorrectAnswer(number2, number1 % number2);
    }
}
