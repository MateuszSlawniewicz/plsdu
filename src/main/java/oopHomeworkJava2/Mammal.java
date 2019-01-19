package oopHomeworkJava2;

public abstract class Mammal extends Animal {
    public Mammal(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    String introduceYourself() {
        return null;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
