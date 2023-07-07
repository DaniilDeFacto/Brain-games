package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 100;
    public static void startGame() {
        var rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] terms = new String[ROUNDS_COUNT][2];
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            int number = (int) (Math.random() * NUMBER_RANGE);
            terms[i][0] = Integer.toString(number);
            terms[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.gameLogic(rule, terms);
    }
}
