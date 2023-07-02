package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void startGame(String userName) {
        System.out.println("What number is missing in the progression?");
        for (var i = 1; i <= 3; i++) {
            int startNumber = (int) (Math.random() * 30);
            int step = (int) (Math.random() * 10) + 1;
            String task = Integer.toString(startNumber);
            String correctAnswer = "";
            int gap = (int) (Math.random() * 9);
            for (var j = 0; j < 9; j++) {
                startNumber += step;
                if (j == gap) {
                    task += " " + "..";
                    correctAnswer = Integer.toString(startNumber);
                } else {
                    task += " " + startNumber;
                }
            }
            Engine.gameLogic(userName, task, correctAnswer, i);
        }
    }
}
