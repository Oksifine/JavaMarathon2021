package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int playrstamina = random.nextInt(10) + 90;
        Player player1 = new Player(playrstamina);
        Player player2 = new Player(playrstamina);
        Player player3 = new Player(playrstamina);
        Player player4 = new Player(playrstamina);
        Player player5 = new Player(playrstamina);
        Player player6 = new Player(playrstamina);
        Player player7 = new Player(playrstamina);

        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();

        player1.info();
    }
}
