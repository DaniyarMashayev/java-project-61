package hexlet.code.games;

import java.lang.reflect.Array;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public class Progression {
    public static String value = null;
    public static String printQuestionProgression(int number) {
        int step = generatorProgressionStep();
        int indexOfDots = generatorTwoDotes();
        String[] result = new String[10];
        for (int i = 0; i < 10; i++) {
            number = number + step;
            result[i] = String.valueOf(number);
        }
        value = (String) Array.get(result, indexOfDots);
        result[indexOfDots] = "..";
        return StringUtils.join(result, " ");
    }

    public static String checkAnswerProgression() {
        return value;
    }

    private static int generatorProgressionStep() {
        Random rand = new Random();
        return rand.nextInt(2, 6);
    }
    private static int generatorTwoDotes() {
        Random rand = new Random();
        return rand.nextInt(3, 10);
    }
}
