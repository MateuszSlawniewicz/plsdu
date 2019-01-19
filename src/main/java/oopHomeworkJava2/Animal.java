package oopHomeworkJava2;

public abstract class Animal {
    String name;
    int weight;
    int age;

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    abstract String introduceYourself();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



