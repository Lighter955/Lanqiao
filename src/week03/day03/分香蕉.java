package week03.day03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 分香蕉 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Integer[] ai = new Integer[n];
        Integer[] bi = new Integer[m];
        for (int i = 0; i < n; i++) {
            ai[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            bi[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(ai, (o1, o2) -> o2 - o1);
        Integer[] indexes = new Integer[m];
        for (int i = 0; i < m; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, (o1, o2) -> bi[o2] - bi[o1]);
        int[] ci = new int[m];
        for (int i = 0; i < n; i++) {
            ci[indexes[i % m]] += ai[i];
        }
        System.out.println(Arrays.stream(ci).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
