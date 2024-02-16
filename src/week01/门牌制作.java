package week01;

public class 门牌制作 {

	public static void main(String[] args) {
		int count = 0;
		for (int n = 1; n <= 2020; n++) {
			if (n / 1000 == 2) {
				count += 1;
			}
			if (n / 100 % 10 == 2) {
				count += 1;
			}
			if (n / 10 % 10== 2) {
				count += 1;
			}
			if (n % 10 == 2) {
				count += 1;
			}
		}
		System.out.print(count);
	}

}
