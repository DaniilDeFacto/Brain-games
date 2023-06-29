package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void startGame(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 1; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int task = (int) (Math.random() * 100);
            String correctAnswer = task % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + task);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'."
                        + "\nLet's try again, " + userName + "!");
                break;
            }
            if (i == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}