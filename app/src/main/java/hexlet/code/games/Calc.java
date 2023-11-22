package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String checkAnswerCalc(int number1, int number2, String operator) {
        int resultCalc = 0;
        if (operator.equals("+")) {
            resultCalc = number1 + number2;
        } else if (operator.equals("-")) {
            resultCalc = number1 - number2;
        } else if (operator.equals("*")) {
            resultCalc = number1 * number2;
        }
        return String.valueOf(resultCalc);
    }
    public static String printQuestionCalc(int number1, int number2, String operator) {
        return String.valueOf(number1) + " " + operator + " " + String.valueOf(number2);
    }
    public static String generatorMathOperator() {
        Random rand = new Random();
        int number = rand.nextInt(3);
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
