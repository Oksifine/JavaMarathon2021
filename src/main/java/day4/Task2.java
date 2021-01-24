package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] matrix = new int[100];
        int a = 0, b = 10000, c = 0, d = 0;
        Random random = new Random();
        for (int x : matrix) {
            matrix[x] = random.nextInt(10000);
            if (matrix[x] > a) {
                a = matrix[x];
            }
            if (matrix[x] < b) {
                b = matrix[x];
            }

            if (matrix[x] % 10 == 0) {
                c = c + 1;
                d = d + matrix[x];
            }
        }


        System.out.println("Наибольший элемент массива: " + a);
        System.out.println("Наименьший элемент массива: " + b);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + c);
        System.out.println("Cумма элементов массива, оканчивающихся на 0: " + d);
    }
}
