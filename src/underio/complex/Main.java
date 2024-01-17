package underio.complex;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* CLASSES AND OBJECTS | ACCESS MODIFIERS | INHERITANCE & POLYMORPHISM | INTERFACES & ABSTRACT CLASSES */

        Animal annie = new Dog("annie.png", "Annie", 3);
        Animal jeremy = new Dog("jeremy.png", "Jeremy", 7);

        Animal cherry = new Cat("cherry.png", "Cherry", 5);

        Animal george = new Cat("george.png", "George", 3);

        george.move();
        jeremy.move();


        System.out.println(annie.name + " is " + annie.getAge() + " years old!");
        System.out.println(jeremy.name + " is " + jeremy.getAge() + " years old!");
        System.out.println(cherry.name + " is " + cherry.getAge() + " years old!");

        annie.birthday();

        System.out.println("Annie is " + annie.getAge() + " years old!");
        System.out.println("Jeremy is " + jeremy.getAge() + " years old!");

        System.out.println("Cat info:");
        cherry.displayInfo();
        cherry.makeSound();

        System.out.println("Dog info:");
        jeremy.displayInfo();
        jeremy.makeSound();


        Bird jules = new Bird("jules.png", "Jules", 1);
        jules.move();
        jules.fly();

        List<Animal> animals = new ArrayList<>();
        animals.add(annie);
        animals.add(cherry);
        animals.add(jules);

        List<iFlyable> flyables = new ArrayList<>();
        flyables.add(jules);
        flyables.add(new Aeroplane());

        for (Animal animal :animals) {
            animal.move();
            animal.makeSound();
        }

        for (iFlyable flyable : flyables) {
            flyable.fly();
        }

    }
}
