package hexlet.code.games;

import java.lang.reflect.Array;
import org.apache.commons.lang3.StringUtils;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.COUNTOFROUND;

public class Progression {
    private static final String GAMERULES = "What number is missing in the progression?";
    private static final int ARRAYSIZEORIGIN = 5;
    private static final int ARRAYSIZEBOUND = 11;
    private static final int PROGRESSIONSTEPBOUND = 6;

    public static void runProgression() {
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(GAMERULES, questionsAndCorrectAnswers);
    }

    private static String[][] getQuestionsAndCorrectAnswers() {
        String[][] questionsAndCorrectAnswers = new String[COUNTOFROUND][2];
        for (int i = 0; i < COUNTOFROUND; i++) {
            int number = Utils.generatorNumber();
            int step = generateProgressionStep();
            int arraySize = generateArraySize();
            int[] progression = generateProgression(number, step, arraySize);
            int indexOfDots = generateDotes(arraySize);
            String question = generateQuestion(number, step, indexOfDots, progression);
            int correctAnswer = generateData(number, step, indexOfDots, progression);
            questionsAndCorrectAnswers[i][0] = question;
            questionsAndCorrectAnswers[i][1] = String.valueOf(correctAnswer);
        }
        return questionsAndCorrectAnswers;
    }

    private static int generateData(int number, int step, int indexOfDots, int[] progression) {
        return (int) Array.get(progression, indexOfDots);
    }

    private static String generateQuestion(int number, int step, int indexOfDots, int[] progression) {
        String[] result = new String[progression.length];
        for (int i = 0; i < progression.length; i++) {
            result[i] = String.valueOf(progression[i]);
        }
        result[indexOfDots] = "..";
        return StringUtils.join(result, " ");
    }

    private static int[] generateProgression(int number, int step, int arraySize) {
        int[] result = new int[arraySize];
        for (int i = 0; i < result.length; i++) {
            number = number + step;
            result[i] = number;
        }
        return result;
    }

    private static int generateArraySize() {
        return Utils.generatorNumber(ARRAYSIZEORIGIN, ARRAYSIZEBOUND);
    }

    private static int generateProgressionStep() {
        int origin = 2;
        return Utils.generatorNumber(origin, PROGRESSIONSTEPBOUND);
    }

    private static int generateDotes(int arraySize) {
        int origin = 2;
        int dotesBound = arraySize;
        return Utils.generatorNumber(origin, dotesBound);
    }
}
