package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGame(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 1; i <= 3; i++) {
            int number = (int) (Math.random() * 100);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            String task = Integer.toString(number);
            Engine.gameLogic(userName, task, correctAnswer, i);
        }
    }
}
