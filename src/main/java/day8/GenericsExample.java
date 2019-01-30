package day8;

import javax.print.attribute.standard.NumberUp;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        notGeneric();

        genericExample();
    }

    private static void genericExample() {
        Apple apple = new Apple();
        GenericFruitBox<Apple> appleGenericFruitBox = new GenericFruitBox<>(apple);
        System.out.println(appleGenericFruitBox.getFruit().introduceApple());                           //nie trzeba robić castowania
    }

    private static void notGeneric() {
        Apple apple = new Apple();
        FruitBox fruitBox = new FruitBox(apple);
        Apple appleFromBox = (Apple) fruitBox.getFruit();
        System.out.println(((Apple) fruitBox.getFruit()).introduceApple());
    }


//    private static <T> T sumOfNumbers(List<T> numbers) {
//        return numbers.stream()
//                .forEach(e-> )
//                .sum();
//
//
//    }


}
