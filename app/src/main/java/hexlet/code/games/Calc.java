package hexlet.code.games;

public class Calc {
    public static String checkAnswer(int number1, int number2, String operator) {
        int resultCalc = 0;
        if (operator.equals("+")) {
            resultCalc = number1 + number2;
        } else if (operator.equals("-")) {
            resultCalc = number1 - number2;
        } else if (operator.equals("*")) {
            resultCalc = number1 * number2;
        }
        return String.valueOf(resultCalc);
    }
}
