package hexlet.code;

import java.util.Scanner;

public class GlobalVar {
    final static String userName = getUserName();

    private static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return name;
    }
}
