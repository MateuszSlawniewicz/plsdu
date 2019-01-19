package oopHomeworkJava2;

public class Pet extends Animal implements OwnerHolder {
    private Human owner;

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public Pet(String name, int weight, int age, Human owner) {
        super(name, weight, age);
        this.owner = owner;
    }

    @Override
    String introduceYourself() {
        return null;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "owner=" + owner +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    @Override
    public String getOwnerName() {
        return String.valueOf(owner);
    }
}
