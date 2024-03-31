package week03.day04;

import java.util.Arrays;
import java.util.Scanner;

public class 重新排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int[] diff = new int[n];
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++){
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            diff[l] += 1;
            if (r + 1 < n) {
                diff[r + 1] -= 1;
            }
        }
        scanner.close();
        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }
        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += (long) A[i] * diff[i];
        }
        Arrays.sort(A);
        Arrays.sort(diff);
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += (long) A[i] * diff[i];
        }
        System.out.println(sum2 - sum1);
    }
}
