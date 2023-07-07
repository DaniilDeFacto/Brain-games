package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 100;
    public static void startGame(String userName) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 1; i <= ROUNDS_COUNT; i++) {
            int number = (int) (Math.random() * NUMBER_RANGE);
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
