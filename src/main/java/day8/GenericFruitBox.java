package day8;

public class GenericFruitBox<T> {
    private T fruit;

    public T getFruit() {
        return fruit;
    }

    public GenericFruitBox(T fruit) {
        this.fruit = fruit;
    }
}
