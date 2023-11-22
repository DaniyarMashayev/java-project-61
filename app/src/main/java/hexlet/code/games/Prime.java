package hexlet.code.games;

public class Prime {
    public static int number;
    public static String printQuestionPrime(int number1) {
        number = number1;
        return String.valueOf(number);
    }
    public static String checkAnswerPrime() {
        String result = null;
        if (isPrime()) {
            result = "yes";
        } else if (!isPrime()) {
            result = "no";
        }
        return result;
    }
    private static boolean isPrime() {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
