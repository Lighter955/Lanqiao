package week02.day02;

import java.util.Scanner;

public class 天数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        scan.close();
        if (m == 2) {
            System.out.println(28);
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }
    }
}
