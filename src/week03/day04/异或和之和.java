package week03.day04;

import java.util.Scanner;

public class 异或和之和 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] Ai = new int[n];
        for (int i = 0; i < n; i++) {
            Ai[i] = scan.nextInt();
        }
        scan.close();
        long result = 0;
        for (int i = 0; i < 20; i++) {
            int sum = 0; // 前缀和
            int num0 = 0; // 偶数的个数
            int num1 = 0; // 奇数的个数
            for (int j = 0; j < n; j++) { // 遍历每个元素
                int bit = (Ai[j] >> i) & 1; // 二进制的第i位
                sum += bit;
                if (sum % 2 == 1) {
                    result += (long) Math.pow(2, i) * (num0 + 1);
                    num1 += 1;
                } else {
                    result += (long) Math.pow(2, i) * num1;
                    num0++;
                }
            }
        }
        System.out.println(result);
    }
}
