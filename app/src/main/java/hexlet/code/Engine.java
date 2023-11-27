package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static int countOfRound = 3;
    static String userName;
    static Scanner scanner = new Scanner(System.in);

    public static void runEngine(String rules, String[][] questionsAndCorrectAnswers) {
        greeting();
        System.out.println(rules);
        for (int i = 0; i < countOfRound; i++) {
            String question = questionsAndCorrectAnswers[i][0];
            String correctAnswer = questionsAndCorrectAnswers[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    private static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static int generatorNumber() {
        Random rand = new Random();
        return rand.nextInt(1, 100);
    }
}
