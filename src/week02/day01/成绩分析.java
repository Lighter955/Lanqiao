package week02.day01;

import java.util.Scanner;

public class 成绩分析 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0, min = 100, sum = 0;
        for (int i = 0; i < n; i++) {
            int score = scan.nextInt();
            sum += score;
            if (max < score) max = score;
            if (min > score) min = score;
        }
        scan.close();
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f", (double) sum / n);
    }
}
