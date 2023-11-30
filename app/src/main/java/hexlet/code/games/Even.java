package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void runEven() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(rules, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        int countOfRound = 3;
        String[][] questionsAndCorrectAnswers = new String[countOfRound][2];
        for (int i = 0; i < countOfRound; i++) {
            int number = Engine.generatorNumber();
            questionsAndCorrectAnswers[i][0] = String.valueOf(number);
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(number);
        }
        return questionsAndCorrectAnswers;
    }

    private static String getCorrectAnswer(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
