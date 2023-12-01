package hexlet.code.games;

import java.lang.reflect.Array;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.COUNTOFROUND;

public class Progression {
    private static final String GAMERULES = "What number is missing in the progression?";
    private static final int ARRAYSIZE = 10;
    private static final int PROGRESSIONSTEPBOUND = 6;
    private static final int DOTESBOUND = 10;

    public static void runProgression() {
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(GAMERULES, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        String[][] questionsAndCorrectAnswers = new String[COUNTOFROUND][2];
        for (int i = 0; i < COUNTOFROUND; i++) {
            int number = Utils.generatorNumber();
            int step = generatorProgressionStep();
            int indexOfDots = generatorDotes();
            String question = getAnswer(number, step, indexOfDots);
            int correctAnswer = getCorrectAnswer(number, step, indexOfDots);
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = String.valueOf(correctAnswer);
        }
        return questionsAndCorrectAnswers;
    }

    private static int getCorrectAnswer(int number, int step, int indexOfDots) {
        int[] result = getArrayOfNumbers(number, step);
        return (int) Array.get(result, indexOfDots);
    }

    private static String getAnswer(int number, int step, int indexOfDots) {
        int[] arrayNumber = getArrayOfNumbers(number, step);
        String[] result = new String[arrayNumber.length];
        for (int i = 0; i < arrayNumber.length; i++) {
            result[i] = String.valueOf(arrayNumber[i]);
        }
        result[indexOfDots] = "..";
        return StringUtils.join(result, " ");
    }

    private static int[] getArrayOfNumbers(int number, int step) {
        int[] result = new int[ARRAYSIZE];
        for (int i = 0; i < result.length; i++) {
            number = number + step;
            result[i] = number;
        }
        return result;
    }

    private static int generatorProgressionStep() {
        int origin = 2;
        Random rand = new Random();
        return rand.nextInt(origin, PROGRESSIONSTEPBOUND);
    }

    private static int generatorDotes() {
        int origin = 1;
        Random rand = new Random();
        return rand.nextInt(origin, DOTESBOUND);
    }
}
