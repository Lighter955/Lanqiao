package week02.day05;

public class 幸运数字 {
    public static void main(String[] args) {
        int count = 0;
        int n = 1;
        while (count < 2023) {
            String bs = Integer.toString(n, 2);
            String[] bca = bs.split("");
            int mod = 0;
            for (String s : bca) {
                mod += Integer.parseInt(s, 2);;
            }
            if (n % mod != 0) {
                n++;
                continue;
            }
            String os = Integer.toString(n, 8);
            String[] oca = os.split("");
            mod = 0;
            for (String s : oca) {
                mod += Integer.parseInt(s, 8);;
            }
            if (n % mod != 0) {
                n++;
                continue;
            }
            String ds = Integer.toString(n, 10);
            String[] dca = ds.split("");
            mod = 0;
            for (String s : dca) {
                mod += Integer.parseInt(s, 10);;
            }
            if (n % mod != 0) {
                n++;
                continue;
            }
            String hs = Integer.toString(n, 16);
            String[] hca = hs.split("");
            mod = 0;
            for (String s : hca) {
                mod += Integer.parseInt(s, 16);;
            }
            if (n % mod != 0) {
                n++;
                continue;
            }
            n++;
            count++;
        }
        System.out.println(n-1);
    }
}
