package week03.day01;

public class 分糖果 {
    static int answer = 0;
    public static void main(String[] args) {
        dfs(1, 9, 16);
        System.out.println(answer);
    }

    private static void dfs(int step, int num1, int num2) {
        if (step > 7) {
            if (num1 == 0 && num2 == 0) {
                answer += 1;
            }
        } else {
            for (int i = 0; i <= num1; i++) {
                for (int j = 0; j <= num2; j++) {
                    if (i+j >= 2 && i+j <= 5) {
                        dfs(step+1, num1-i, num2-j);
                    }
                }
            }
        }
    }
}
