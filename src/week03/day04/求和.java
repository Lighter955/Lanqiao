package week03.day04;

import java.util.Scanner;

public class 求和 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = scan.nextInt();
        }
        scan.close();
        long s1 = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s1 += ai[i];
        }
        long S = 0;
        for (int i = 0; i < n - 1; i++) {
            s2 += ai[i];
            long multiply = ai[i] * (s1 - s2);
            S += multiply;
        }
        System.out.println(S);
    }
}
