package week03.day03;

import java.util.*;
import java.util.stream.Collectors;

public class 排队接水 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ti = new int[n];
        for (int i = 0; i < n; i++) {
            ti[i] = scan.nextInt();
        }
        scan.close();
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indexes.add(i + 1);
        }
        Comparator<Integer> comparator = Comparator.comparingInt(o -> ti[o - 1]);
        indexes.sort(comparator);
        System.out.println(indexes.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        double averageWaitTime = calculateAverageWaitTime(ti, indexes);
        System.out.printf("%.2f\n", averageWaitTime);
    }

    static double calculateAverageWaitTime(int[] ti, ArrayList<Integer> indexes) {
        double totalWaitTime = 0;
        double curWaitTime = 0;
        for (Integer index : indexes) {
            totalWaitTime += curWaitTime;
            curWaitTime += ti[index - 1];
        }
        return totalWaitTime / indexes.size();
    }
}
