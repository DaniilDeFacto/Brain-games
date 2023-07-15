package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int NUMBER_RANGE = 100;
    public static void startGame() {
        var rule = "Find the greatest common divisor of given numbers.";
        String[][] terms = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            terms[i] = generateRoundData();
        }
        Engine.gameLogic(rule, terms);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number1 = Utils.generateNumber(1, NUMBER_RANGE);
        int number2 = Utils.generateNumber(1, NUMBER_RANGE);
        roundData[0] = number1 + " " + number2;
        roundData[1] = Integer.toString(getGCD(number1, number2));
        return roundData;
    }

    public static int getGCD(int number1, int number2) {
        int minNumber = Math.min(number1, number2);
        int gCD = 1;
        for (var i = minNumber; i >= 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gCD = i;
                break;
            }
        }
        return gCD;
    }
}
