package hexlet.code;

import java.util.Scanner;

public class GlobalVar {
    public final static String userName = getUserName();

    private static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
