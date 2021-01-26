package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 1999, 45, 1500);
        airplane.fillUp(500);
        airplane.fillUp(250);
        airplane.info();
    }

}
