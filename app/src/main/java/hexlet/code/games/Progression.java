package hexlet.code.games;

import java.lang.reflect.Array;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

import hexlet.code.Engine;

public class Progression {

    public static void runProgression() {
        String rules = "What number is missing in the progression?";
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(rules, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        int countOfRound = 3;
        String[][] questionsAndCorrectAnswers = new String[countOfRound][2];
        for (int i = 0; i < countOfRound; i++) {
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
        int arraySize = 10;
        String[] result = new String[arraySize];
        for (int i = 0; i < result.length; i++) {
            number = number + step;
            result[i] = String.valueOf(number);
        }
        return result;
    }

    private static int generatorProgressionStep() {
        int progressionNumberstart = 2;
        int progressionNumberfinish = 6;
        Random rand = new Random();
        return rand.nextInt(progressionNumberstart, progressionNumberfinish);
    }

    private static int generatorDotes() {
        int start = 1;
        int finish = 10;
        Random rand = new Random();
        return rand.nextInt(start, finish);
    }
}
