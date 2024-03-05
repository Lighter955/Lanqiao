package week03.day01;

import java.math.BigInteger;

public class 阶乘求和 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger num = BigInteger.valueOf(1);
        for (int i = 1; i <= 40; i++) {
            num = num.multiply(BigInteger.valueOf(i));
            sum = sum.add(num);
        }
        String string = sum.toString();
        System.out.println(string.substring(string.length() - 9));
    }
}
