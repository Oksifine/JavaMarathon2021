package day8;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println(airplane1.getProducer() + " длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println(airplane2.getProducer() + " длинее");
        } else {
            System.out.println("Самолеты одинаковой длинны");
        }
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void fillUp(int n) {
        fuel = fuel + n;
    }

    public void info() {
        System.out.println("Изготовитель: " + getProducer() + ", год выпуска: " + getYear() + ", длина: " + getLength() + ", вес: " + getWeight() + ", количество топлива в баке: " + getFuel());
    }

    @Override
    public String toString() {
        return "Изготовитель: " + getProducer() + ", год выпуска: " + getYear() + ", длина: " + getLength() + ", вес: " + getWeight() + ", количество топлива в баке: " + getFuel();
    }
}
