package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 100;
    public static void startGame(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 1; i <= ROUNDS_COUNT; i++) {
            int number = (int) (Math.random() * NUMBER_RANGE);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            String task = Integer.toString(number);
            Engine.gameLogic(userName, task, correctAnswer, i);
        }
    }
}
