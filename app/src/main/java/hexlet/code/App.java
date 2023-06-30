package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");
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
            default:
        }
    }
}
