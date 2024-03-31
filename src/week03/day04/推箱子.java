package week03.day04;

import java.util.Scanner;

public class 推箱子 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int[] diff = new int[N];
        for (int i = 0; i < N; i++) {
            int top = scanner.nextInt();
            int end  = scanner.nextInt();
            diff[top] += 1;
            if (end + 1 < N) {
                diff[end + 1] -= 1;
            }
        }
        scanner.close();
        for (int i = 1; i < N; i++) {
            diff[i] += diff[i - 1];
        }
        long[] sum = new long[N];
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                sum[i] = diff[i];
            } else {
                sum[i] = sum[i - 1] + diff[i];
            }
        }
        long maxSum = Long.MIN_VALUE;
        for (int i = H; i < N; i++) {
            maxSum = Math.max(maxSum, sum[i] - sum[i - H]);
        }
        System.out.println((long) N * H - maxSum);
    }
}
