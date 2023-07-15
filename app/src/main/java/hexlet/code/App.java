package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCP = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.next());
        switch (choice) {
            case GREET -> Cli.greet();
            case EVEN -> Even.startGame();
            case CALC -> Calc.startGame();
            case GCP -> GCD.startGame();
            case PROGRESSION -> Progression.startGame();
            case PRIME -> Prime.startGame();
            default -> throw new Error("Unknown 'choice' value: " + choice);
        }
    }
}
