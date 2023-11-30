package hexlet.code.games;

import java.lang.reflect.Array;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

import hexlet.code.Engine;

public class Progression {
    private static final int COUNTOFROUND = 3;
    private static final int ARRAYSIZE = 10;
    private static final int PROGRESSIONSTEPBOUND = 6;
    private static final int DOTESBOUND = 10;

    public static void runProgression() {
        String rules = "What number is missing in the progression?";
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(rules, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        String[][] questionsAndCorrectAnswers = new String[COUNTOFROUND][2];
        for (int i = 0; i < COUNTOFROUND; i++) {
            int number = Engine.generatorNumber();
            int step = generatorProgressionStep();
            int indexOfDots = generatorDotes();
            questionsAndCorrectAnswers[i][0] = getAnswer(number, step, indexOfDots);
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(number, step, indexOfDots);
        }
        return questionsAndCorrectAnswers;
    }

    private static String getCorrectAnswer(int number, int step, int indexOfDots) {
        String[] result = getArrayNumbers(number, step);
        return (String) Array.get(result, indexOfDots);
    }

    private static String getAnswer(int number, int step, int indexOfDots) {
        String[] result = getArrayNumbers(number, step);
        result[indexOfDots] = "..";
        return StringUtils.join(result, " ");
    }

    private static String[] getArrayNumbers(int number, int step) {
        String[] result = new String[ARRAYSIZE];
        for (int i = 0; i < result.length; i++) {
            number = number + step;
            result[i] = String.valueOf(number);
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
