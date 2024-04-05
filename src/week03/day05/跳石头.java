package week03.day05;

import java.util.Scanner;

public class 跳石头 {
    static int L, N, M;
    static int[] stones;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        L = scan.nextInt();
        N = scan.nextInt();
        M = scan.nextInt();
        stones = new int[N];
        for (int i = 0; i < N; i++) {
            stones[i] = scan.nextInt();
        }
        scan.close();
        int l = 1, r = L, mid;
        while (l < r) {
            mid = (l + r + 1) / 2;
            if (check(mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(l);
    }

    static boolean check(int d) {
        int pos = 0, num = 0;
        for (int i = 0; i < N; i++) {
            if (stones[i] - pos < d) {
                num += 1;
            } else {
                pos = stones[i];
            }
        }
        return num <= M;
    }
}
