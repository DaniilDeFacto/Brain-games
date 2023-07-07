package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 100;
    public static void startGame() {
        var rule = "Find the greatest common divisor of given numbers.";
        String[][] terms = new String[ROUNDS_COUNT][2];
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            int number1 = (int) (Math.random() * NUMBER_RANGE) + 1;
            int number2 = (int) (Math.random() * NUMBER_RANGE) + 1;
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
