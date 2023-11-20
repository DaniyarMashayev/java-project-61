package hexlet.code;

import java.util.Scanner;

public class GlobalVar {
    public static final String USERNAME = getUserName();

    private static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
