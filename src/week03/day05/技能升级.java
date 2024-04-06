package week03.day05;

import java.util.Scanner;

public class 技能升级 {
    static int N; // 技能数
    static int M; // 升级次数
    static int[] A; // 首次升级所增加的攻击力
    static int[] B; // 升级减少增加的攻击力数

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N];
        B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        sc.close();
        int l = 1, r = Integer.MAX_VALUE - 2;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if(check(mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }

        // cnt 计算当前已经加点的次数, sum 计算当前攻击力
        long count = 0, sum = 0;
        for(int i = 0; i < N; ++i) {
            if(A[i] < l) continue;
            long n = (A[i] - l) / B[i] + 1; // 通过等差数列的形式, 计算这个技能衰减能够加点的次数
            long end = A[i] - B[i] * (n - 1);
            count += n;
            sum += (A[i] + end) * n / 2; // 等差数列求和
        }
        sum += (M - count) * l; // 可能会出现最后一次加点的值在多个技能里同时出现,并且该数量超过可以加点的限制次数 m,通过该方法减去多加的技能点
        System.out.println(sum);
    }

    static boolean check(int mid) {
        long num = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < mid) continue;
            num += (A[i] - mid) / B[i] + 1;;
        }
        return num >= M;
    }
}
