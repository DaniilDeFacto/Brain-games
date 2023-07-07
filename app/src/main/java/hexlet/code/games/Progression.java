package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 30;
    public static final int NUMBERS_COUNT = 9;

    public static void startGame(String userName) {
        System.out.println("What number is missing in the progression?");
        for (var i = 1; i <= ROUNDS_COUNT; i++) {
            int startNumber = (int) (Math.random() * NUMBER_RANGE);
            int step = (int) (Math.random() * NUMBER_RANGE) + 1;
            String task = Integer.toString(startNumber);
            String correctAnswer = "";
            int gap = (int) (Math.random() * NUMBERS_COUNT);
            for (var j = 0; j < NUMBERS_COUNT; j++) {
                startNumber += step;
                if (j == gap) {
                    task += " " + "..";
                    correctAnswer = Integer.toString(startNumber);
                } else {
                    task += " " + startNumber;
                }
            }
            Engine.gameLogic(userName, task, correctAnswer, i);
        }
    }
}
