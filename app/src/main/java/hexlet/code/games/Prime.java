package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.COUNTOFROUND;

public class Prime {
    private static final String GAMERULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runPrime() {
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(GAMERULES, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        String[][] questionsAndCorrectAnswers = new String[COUNTOFROUND][2];
        for (int i = 0; i < COUNTOFROUND; i++) {
            int number = Utils.generatorNumber();
            String question = String.valueOf(number);
            String correctAnswer = getCorrectAnswer(number);
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        return questionsAndCorrectAnswers;
    }

    private static String getCorrectAnswer(int number) {
        return isPrime(number) ? "yes" : "no";
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
