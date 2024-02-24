package week02.day04;

import java.util.Calendar;

public class 特殊日期 {
    public static void main(String[] args) {
        int count = 0;
        Calendar c1 = Calendar.getInstance();
        c1.set(1900, Calendar.JANUARY,1);
        Calendar c2 = Calendar.getInstance();
        c2.set(9999, Calendar.DECEMBER,31);
        while (c1.before(c2)) {
            int y = c1.get(Calendar.YEAR);
            int y1 = y / 1000 % 10;
            int y2 = y / 100 % 10;
            int y3 = y / 10 % 10;
            int y4 = y % 10;
            int s1 = y1 + y2 + y3 + y4;
            int m = c1.get(Calendar.MONTH) + 1;
            int m1 = m / 10 % 10;
            int m2 = m % 10;
            int d = c1.get(Calendar.DAY_OF_MONTH);
            int d1 = d / 10 % 10;
            int d2 = d % 10;
            int s2 = m1 + m2 + d1 + d2;
            if (s1 == s2) {
                count += 1;
            }
            c1.add(Calendar.DATE, 1);
        }
        System.out.println(count);
    }
}
