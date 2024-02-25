package week02.day05;

import java.util.Scanner;

public class 串的处理 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        scan.close();
        String[] strings = string.split(" +");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
            strings[i] = strings[i].replaceAll("(\\d)([a-zA-z])", "$1_$2");
            strings[i] = strings[i].replaceAll("([a-zA-Z])(\\d)", "$1_$2");
        }
        System.out.println(String.join(" ", strings));
    }
}
