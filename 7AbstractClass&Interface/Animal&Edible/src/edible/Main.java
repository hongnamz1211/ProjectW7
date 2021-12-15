package edible;

import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal a : animals) {
            System.out.println(a.makeSound());

            if (a instanceof Chicken) {
                Edible edible = (Chicken) a;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit f : fruits) {
            System.out.println(f.howToEat());
        }
    }
}
