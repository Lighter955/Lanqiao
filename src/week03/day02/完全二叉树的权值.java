package week03.day02;

import java.util.Scanner;

public class 完全二叉树的权值 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] tree = new int[N];
        for (int i = 0; i < N; i++) {
            tree[i] = scan.nextInt();
        }
        scan.close();

        int[] sums = new int[(int) (Math.log(N) / Math.log(2)) + 1];
        for (int i = 0; i < sums.length; i++) {
            int start = (int) Math.pow(2, i) - 1;
            int end = (int) (2 * Math.pow(2, i + 1) - 1);
            int sum = 0;
            for (int j = start; j < end && j < N; j++) {
                sum += tree[j];
            }
            sums[i] = sum;
        }

        int maxIndex = 0;
        for (int i = 1; i < sums.length; i++) {
            if (sums[maxIndex] < sums[i]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + 1);
    }
}
