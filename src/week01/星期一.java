package week01;

import java.util.Calendar;

public class 星期一 {

	public static void main(String[] args) {
		int count = 0;
		Calendar c1 = Calendar.getInstance();
		c1.set(1901, 0, 1);
		Calendar c2 = Calendar.getInstance();
		c2.set(2001, 0, 0);
		while (c1.before(c2)) {
			if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				count += 1;
			}
			c1.add(Calendar.DATE, 1);
		}
		System.out.print(count);
	}
	
}
