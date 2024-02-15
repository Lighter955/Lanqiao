import java.util.Calendar;

public class 顺子日期 {

	static int count = 0;
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.set(2021, 0, 1);
		c2.set(2021, 12, 0);
		while (c1.before(c2)) {
			int date = (c1.get(Calendar.YEAR) + 1) * 10000  +
					(c1.get(Calendar.MONTH) + 1) * 100 + 
					c1.get(Calendar.DAY_OF_MONTH);
			check(date);
			c1.add(Calendar.DATE, 1);
		}
		System.out.println(count);
	}
	static void check(int date) {
		for (int i = 2; i < 5; i++) {
			int n1 = date / (int) Math.pow(10, i) % 10;
			int n2 = date / (int) Math.pow(10, i-1) % 10;
			int n3 = date / (int) Math.pow(10, i-2) % 10;
			if (n1 == n2 - 1 && n2 == n3 - 1) {
				count += 1;
				return;
			}
		}
	}

}
