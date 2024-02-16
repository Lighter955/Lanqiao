package week01;

import java.util.Scanner;

public class 修剪灌木 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
        scan.close();
        for (int i = 1; i <= N; i++) {
			int h1 = (i - 1) * 2;
			int h2 = (N - i) * 2;
			int max = Math.max(h1, h2);
			System.out.println(max);
		}
	}

}
