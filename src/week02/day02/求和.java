package week02.day02;

public class 求和 {
    public static void main(String[] args) {
        int sum = 0;
        for (int n = 1; n <= 2019; n++) {
            String str = Integer.toString(n);
            if (str.contains("2") | str.contains("0") | str.contains("1") | str.contains("9")) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
