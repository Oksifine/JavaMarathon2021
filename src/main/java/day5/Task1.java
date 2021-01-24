package day5;
//   Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
//   Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
//   Задать значение для каждого поля, используя set методы.
//   Вывести в консоль значение каждого из полей, используя get методы.
//   Созданный вами класс должен отвечать принципам инкапсуляции.

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2017);
        car.setColor("белая");
        car.setModel("Audi A4");

        System.out.println("У меня " + car.getColor() + " " + car.getModel() + " " + car.getYear() + " года выпуска.");
    }
}

class Car {
    private int year;
    private String color;
    private String model;

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



