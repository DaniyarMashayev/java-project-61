package hexlet.code.games;

import java.lang.reflect.Array;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

import hexlet.code.Engine;
import static hexlet.code.Engine.countOfRound;

public class Progression {
    public static String value = null;

    public static void runProgression() {
        String rules = "What number is missing in the progression?";
        String[][] questionsAndCorrectAnswers = getQuestionsAndCorrectAnswers();
        Engine.runEngine(rules, questionsAndCorrectAnswers);
    }
    private static String[][] getQuestionsAndCorrectAnswers() {
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
        String[] result = new String[10];
        for (int i = 0; i < 10; i++) {
            number = number + step;
            result[i] = String.valueOf(number);
        }
        return (String) Array.get(result, indexOfDots);
    }
    private static String getAnswer(int number, int step, int indexOfDots) {
        String[] result = new String[10];
        for (int i = 0; i < 10; i++) {
            number = number + step;
            result[i] = String.valueOf(number);
        }
        result[indexOfDots] = "..";
        return StringUtils.join(result, " ");
    }
    private static int generatorProgressionStep() {
        Random rand = new Random();
        return rand.nextInt(2, 6);
    }
    private static int generatorDotes() {
        Random rand = new Random();
        return rand.nextInt(1, 10);
    }
}
