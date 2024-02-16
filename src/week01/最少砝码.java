package week01;

import java.util.Scanner;

public class 最少砝码 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int sum = 0, cur = 0;
        while (sum < N) {
            sum += (int) Math.pow(3, cur);
            cur += 1;
        }
        System.out.println(cur);
    }

}
