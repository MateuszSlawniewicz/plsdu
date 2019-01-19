package oopHomeworkJava2;

public class Dog extends Pet {
    public Dog(String name, int weight, int age, Human owner) {
        super(name, weight, age, owner);
    }

    public void biteBone() {
        System.out.println("pies gryzie kość");
    }

    @Override
    String introduceYourself() {
        return "Jestem psem";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
