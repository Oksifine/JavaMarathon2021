package day6;

public class Task1 {
    public static void main(String[] args) {

        Motorbike motorbike1 = new Motorbike("BMW", "красный", 2017);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2020));

        Car car = new Car();
        car.setYear(2017);
        car.setColor("белая");
        car.setModel("Audi A4");
        car.info();
        System.out.println(car.yearDifference(2021));
    }

}
