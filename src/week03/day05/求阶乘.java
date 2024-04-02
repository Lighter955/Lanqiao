package week03.day05;

import java.util.Scanner;

public class 求阶乘 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long k = scan.nextLong();
        scan.close();
        long l = 1;
        long r = Long.MAX_VALUE - 1;
        while (l < r) {
            long mid = (l + r) / 2;
            if (k <= calc(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (calc(r) == k) {
            System.out.println(r);
        } else {
            System.out.println(-1);
        }
    }

    static long calc(long num) {
        long n = 0;
        while (num > 0) {
            n += num / 5;
            num /= 5;
        }
        return n;
    }
}