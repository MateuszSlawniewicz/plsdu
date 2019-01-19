package day7;

import day4.Car;

import java.util.Arrays;

public class OOP3 {


    public static void main(String[] args) {
        createWhiteCar();
        System.out.println(Arrays.toString(ColourEnum.values()));
        Arrays.stream(ColourEnum.values())      // można zmapować żeby zmienić typ, mapowanie to dobra praktyka
                .forEach(e-> System.out.println(e.getPlName()));

    }

    private static void createWhiteCar() {
        Car car = new Car();
        car.setColour(ColourEnum.WHITE);
        System.out.println(car.getColour().getPlName());
    }


}
