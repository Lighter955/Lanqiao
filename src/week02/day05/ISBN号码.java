package week02.day05;

import java.util.Scanner;

public class ISBN号码 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        scan.close();
        int sum = 0;
        string = string.replaceAll("-", "");
        for (int i = 0; i < string.length() - 1; i++) {
            int n = (string.charAt(i) - '0');
            sum += n * (i + 1);
        }
        int mod = sum % 11;
        char code = string.charAt(string.length() - 1);
        if (mod == 10 && code == 'X') {
            System.out.println("Right");
        } else if (mod == code - '0') {
            System.out.println("Right");
        } else {
            if (mod == 10) {
                code = 'X';
            } else {
                code = (char) (mod + '0');
            }
            System.out.printf("%c-%s-%s-%c", string.charAt(0), string.substring(1, 4), string.substring(4, 9), code);
        }
    }
}
