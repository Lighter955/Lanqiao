package week03.day05;

import java.util.Scanner;

public class 分巧克力 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // N块巧克力
        int K = scan.nextInt(); // K位小朋友
        int[][] chocolates = new int[N][2];
        int L = 1, R = 1;
        for (int i = 0; i < N; i++) {
            chocolates[i][0] = scan.nextInt();
            chocolates[i][1] = scan.nextInt();
            if (chocolates[i][0] > R) R = chocolates[i][0];
            if (chocolates[i][1] > R) R = chocolates[i][1];
        }
        scan.close();
        while (L < R) {
            int mid = (L + R + 1) / 2;
            if (calc(mid, chocolates) < K) { // 不够分
                R = mid - 1;
            } else { // 够分
                L = mid;
            }
        }
        System.out.println(L);
    }

    static int calc(int w, int[][] chocolates) {
        int sum = 0;
        for (int[] chocolate : chocolates) {
            sum += (chocolate[0] / w) * (chocolate[1] / w);
        }
        return sum;
    }
}
