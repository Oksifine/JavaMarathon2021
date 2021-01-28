package day7;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == MIN_STAMINA)
            return;
        stamina--;

        if (stamina == MIN_STAMINA)
            countPlayers--;

    }


    public static void info() {
        if (countPlayers < 6) {
            int leftplayers = 6 - countPlayers;
            switch (leftplayers) {
                case 1:
                    System.out.println("Команды не полные. На поле ёще есть " + leftplayers + " свободное место");
                    break;
                case 2:
                case 3:
                    System.out.println("Команды не полные. На поле ёще есть " + leftplayers + " свободных места");
                    break;
                case 4:
                case 5:
                    System.out.println("Команды не полные. На поле ёще есть " + leftplayers + " свободных мест");
                    break;

            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
