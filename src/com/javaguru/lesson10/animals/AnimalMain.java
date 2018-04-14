package com.javaguru.lesson10.animals;

import java.util.ArrayList;
import java.util.List;

class AnimalMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(3);
        cat.setWeight(53.2);

        Dog dog = new Dog();
        dog.setAge(1);
        dog.setWeight(3.5);

        cat.speak();
        dog.speak();

        Animal animal = new Dog();
        animal.setAge(5);
        animal.setWeight(10);
        animal.speak();
        ((Dog) animal).eat();

        Animal animal1 = new Animal() {
            @Override
            void speak() {
                System.out.println("...");
            }
        };

        animal1.setWeight(12.2);
        animal1.setAge(1234214);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(animal);
        animals.add(animal1);

//        animals.forEach(Animal::speak);
        animals.forEach(a -> a.speak());
    }
}
