package hexlet.code.games;

public class Even {
    public static String checkAnswer(int number, String userAnswer) {
        String result = null;
        if (number % 2 == 0) {
            if (userAnswer.equals("yes")) {
                result = "yes";
            } else if (userAnswer.equals("no")) {
                result = "yes";
            } else {
                result = "yes";
            }
        } else if (number % 2 == 1) {
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
