package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        Random random = new Random();
        int sum = 0, maxsum = 0, maxsumindex = 0;
        for (int m = 0; m < array.length; m++) {
            sum = 0;
            for (int n = 0; n < array[m].length; n++) {
                array[m][n] = random.nextInt(51);
                sum = sum + array[m][n];
                if (maxsum < sum) {
                    maxsum = sum;
                    maxsumindex = m;
                }
            }
        }
        System.out.println("индекс строки, сумма чисел в которой максимальна: " + maxsumindex);
    }
}
