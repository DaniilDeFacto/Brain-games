package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 100;
    public static final int OPERATOR_RANGE = 3;
    public static void startGame(String userName) {
        System.out.println("What is the result of the expression?");
        for (var i = 1; i <= ROUNDS_COUNT; i++) {
            int operand1 = (int) (Math.random() * NUMBER_RANGE);
            int operand2 = (int) (Math.random() * NUMBER_RANGE);
            String task = "";
            String correctAnswer = "";
            int operator = (int) (Math.random() * OPERATOR_RANGE);
            switch (operator) {
                case 0:
                    task += operand1 + " + " + operand2;
                    correctAnswer = Integer.toString(operand1 + operand2);
                    break;
                case 1:
                    task += operand1 + " - " + operand2;
                    correctAnswer = Integer.toString(operand1 - operand2);
                    break;
                case 2:
                    task += operand1 + " * " + operand2;
                    correctAnswer = Integer.toString(operand1 * operand2);
                    break;
                default:
            }
            Engine.gameLogic(userName, task, correctAnswer, i);
        }
    }
}
