package week02;

import java.util.Scanner;

public class 标题统计 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        str = str.replaceAll(" ","");
        System.out.println(str.length());
    }
}
