package hexlet.code.games;

import java.util.Random;
import static hexlet.code.GlobalVar.USERNAME;
import static hexlet.code.Engine.playGame;

public class Calc {
    public static void playCalc() {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            String operator = generatorMathOperator();
            Random rand = new Random();
            int number1 = rand.nextInt(100);
            int number2 = rand.nextInt(100);
            String numberStr = String.valueOf(number1) + " " + operator + " " + String.valueOf(number2);
            String result = playGame(numberStr);
            if (result.equals("wrong")) {
                System.out.println("Let's try again, " + USERNAME + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + USERNAME + "!");
    }

    public static String checkAnswer(String number) {
        System.out.println(number);
        String[] numbers = number.split(" ");
        int number1 = Integer.valueOf(numbers[0]);
        String operator = numbers[1];
        int number2 = Integer.valueOf(numbers[2]);
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

    private static String generatorMathOperator() {
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
