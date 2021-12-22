package op_stackarray;

public class StackArrayClient {
    public static void main(String[] args) throws Exception {
        StackArray stackArray = new StackArray(5);

        stackArray.push(5);
        stackArray.push(4);
        stackArray.push(3);
        stackArray.push(2);
        stackArray.push(1);
        System.out.println("1. Size of stack after push operations: " + stackArray.size());
        System.out.println(stackArray.isFull());

        System.out.println("2. Pop elements from stack: ");
        while (!stackArray.isEmpty()) {
            System.out.printf("%d", stackArray.pop());
        }

        System.out.println("\n3. Size of stack after pop operations: " + stackArray.size());
        System.out.println(stackArray.isFull());
        System.out.println(stackArray.isEmpty());
    }
}
