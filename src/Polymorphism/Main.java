package Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();

        var cow = new Cow();
        var dog = new Dog();
        var cat = new Cat();
        animals.add(cow);
        animals.add(dog);
        animals.add(cat);
        for (Animal s : animals) {
            System.out.println(s.speak()); // <= Polymorphism (late binding) is happening here.
        }
    }
}
