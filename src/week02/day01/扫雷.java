package week02.day01;

import java.util.Scanner;

public class 扫雷 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    System.out.print(count(map, i, j, n, m));
                } else {
                    System.out.print(9);
                }
                if (j == m - 1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    static int count(int[][] map, int x, int y, int n, int m) {
        int count = 0;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx != 0 || dy != 0) {
                    int newX = x + dx;
                    int newY = y + dy;
                    if (newX >= 0 && newX < n && newY >= 0 && newY < m && map[newX][newY] == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
