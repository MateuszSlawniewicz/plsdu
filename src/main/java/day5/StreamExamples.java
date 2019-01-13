package day5;


import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",   // musi być static bo void jest statyczne, ze statycznych nie mamy dostępu do niestatycznych
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", "  pig", "dog", null, "parrot"};

    public static void main(String[] args) {


        firstStream();
        secondStream();
        sortExample();

    }

    private static void secondStream() {
        for (String animal : animals) {
            if (animal == null || animal == "" || animal == " ") {
                continue;
            }
            animal = animal.trim();

            System.out.print(animal + ", ");        //todo usuń przecinki na końcu


        }
        System.out.println();


        String result = Arrays.stream(animals)
                .filter(e -> e != null && e != "" && e != " ")
                .map(e -> e.trim())
                .collect(Collectors.joining(", "));

        System.out.println(result);
        System.out.println();

        String result2 = Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))     //tylko statyczna
                .map(e -> e.trim())
                .collect(Collectors.joining(", "));

        System.out.println(result2);

    }

    private static void firstStream() {
        for (String animal : animals) {
            //todo unikalność
            if (animal == null) {
                continue;
            }
            animal = animal.trim();
            if (animal.length() >= 4) {
                {
                    System.out.println(animal);
                }

            }
        }

        Arrays.stream(animals)
                .filter(e -> e != null)
                .map(e -> e.trim())
                .filter(e -> e.length() >= 4)
                .distinct()
                .forEach(e -> System.out.println(e));


    }

    private static void sortExample() {

        String name1 = "Anna";
        String name2 = "Ola";
        System.out.println(name1.compareTo(name2));
        System.out.println("Sortowanie alfabetyczne");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())                   // map wykonuje operacje na obiekcie i zwraca
                .distinct()
                .sorted((e, f) -> e.compareTo(f))
                .forEach(e -> System.out.print(e + " "));
        System.out.println("Sortowanie po długości");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())
                .distinct()
                .sorted((e, f) -> Integer.valueOf(e.length()).compareTo(Integer.valueOf(f.length())))
                .forEach(e -> System.out.print(e + " "));


    }
}



