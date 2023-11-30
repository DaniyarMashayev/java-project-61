package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Even.runEven;
import static hexlet.code.games.Calc.runCalc;
import static hexlet.code.games.GreatestCommonDivisor.runGCD;
import static hexlet.code.games.Progression.runProgression;
import static hexlet.code.games.Prime.runPrime;

public class App {

    public static void main(String[] args) {
        printMenu();
        runGames();
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println();
    }

    private static void runGames() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        switch (userChoice) {
            case ("1"):
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = scanner.next();
                System.out.println("Hello, " + userName + "!");
                break;
            case ("2"):
                runEven();
                break;
            case ("3"):
                runCalc();
                break;
            case ("4"):
                runGCD();
                break;
            case ("5"):
                runProgression();
                break;
            case ("6"):
                runPrime();
                break;
            default:
                break;
        }
        scanner.close();
    }
}
