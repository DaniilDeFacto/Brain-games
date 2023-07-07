package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 20;
    public static final int NUMBERS_COUNT = 9;

    public static void startGame() {
        var rule = "What number is missing in the progression?";
        String[][] terms = new String[3][2];
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            int startNumber = (int) (Math.random() * NUMBER_RANGE);
            int step = (int) (Math.random() * NUMBER_RANGE) + 1;
            terms[i][0] = Integer.toString(startNumber);
            int gap = (int) (Math.random() * NUMBERS_COUNT);
            for (var j = 0; j < NUMBERS_COUNT; j++) {
                startNumber += step;
                if (j == gap) {
                    terms[i][0] += " " + "..";
                    terms[i][1] = Integer.toString(startNumber);
                } else {
                    terms[i][0] += " " + startNumber;
                }
            }
        }
        Engine.gameLogic(rule, terms);
    }
}
