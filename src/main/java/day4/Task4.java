package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i : array) {
            array[i] = random.nextInt(10000);
        }

        int summax = 0, summaxindex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > summax) {
                summax = sum;
                summaxindex = i;
            }

        }
        System.out.println(summax);
        System.out.println(summaxindex);
    }
}
