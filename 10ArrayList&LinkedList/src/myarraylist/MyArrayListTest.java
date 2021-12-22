package myarraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        System.out.println("test");
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(0,3);
        list.add(1,5);
        list.add(1,2);
        list.add(1,6);
        list.add(1,8);
        System.out.println("Array");
        list.display();
        System.out.println("----------");
        System.out.println("Remove the element");
        System.out.println(list.remove(2));
        System.out.println("----------");
        list.display();
        System.out.println("----------");
        System.out.println("Size of array");
        System.out.println(list.size());
        System.out.println("----------");
        System.out.println("Check element");
        System.out.println(list.contains(2));
        System.out.println("----------");
        System.out.println("Find element");
        System.out.println(list.indexOf(6));
        System.out.println("--");
        System.out.println(list.indexOf(2));
        System.out.println("----------");
        System.out.println("Check add");
        System.out.println(list.checkAdd(9));
        System.out.println("----------");
        System.out.println("Check size");
        System.out.println(list.size());
        System.out.println("----------");
        System.out.println("Index in array");
        System.out.println(list.get(3));
        System.out.println("--");
//        System.out.println(list.get(4));
        System.out.println("----------");
        System.out.println("Clear elements");
        list.clear();
        System.out.println("Check size");
        System.out.println(list.size());
        list.display();
        System.out.println("----------");
    }
}
