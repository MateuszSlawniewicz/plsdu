package oopHomeworkJava2;

public class Cat extends Pet {
    public Cat(String name, int weight, int age, Human owner) {
        super(name, weight, age, owner);
    }

    public void drinkMilk() {
        System.out.println("Kot pije mleko");
    }

    @Override
    String introduceYourself() {
        return "Jestem kotem";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
