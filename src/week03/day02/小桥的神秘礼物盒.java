package week03.day02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 小桥的神秘礼物盒 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<String> outputs = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            switch (scan.nextInt()) {
                case 1:
                    int x = scan.nextInt();
                    queue.add(x);
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        outputs.add("lan");
                    } else {
                        queue.remove();
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        outputs.add("qiao");
                    } else {
                        outputs.add(String.valueOf(queue.element()));
                    }
                    break;
                case 4:
                    outputs.add(String.valueOf(queue.size()));
                    break;
            }
        }
        scan.close();
        for (String output : outputs) {
            System.out.println(output);
        }
    }
}
