package op_change;

import java.util.Scanner;
import java.util.Stack;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            if (num % 2 == 1) {
                num = (num - 1) / 2;
                stack.push(1);
                continue;
            } else
                num = num / 2;
            stack.push(0);
        }
        stack.push(0);
        System.out.println("Hệ nhị phân là: ");
//        for (Integer s : stack) {
//            System.out.print(s);
//        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
