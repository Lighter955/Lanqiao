package week02.day05;

import java.util.Scanner;

public class 缩位求和 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        scan.close();
        String sum = count(num);
        System.out.println(sum);
    }

    static String count(String n) {
        int length = n.length();
        if (length > 1) {
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += n.charAt(i) - '0';
            }
            return count(Integer.toString(sum));
        } else {
            return n;
        }
    }
}
