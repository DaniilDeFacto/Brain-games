package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int NUMBER_RANGE = 100;
    public static void startGame() {
        var rule = "Find the greatest common divisor of given numbers.";
        String[][] terms = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = Utils.generateNumber(1, NUMBER_RANGE);
            int number2 = Utils.generateNumber(1, NUMBER_RANGE);
            terms[i][0] = number1 + " " + number2;
            int minNumber = Math.min(number1, number2);
            for (var j = minNumber; j >= 1; j--) {
                if (number1 % j == 0 && number2 % j == 0) {
                    terms[i][1] = Integer.toString(j);
                    break;
                }
            }
        }
        Engine.gameLogic(rule, terms);
    }
}
