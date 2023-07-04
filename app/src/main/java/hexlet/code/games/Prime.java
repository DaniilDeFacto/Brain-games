package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startGame(String userName) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 1; i <= 3; i++) {
            int number = (int) (Math.random() * 100);
            var prime = true;
            for (var j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    prime = false;
                    break;
                }
            }
            String correctAnswer = prime ? "yes" : "no";
            String task = Integer.toString(number);
            Engine.gameLogic(userName, task, correctAnswer, i);
        }
    }
}
