package oopHomeworkJava2;

public class Human extends Mammal {
    public Human(String name, int weight, int age) {
        super(name, weight, age);
    }

    public String getName() {
        return name;
    }

    public void cogiteoErgoSum() {
        System.out.println("człowiek jest bo myśli");
    }

    @Override
    String introduceYourself() {
        return "Jestem człowiekiem";
    }

    @Override
    public String toString() {
        return name;
    }
}
