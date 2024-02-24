package week02.day04;

import java.util.Scanner;

public class 最长递增 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int n = scan.nextInt();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (an[j-1] < an[j]) {
                    max = Math.max(j - i + 1, max);
                } else {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
