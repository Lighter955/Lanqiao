package week03.day03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 数位排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }
        Comparator<Integer> comparator = (o1, o2) -> {
            String oStr1 = String.valueOf(o1);
            String oStr2 = String.valueOf(o2);
            int oSum1 = sum(oStr1);
            int oSum2 = sum(oStr2);
            if (oSum1 == oSum2) {
                return o1 - o2;
            } else {
                return oSum1 - oSum2;
            }
        };
        list.sort(comparator);
        System.out.println(list.get(m-1));
    }

    static int sum(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += string.charAt(i) - '0';
        }
        return sum;
    }
}
