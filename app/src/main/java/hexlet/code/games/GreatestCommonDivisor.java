package hexlet.code.games;
public class GreatestCommonDivisor {
    public static String checkAnswer(int number1, int number2) {
        if (number2 == 0) {
            return String.valueOf(number1);
        }
        return checkAnswer(number2, number1 % number2);
    }
}
