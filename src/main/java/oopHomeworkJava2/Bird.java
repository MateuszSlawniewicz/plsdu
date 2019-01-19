package oopHomeworkJava2;

public class Bird extends Pet {
    public Bird(String name, int weight, int age, Human owner) {
        super(name, weight, age, owner);
    }
    public void singWhileFlying(){
        System.out.println("ptak spiewa podczas lotu");
    }

    @Override
    String introduceYourself() {
        return "Jestem ptakiem";
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

}
