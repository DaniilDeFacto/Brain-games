package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.next());
        switch (choice) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Even.startGame(Cli.greet());
                break;
            case 3:
                Calc.startGame(Cli.greet());
                break;
            case 4:
                GCD.startGame(Cli.greet());
                break;
            case 5:
                Progression.startGame(Cli.greet());
                break;
            case 6:
                Prime.startGame(Cli.greet());
                break;
            default:
        }
    }
}
