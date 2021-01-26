package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {

        int difyear = inputYear - getYear();
        return Math.abs(difyear);
    }

    public void setYear(int yearOfProduction) {
        if (yearOfProduction < 0) {
            System.out.println("Вы ввели не правильное значение");
        } else {
            year = yearOfProduction;
        }
    }

    public int getYear() {
        return year;
    }

    public void setColor(String carColor) {
        if (carColor.isEmpty()) {
            System.out.println("Вы не ввели цвет авто!");
        } else {
            color = carColor;
        }
    }

    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        if (carModel.isEmpty()) {
            System.out.println("Вы не ввели модель авто!");
        } else {
            model = carModel;
        }
    }

    public String getModel() {
        return model;
    }
}
