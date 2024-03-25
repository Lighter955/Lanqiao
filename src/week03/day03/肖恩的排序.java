package week03.day03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 肖恩的排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(scan.nextInt());
        for (int i = 0; i < n; i++) b.add(scan.nextInt());
        scan.close();
        Comparator<Integer> comparator = (o1, o2) -> o2 - o1;
        a.sort(comparator);
        b.sort(comparator);
        int mod = (int) (Math.pow(10, 9) + 7);
        long answer = 1, count = 0;
        for (int i = 0, j = 0; i < n; i++) {
            while (j < n && a.get(j) > b.get(i)) {
                count += 1;
                j += 1;
            }
            answer *= count--;
            answer %= mod;
        }
        System.out.println(answer);
    }
}
