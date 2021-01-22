package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы узнать результат деления двух чисел ведите эти два числа через пробел");

        for (int i = 0; i <= 4; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0) {
                System.out.println("Деление на 0");
            }
            if (b != 0) {
                System.out.println(a / b);
            }
        }
    }
}
