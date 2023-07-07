package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 100;
    public static final int OPERATOR_RANGE = 3;
    public static void startGame() {
        var rule = "What is the result of the expression?";
        String[][] terms = new String[ROUNDS_COUNT][2];
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            int operand1 = (int) (Math.random() * NUMBER_RANGE);
            int operand2 = (int) (Math.random() * NUMBER_RANGE);
            int operator = (int) (Math.random() * OPERATOR_RANGE);
            switch (operator) {
                case 0:
                    terms[i][0] = operand1 + " + " + operand2;
                    terms[i][1] = Integer.toString(operand1 + operand2);
                    break;
                case 1:
                    terms[i][0] = operand1 + " - " + operand2;
                    terms[i][1] = Integer.toString(operand1 - operand2);
                    break;
                case 2:
                    terms[i][0] = operand1 + " * " + operand2;
                    terms[i][1] = Integer.toString(operand1 * operand2);
                    break;
                default:
            }
        }
        Engine.gameLogic(rule, terms);
    }
}
