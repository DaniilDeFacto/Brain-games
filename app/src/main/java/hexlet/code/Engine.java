package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void gameLogic(String rule, String[][] terms) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);
        var winsCount = 0;
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + terms[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(terms[i][1])) {
                System.out.println("Correct!");
                winsCount += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + terms[i][1] + "'." + "\nLet's try again, " + userName + "!");
                break;
            }
        }
        if (winsCount == ROUNDS_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
