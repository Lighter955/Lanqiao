package week02.day02;

import java.util.Scanner;

public class 大写 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        str = str.toUpperCase();
        System.out.println(str);
    }
}
