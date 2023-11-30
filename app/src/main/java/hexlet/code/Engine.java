package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    private static final int COUNTOFROUND = 3;
    private static final int GENERATORNUMBERBOUND = 100;

    public static void runEngine(String rules, String[][] questionsAndCorrectAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
        for (int i = 0; i < COUNTOFROUND; i++) {
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

    public static int generatorNumber() {
        int origin = 1;
        Random rand = new Random();
        return rand.nextInt(origin, GENERATORNUMBERBOUND);
    }
}
