package day4;

import java.math.BigDecimal;
import java.util.Arrays;

public class OOP {
    public static void main(String[] args) {
        Car car = new Car();
        car.setManufacturer("Skoda");
        System.out.println(car.getManufacturer());
        System.out.println(car);
        CarOption leatherSeats = new CarOption();
        leatherSeats.setOptionName("Skórzane siedzenia");
        leatherSeats.setChoosen(true);
        leatherSeats.setOptionPrice(BigDecimal.valueOf(1.99));
        CarOption radio = new CarOption();
        radio.setOptionName("radyjko");
        radio.setChoosen(true);
        radio.setOptionPrice(BigDecimal.valueOf(2.99));

        CarOption[] options = new CarOption[]{radio, leatherSeats};


        car.setOptions(options);
        car.setBasePrise(BigDecimal.valueOf(1.10));

        System.out.println(car.summaryPrice());
        System.out.println(car);







    }

//    private static BigDecimal summaryPrice(Car car) {
//
//        BigDecimal result = car.getBasePrise();
//
//        CarOption[] carOptions = car.getOptions();          // carOptions to nazwa zmiennej !
//
//        for (int i = 0; i < carOptions.length; i++) {
//
//            result = result.add(carOptions[i].getOptionPrice());
//
//        }
//
//        return result;
//
//    }
}
