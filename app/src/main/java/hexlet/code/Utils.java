package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int BOUND = 100;

    public static int generatorNumber() {
        int origin = 1;
        Random random = new Random();
        return random.nextInt(origin, BOUND);
    }
}
