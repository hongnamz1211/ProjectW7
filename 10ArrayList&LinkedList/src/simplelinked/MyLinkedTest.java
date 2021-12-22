package simplelinked;

public class MyLinkedTest {
    public static void main(String[] args) {
        System.out.println("test");
        MyLinked linkedList = new MyLinked(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4,9);
        linkedList.add(4,11);
        linkedList.printList();
    }
}
