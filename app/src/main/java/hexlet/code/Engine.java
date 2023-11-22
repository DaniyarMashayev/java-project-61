package hexlet.code;

import java.util.Scanner;
import java.util.Random;

import static hexlet.code.games.Even.checkAnswerEven;
import static hexlet.code.games.Even.printQuestionEven;
import static hexlet.code.games.Calc.checkAnswerCalc;
import static hexlet.code.games.Calc.printQuestionCalc;
import static hexlet.code.games.GreatestCommonDivisor.checkAnswerGCD;
import static hexlet.code.games.GreatestCommonDivisor.printQuestionGCD;
import static hexlet.code.games.Progression.printQuestionProgression;
import static hexlet.code.games.Progression.checkAnswerProgression;
import static hexlet.code.games.Calc.generatorMathOperator;
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
                question = printQuestionEven(number1);
            } else if (USERCHOICE.equals("3")) {
                question = printQuestionCalc(number1, number2, operator);
            } else if (USERCHOICE.equals("4")) {
                question = printQuestionGCD(number1, number2);
            } else if (USERCHOICE.equals("5")) {
                question = printQuestionProgression(number1);
            }
            System.out.println("Question: " + question);
            String userAnswer = getUserAnswer();
            System.out.println("Your answer: " + userAnswer);
            String answer = null;
            if (USERCHOICE.equals("2")) {
                answer = checkAnswerEven(number1, userAnswer);
            } else if (USERCHOICE.equals("3")) {
                answer = checkAnswerCalc(number1, number2, operator);
            } else if (USERCHOICE.equals("4")) {
                answer = checkAnswerGCD(number1, number2);
            } else if (USERCHOICE.equals("5")) {
                answer = checkAnswerProgression();
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
    private static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
