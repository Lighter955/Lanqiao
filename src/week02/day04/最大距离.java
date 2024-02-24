package week02.day04;

import java.util.Scanner;

public class 最大距离 {
    public static void main(String[] args) {
        int max = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int dis = Math.abs(i - j) + Math.abs(an[i] - an[j]);
                if (max < dis) { max = dis; }
            }
        }
        System.out.println(max);
    }
}
