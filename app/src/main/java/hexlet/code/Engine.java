package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void gameLogic(String userName, String task, String correctAnswer, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + task);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'."
                    + "\nLet's try again, " + userName + "!");
            System.exit(0);
        }
        if (i == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
