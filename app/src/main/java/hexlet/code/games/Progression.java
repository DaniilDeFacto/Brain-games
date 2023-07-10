package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int NUMBER_RANGE = 20;
    public static final int NUMBERS_COUNT = 9;

    public static void startGame() {
        var rule = "What number is missing in the progression?";
        String[][] terms = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int startNumber = Utils.generateNumber(1, NUMBER_RANGE);
            int step = Utils.generateNumber(1, NUMBER_RANGE);
            terms[i][0] = Integer.toString(startNumber);
            int gap = Utils.generateNumber(0, NUMBERS_COUNT);
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
