package hexlet.code;

import java.util.Scanner;
import java.util.Random;

import static hexlet.code.games.Even.checkAnswer;
import static hexlet.code.games.Calc.checkAnswer;
import static hexlet.code.games.GreatestCommonDivisor.checkAnswer;
import static hexlet.code.App.USERCHOICE;
import static hexlet.code.GlobalVar.USERNAME;

public class Engine {
    public static void playGame() {
        for (int i = 0; i < 3; i++) {
            int number1 = generatorNumber();
            int number2 = generatorNumber();
            String operator = generatorMathOperator();
            String question = null;
            if (USERCHOICE.equals("2")) {
                question = printQuestion(number1);
            } else if (USERCHOICE.equals("3")) {
                question = printQuestion(number1, number2, operator);
            } else if (USERCHOICE.equals("4")) {
                question = printQuestion(number1, number2);
            }
            System.out.println("Question: " + question);
            String userAnswer = getUserAnswer();
            System.out.println("Your answer: " + userAnswer);
            String answer = null;
            if (USERCHOICE.equals("2")) {
                answer = checkAnswer(number1, userAnswer);
            } else if (USERCHOICE.equals("3")) {
                answer = checkAnswer(number1, number2, operator);
            } else if (USERCHOICE.equals("4")) {
                answer = checkAnswer(number1, number2);
            }
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else if (!userAnswer.equals(answer)) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                    + "'" + answer + "'");
                System.out.println("Let's try again, " + USERNAME + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + USERNAME + "!");
    }
    private static int generatorNumber() {
        Random rand = new Random();
        return rand.nextInt(1, 100);
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
    private static String printQuestion(int number) {
        return String.valueOf(number);
    }

    private static String printQuestion(int number1, int number2, String operator) {
        return String.valueOf(number1) + " " + operator + " " + String.valueOf(number2);
    }

    private static String printQuestion(int number1, int number2) {
        return String.valueOf(number1) + " " + String.valueOf(number2);
    }

    private static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
