package week03.day03;

import java.util.Arrays;
import java.util.Scanner;

public class 输油管道问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ys = new int[n];
        for (int i = 0; i < n; i++) {
            scanner.nextInt();
            int y = scanner.nextInt();
            ys[i] = y;
        }
        scanner.close();
        Arrays.sort(ys);
        int mid = ys[ys.length / 2];
        int sum = 0;
        for (int y : ys) {
            sum += Math.abs(y - mid);
        }
        System.out.println(sum);
    }
}
