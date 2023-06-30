package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void startGame(String userName) {
        System.out.println("What is the result of the expression?");
        for (var i = 1; i <= 3; i++) {
            int operand1 = (int) (Math.random() * 100);
            int operand2 = (int) (Math.random() * 100);
            String task = "";
            String correctAnswer = "";
            int operator = (int) (Math.random() * 3);
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
