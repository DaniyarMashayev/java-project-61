package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void runPrime() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(rules, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        int countOfRound = 3;
        String[][] questionsAndCorrectAnswers = new String[countOfRound][2];
        for (int i = 0; i < countOfRound; i++) {
            int number = Engine.generatorNumber();
            String answer = String.valueOf(number);
            questionsAndCorrectAnswers[i][0] = answer;
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(number);
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
