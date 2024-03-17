package week03.day02;

import java.util.*;

public class 餐厅排队 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    int x = scanner.nextInt();
                    deque.addLast(x);
                    break;
                case 2:
                    deque.removeFirst();
                    break;
                case 3:
                    strings.add(deque.getFirst() + " " + deque.getLast());
                    break;
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
