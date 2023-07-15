package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int NUMBER_RANGE = 100;
    public static final int OPERATOR_RANGE = 2;
    public static void startGame() {
        var rule = "What is the result of the expression?";
        String[][] terms = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            terms[i] = generateRoundData();
        }
        Engine.gameLogic(rule, terms);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int operand1 = Utils.generateNumber(1, NUMBER_RANGE);
        int operand2 = Utils.generateNumber(1, NUMBER_RANGE);
        int operator = Utils.generateNumber(0, OPERATOR_RANGE);
        roundData[0] = formatQuestion(operand1, operand2, operator);
        roundData[1] = Integer.toString(calculate(operand1, operand2, operator));
        return roundData;
    }

    public static String formatQuestion(int operand1, int operand2, int operator) {
        return operand1 + " " + "+-*".charAt(operator) + " " + operand2;
    }

    public static int calculate(int operand1, int operand2, int operator) {
        switch (operator) {
            case 0:
                return operand1 + operand2;
            case 1:
                return operand1 - operand2;
            case 2:
                return operand1 * operand2;
            default:
                throw new Error("Unknown 'operator' value: " + operator);
        }
    }
}
