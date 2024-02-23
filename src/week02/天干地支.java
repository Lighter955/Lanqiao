package week02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 天干地支 {
    public static void main(String[] args) {
        List<String> t = Arrays.asList("jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui");
        List<String> d = Arrays.asList("zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai");
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        scan.close();
        int i = (y + 6) % 10;
        int j = (y + 8) % 12;
        System.out.print(t.get(i));
        System.out.println(d.get(j));
    }
}
