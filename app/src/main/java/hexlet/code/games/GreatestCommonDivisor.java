package hexlet.code.games;
public class GreatestCommonDivisor {
    public static String checkAnswerGCD(int number1, int number2) {
        if (number2 == 0) {
            return String.valueOf(number1);
        }
        return checkAnswerGCD(number2, number1 % number2);
    }
    public static String printQuestionGCD(int number1, int number2) {
        return String.valueOf(number1) + " " + String.valueOf(number2);
    }
}
