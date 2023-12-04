package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.COUNTOFROUND;
import static hexlet.code.Utils.random;

public class Calc {
    private static final String GAMERULES = "What is the result of the expression?";
    private static final int OPERATORGENERATORNUMBER = 3;
    private static final String[] ARRAYOFOPERATORS = {"+", "-", "*"};

    public static void runCalc() {
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(GAMERULES, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        String[][] questionsAndCorrectAnswers = new String[COUNTOFROUND][2];
        for (int i = 0; i < COUNTOFROUND; i++) {
            int number1 = Utils.generatorNumber();
            int number2 = Utils.generatorNumber();
            String operator = generatorMathOperator();
            String question = String.valueOf(number1) + " " + operator + " " + String.valueOf(number2);
            String correctAnswer = String.valueOf(calculate(number1, number2, operator));
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = correctAnswer;
        }
        return questionsAndCorrectAnswers;
    }

    private static int calculate(int number1, int number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                System.out.println("Wrong calculation");
                return 0;
        }
    }

    private static String generatorMathOperator() {
        int indexOfArray = random.nextInt(OPERATORGENERATORNUMBER);
        return ARRAYOFOPERATORS[indexOfArray];
    }
}
