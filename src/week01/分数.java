package week01;

public class 分数 {

	public static void main(String[] args) {
		int n = 1;
		int m = 1;
		for (int i = 1; i < 20; i++) {
			n *= 2;
			n += 1;
			m *= 2;
		}
		System.out.println(n + "/" + m);
	}

}
