package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int BOUND = 100;
    public static Random random = new Random();

    public static int generatorNumber() {
        int origin = 1;
        return random.nextInt(origin, BOUND);
    }

    public static int generatorNumber(int origin, int bound) {
        return random.nextInt(origin, bound);
    }
}
