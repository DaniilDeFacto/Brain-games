package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int NUMBER_RANGE = 100;
    public static void startGame() {
        var rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
        roundData[1] = isPrime(number) ? "yes" : "no";
        return roundData;
    }

    public static boolean  isPrime(int number) {
        var prime = number >= 2;
        for (var j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
