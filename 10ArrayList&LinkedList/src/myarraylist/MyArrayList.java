package myarraylist;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void display() {
        for (Object o :
                elements) {
            if (o != null) {
                System.out.println(o);
            }
        }
    }

    public E remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i]  = elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        E result = (E) elements[index];
        return result;
    }

    public int size() {
        return size;
    }

//    public E clone() {
//        Object[] newElements = new Object[size];
//        System.arraycopy(elements,0,newElements,0,elements.length);
//        elements = newElements;
//    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkAdd(E e) {
        if (size >= elements.length) {
            return false;
        } else  {
            return true;
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (size >= minCapacity) {
            Object[] newElements = new Object[size * 2 + 1];
            System.arraycopy(elements,0,newElements,0,size);
            elements = newElements;
        }
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
