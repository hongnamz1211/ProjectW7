package baitap;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Square(3);
        for (Shape s : shapes) {
            System.out.println("Pre-resizeable");
            System.out.println(s);
        }
        System.out.println("-----------------------");
        for (Shape s : shapes) {
            if (s instanceof Circle) {
                ((Circle) s).resize(Math.floor(Math.random() * 100 + 1));
            } else if (s instanceof Rectangle) {
                ((Rectangle) s).resize(Math.floor(Math.random() * 100 + 1));
            }
            System.out.println("Ater-resizeable");
            System.out.println(s);
        }
    }
}
