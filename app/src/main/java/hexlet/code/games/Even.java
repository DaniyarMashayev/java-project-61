package hexlet.code.games;

import java.util.Random;
import static hexlet.code.Engine.playGame;
import static hexlet.code.GlobalVar.userName;
public class Even {
    public static void playEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            int number = rand.nextInt(100);
            String numberStr = String.valueOf(number);
            String result = playGame(numberStr);
            if (result.equals("wrong")) {
                System.out.println("Let's try again, " + userName + "!");
                return;
            } else if (result.equals("correct")) {
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

        public static String checkAnswer(String number, String userAnswer) {
        String result = null;
        if (Integer.valueOf(number) % 2 == 0) {
            if (userAnswer.equals("yes")) {
                result = "yes";
            } else if (userAnswer.equals("no")) {
                result = "yes";
            } else {
                result = "yes";
            }
        } else if (Integer.valueOf(number) % 2 == 1) {
            if (userAnswer.equals("no")) {
                result = "no";
            } else if (userAnswer.equals("yes")) {
                result = "no";
            } else {
                result = "no";
            }
        }
        return result;
    }
}
