package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int NUMBER_RANGE = 20;
    public static final int MIN_LENGTH = 5;
    public static final int MAX_LENGTH = 10;

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
        int length = Utils.generateNumber(MIN_LENGTH, MAX_LENGTH);
        String[] array = getProgression(startNumber, step, length);
        int gap = Utils.generateNumber(0, length - 1);
        roundData[1] = array[gap];
        array[gap] = "..";
        roundData[0] = String.join(" ", array);
        return roundData;
    }

    public static String[] getProgression(int startNumber, int step, int length) {
        String[] array = new String[length];
        for (var i = 0; i < length; i++) {
            array[i] = Integer.toString(startNumber + step * i);
        }
        return array;
    }
}
