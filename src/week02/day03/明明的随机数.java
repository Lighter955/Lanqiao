package week02.day03;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 明明的随机数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(scan.nextInt());
        }
        scan.close();
        System.out.println(set.size());
        for (Integer n : set) {
            System.out.printf("%d ", n);
        }
    }
}
