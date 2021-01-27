package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina){
        this.stamina=stamina;
        if (countPlayers<6){
        countPlayers++;}
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
    public void run (){
        if (stamina>MIN_STAMINA){
        stamina =getStamina()-1;
        countPlayers=countPlayers-1;
        }
    }
    public static void info(){
        if (countPlayers<6){
            int leftplayers = 6 - countPlayers;
            System.out.println("Команды не полные. На поле ёще есть "+ leftplayers+" свободных мест");
        } else  if (countPlayers ==6){
            System.out.println("На поле нет свободных мест");
        }
    }
}
