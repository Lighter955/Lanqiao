package week02;

import java.util.Scanner;

public class 最大间隙 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = scan.nextInt();
        }
        scan.close();
        int max = an[1] - an[0];
        for (int i = 1; i < n - 1; i++) {
            int dis = an[i+1] - an[i];
            if (max < dis) {
                max = dis;
            }
        }
        System.out.println(max);
    }
}
