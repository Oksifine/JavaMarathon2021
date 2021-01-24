package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = scanner.nextInt();
        int[] matrix = new int[x];
        int b = 0, a = 0, c = 0, d = 0, e = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(10);
            System.out.print(matrix[i] + " ");
            b = b + matrix[i];
            if (matrix[i] == 1) {
                a = a + 1;
            }
            if (matrix[i] > 8) {
                c = c + 1;
            }
            if (matrix[i] % 2 == 0) {
                d = d + 1;
            } else {
                e = e + 1;
            }
        }
        System.out.println();
        System.out.println("Длина массива: " + matrix.length);
        System.out.println("Количество чисел больше 8: " + c);
        System.out.println("Количество чисел равных 1: " + a);
        System.out.println("Количество четных чисел: " + d);
        System.out.println("Количество нечетных чисел: " + e);
        System.out.println("Сумма всех элементов массива: " + b);
    }
}
