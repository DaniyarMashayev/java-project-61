package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.playGame;
import static hexlet.code.GlobalVar.USERNAME;

public class App {
    public static final String USERCHOICE = getUserChoice();
    public static void main(String[] args) {
        if (USERCHOICE.equals("1")) {
            System.out.println("Your choice: " + USERCHOICE);
            System.out.println();
            greetingUser();
        } else if (USERCHOICE.equals("2")) {
            System.out.println("Your choice: " + USERCHOICE);
            System.out.println();
            greetingUser();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            playGame();
        } else if (USERCHOICE.equals("3")) {
            System.out.println("Your choice: " + USERCHOICE);
            System.out.println();
            greetingUser();
            System.out.println("What is the result of the expression?");
            playGame();
        } else if (USERCHOICE.equals("4")) {
            System.out.println("Your choice: " + USERCHOICE);
            System.out.println();
            greetingUser();
            System.out.println("Find the greatest common divisor of given numbers");
            playGame();
        } else if (USERCHOICE.equals("0")) {
            return;
        }
    }

    private static String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        String choice = scanner.next();
        return choice;
    }

    public static void greetingUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        System.out.println("Hello, " + USERNAME + "!");
    }
}
