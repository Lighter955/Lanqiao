package week01;

import java.util.Arrays;

public class 卡片 {

	public static void main(String[] args) {
		int[] cards = new int[10];
		Arrays.fill(cards, 2021);
		int n = 1;
		while (true) {
			int length = Integer.toString(n).length();
			for (int r = 0; r < length; r++) {
				int m = n / (int) Math.pow(10, r) % 10;
				if (cards[m] > 0) {
					cards[m] -= 1;
				} else {
					System.out.print(n - 1);
					return;
				}
			}
			n += 1;
		}
	}

}
