package oopHomeworkJava2;

import day4.Car;

import java.util.ArrayList;
import java.util.List;

public class OOPHomeworkPets {

    public static void main(String[] args) {
        Human adam = new Human("Adam", 70, 25);
        Dog dog1 = new Dog("Reksio", 5, 10, adam);
        Cat cat = new Cat("Filemon", 8, 8, adam);
        Bird bird = new Bird("Elemelek", 1, 1, adam);


        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(adam);
        listOfAnimals.add(dog1);
        listOfAnimals.add(cat);
        listOfAnimals.add(bird);

        listOfAnimals.stream().forEach(e -> System.out.println(e.introduceYourself()));
        listOfAnimals.stream().filter(e -> e instanceof Dog).forEach(e -> ((Dog) e).biteBone());
//        Car car = new OwnerHolder;
//        Pet dog = new OwnerHolder;
//        car.setOwner("Adam"]]);
//        dog.setOwner(
        OwnerHolder pet = new Pet("kot", 2, 5, adam);
        System.out.println(pet.getOwnerName());


    }
}

