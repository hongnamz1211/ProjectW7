package simplelist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(3);
        listInterger.add(4);

        System.out.println("Element 4: " + listInterger.get(4));
        System.out.println("Element 1: " + listInterger.get(1));
        System.out.println("Element 2: " + listInterger.get(2));
    }
}