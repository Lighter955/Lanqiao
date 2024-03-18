package week03.day02;

import java.util.Scanner;

public class FBI树 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String string = scan.next();
        scan.close();
        FBI(string.substring(0, (int) Math.pow(2, N)));
    }

    static void FBI(String string) {
        if (string.length() > 1) {
            int mid = string.length() / 2;
            FBI(string.substring(0, mid));
            FBI(string.substring(mid));
        }
        if (string.contains("0") && !string.contains("1")) {
            System.out.print("B");
        } else if (string.contains("1") && !string.contains("0")) {
            System.out.print("I");
        } else if (string.contains("0") && string.contains("1")){
            System.out.print("F");
        }
    }
}
