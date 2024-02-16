package week02;

import java.util.Scanner;

public class 时间加法 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int t = scan.nextInt();
        scan.close();
        int h = (t + b) / 60;
        int m = (t + b) % 60;
        System.out.println(a + h);
        System.out.println(m);
    }
}
