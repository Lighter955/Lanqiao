package week02.day01;

import java.util.Scanner;

public class 合法日期 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int d = scan.nextInt();
        scan.close();
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d > 31) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d > 30) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        } else if (m == 2) {
            if (d > 28) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        } else {
            System.out.println("no");
        }
    }
}
