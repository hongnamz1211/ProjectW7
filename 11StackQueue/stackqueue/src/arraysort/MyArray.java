package arraysort;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyArray<E> {
    private LinkedList<E> stack;

    public MyArray() {
        stack = new LinkedList<>();
    }

    public void push(E e) {
        stack.addFirst(e);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
