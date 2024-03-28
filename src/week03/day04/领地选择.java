package week03.day04;

import java.util.Scanner;

public class 领地选择 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int C = scanner.nextInt();
        int maxValue = Integer.MIN_VALUE;
        int[] position = new int[2];
        int[][] valuesMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int valuesSum = scanner.nextInt();
                if (i - 1 >= 0) {
                    valuesSum += valuesMap[i-1][j];
                }
                if (j - 1 >= 0) {
                    valuesSum += valuesMap[i][j-1];
                }
                if (i - 1 >= 0 && j - 1 >= 0) {
                    valuesSum -= valuesMap[i-1][j-1];
                }
                valuesMap[i][j] = valuesSum;
            }
        }
        scanner.close();
        for (int i = 0; i < N - C + 1; i++) {
            for (int j = 0; j < M - C + 1; j++) {
                int value = valuesMap[i+C-1][j+C-1];
                if (i - 1 >= 0) value -= valuesMap[i-1][j+C-1];
                if (j - 1 >= 0) value -= valuesMap[i+C-1][j-1];
                if (i - 1 >= 0 && j - 1 >= 0) value += valuesMap[i-1][j-1];
                if (value > maxValue) {
                    maxValue = value;
                    position[0] = i + 1;
                    position[1] = j + 1;
                }
            }
        }
        System.out.println(position[0] + " " + position[1]);
    }
}
