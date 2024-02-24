package week02.day04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 浇灌 {
    public static void main(String[] args) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean[][] map = new boolean[n][m];
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            map[r][c] = true;
            queue.offer(new int[]{r, c});
            count++;
        }
        int k = scan.nextInt();
        scan.close();
        while (k > 0 && !queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                assert cur != null;
                int x = cur[0];
                int y = cur[1];
                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && !map[nx][ny]) {
                        map[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        count++;
                    }
                }
            }
            k--;
        }
        System.out.println(count);
    }
}
