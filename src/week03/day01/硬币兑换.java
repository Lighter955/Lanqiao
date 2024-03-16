package week03.day01;

import java.util.Arrays;

public class 硬币兑换 {
    public static void main(String[] args) {
        int[] newCoins = new int[2023];
        for (int i = 0; i < 2023; i++) {
            newCoins[i] = i + 1;
        }
        int[] maxOldCoins = new int[4045];
        for (int i = 0; i < 2023; i++) {
            for (int j = 0; j < i / 2; j++) {
                maxOldCoins[i] += newCoins[j];
            }
        }
        for (int i = 2023; i < 4045; i++) {
            for (int j = i - 2023; j < i / 2; j++) {
                maxOldCoins[i] += newCoins[j];
            }
        }
        int max = 0;
        for (int i = 0; i < 4045; i++) {
            int value = maxOldCoins[i];
            if (i < 2023) value += newCoins[i];
            if (value > max) max = value;
        }
        System.out.println(max);
    }
}
