package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Even.playEven;
import static hexlet.code.GlobalVar.userName;

public class App {
    public static void main(String[] args) {
        String userChoice = getUserChoice();
        if (userChoice.equals("1")) {
            System.out.println("Your choice: " + userChoice);
            System.out.println();
            greetingUser();
        } else if (userChoice.equals("2")) {
            System.out.println("Your choice: " + userChoice);
            System.out.println();
            greetingUser();
            playEven();
        } else if (userChoice.equals("0")) {
            return;
        }
    }

    private static String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String choice = scanner.next();
        return choice;
    }

    public static void greetingUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        System.out.println("Hello, " + userName + "!");
    }

}
