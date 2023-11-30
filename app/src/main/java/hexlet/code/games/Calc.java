package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class Calc {
    public static void runCalc() {
        String rules = "What is the result of the expression?";
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(rules, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        int countOfRound = 3;
        String[][] questionsAndCorrectAnswers = new String[countOfRound][2];
        for (int i = 0; i < countOfRound; i++) {
            int number1 = Engine.generatorNumber();
            int number2 = Engine.generatorNumber();
            String operator = generatorMathOperator();
            questionsAndCorrectAnswers[i][0] = String.valueOf(number1) + " "
                    + operator + " " + String.valueOf(number2);
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(number1, number2, operator);
        }
        return questionsAndCorrectAnswers;
    }

    private static String getCorrectAnswer(int number1, int number2, String operator) {
        int correctAnswer = 0;
        if (operator.equals("+")) {
            correctAnswer = number1 + number2;
        } else if (operator.equals("-")) {
            correctAnswer = number1 - number2;
        } else if (operator.equals("*")) {
            correctAnswer = number1 * number2;
        }
        return String.valueOf(correctAnswer);
    }

    private static String generatorMathOperator() {
        Random rand = new Random();
        int numberGeneratorOperator = 3;
        int number = rand.nextInt(numberGeneratorOperator);
        String operator = " ";
        if (number == 0) {
            operator = "+";
        } else if (number == 1) {
            operator = "-";
        } else if (number == 2) {
            operator = "*";
        }
        return operator;
    }
}
