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
            terms[i] = generateRoundData();
        }
        Engine.gameLogic(rule, terms);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int startNumber = Utils.generateNumber(1, NUMBER_RANGE);
        int step = Utils.generateNumber(1, NUMBER_RANGE);
        int gap = Utils.generateNumber(0, NUMBERS_COUNT);
        roundData[0] = getProgression(startNumber, step, gap);
        roundData[1] = Integer.toString(startNumber + step * (gap + 1));
        return roundData;
    }

    public static String getProgression(int startNumber, int step, int gap) {
        var progression = Integer.toString(startNumber);
        for (var j = 0; j < NUMBERS_COUNT; j++) {
            startNumber += step;
            if (j == gap) {
                progression += " " + "..";
            } else {
                progression += " " + startNumber;
            }
        }
        return progression;
    }
}
