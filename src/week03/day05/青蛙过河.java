package week03.day05;

import java.util.Scanner;

public class 青蛙过河 {
    static int n; // 河的宽度
    static int x; // 去学校的天数 过河2x次
    static int[] H;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        H = new int[n + 1];
        for (int i = 1; i < n; i++) {
            H[i] = sc.nextInt() + H[i - 1];
        }
        sc.close();
        int l = 1, r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (check(m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        System.out.println(r);
    }

    static boolean check(int y) {
        for (int i = 0; i < n - y; i++) {
            if (H[i + y] - H[i] < 2 * x) return false;
        }
        return true;
    }
}
