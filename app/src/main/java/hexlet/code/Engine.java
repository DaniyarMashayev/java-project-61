package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Even.checkAnswer;
import static hexlet.code.games.Calc.checkAnswer;

public class Engine {
    public static String playGame(String number) {
        String result = null;
        System.out.println("Question: " + number);
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);
        String answer = null;
        if (number.length() < 3) {
            answer = checkAnswer(number, userAnswer);
        } else if(number.length() > 3) {
            answer = checkAnswer(number);
        }
        if (answer.equals(userAnswer)) {
            System.out.println("Correct!");
            result = "correct";
        } else if (!answer.equals(userAnswer)) {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer + "'");
            result = "wrong";
        }
        return result;
    }
}
