package arraysort;

import java.util.Stack;

public class ReverseArrayStringByStack {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        String string = "hello everyone !!!";
        String[] strings = string.split("\\s");

        System.out.println("String array is: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + "\t");
        }

        for (String s :
                strings) {
            stringStack.push(s);
        }

        for (int i = 0; i < strings.length; i++) {
            strings[i] = stringStack.pop();
        }

        System.out.println("String array after reveser is: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + "\t");
        }
    }
}
