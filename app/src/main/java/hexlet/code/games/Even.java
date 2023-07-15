package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int NUMBER_RANGE = 100;
    public static void startGame() {
        var rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] terms = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            terms[i] = generateRoundData();
        }
        Engine.gameLogic(rule, terms);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number = Utils.generateNumber(1, NUMBER_RANGE);
        roundData[0] = Integer.toString(number);
        roundData[1] = isEven(number) ? "yes" : "no";
        return roundData;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
