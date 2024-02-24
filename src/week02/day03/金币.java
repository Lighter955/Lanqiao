package week02.day03;

import java.util.Scanner;

public class 金币 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        scan.close();
        int day = 0;
        int i = 0;
        int sum = 0;
        while (day < k) {
            i++;
            day += i;
            sum += i * i;
        }
        sum -= (day - k) * i;
        System.out.println(sum);
    }
}
