package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void startGame(String userName) {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 1; i <= 3; i++) {
            int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 100);
            String task = number1 + " " + number2;
            int minNumber = Math.min(number1, number2);
            String correctAnswer = "";
            for (var j = minNumber; j >= 1; j--) {
                if (number1 % j == 0 && number2 % j == 0) {
                    correctAnswer += j;
                    break;
                }
            }
            Engine.gameLogic(userName, task, correctAnswer, i);
        }
    }
}
