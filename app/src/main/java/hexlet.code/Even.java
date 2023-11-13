package hexlet.code;

import java.util.Scanner;
import java.util.Random;
import static hexlet.code.GlobalVar.userName;

public class Even {
    public static void playEven () {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = rand.nextInt(100);
            System.out.println("Question: " + number);
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            String answer = checkCorrect(number, userAnswer);
            if (answer.equals("Correct!")) {
                System.out.println("Correct!");
            } else if (answer.equals("Not Correct Even")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                return;
            } else if (answer.equals("Not Correct Odd")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                return;
            } else {
                System.out.println("Please answer 'yes' or 'no'");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    private static String checkCorrect(int number, String userAnswer) {
        String result = null;
        if (number % 2 == 0) {
            result = getUserAnswerEven(userAnswer);
        } else if (number % 2 == 1) {
            result = getUserAnswerOdd(userAnswer);
        }
        return result;
    }

    private static String getUserAnswerEven(String userAnswer) {
        String result;
        switch (userAnswer) {
            case "yes":
                result = "Correct!";
                break;
            case "no":
                result = "Not Correct Even";
                break;
            default:
                result = "Please answer 'yes' or 'no'";
                break;
            }
        return result;
    }

    private static String getUserAnswerOdd(String userAnswer) {
        String result;
        switch (userAnswer) {
            case "no":
                result = "Correct!";
                break;
            case "yes":
                result = "Not Correct Odd";
                break;
            default:
                result = "Please answer 'yes' or 'no'";
                break;
            }
        return result;
    }
}
