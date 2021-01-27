package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing",1990,150,15000);
        Airplane airplane2 = new Airplane("Airbus",2000, 1500,16000);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}