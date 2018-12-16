package matExercisesWeekTwo;

import java.lang.reflect.Array;

public class MatExcFour {
    public static void main(String[] args) {
//        Utwórz metodę, która przyjmuje trzy parametry - tablicę oraz dwie liczby. Metoda ma
//        zwrócić sumę elementów w podanym przedziale
//          > Dla `([1, 2, 3, 4, 5], 2, 4)`
//               > zwróci `12`s, bo `3 + 4 + 5`

        int[] table = {1, 2, 3, 4, 5};
        System.out.println(getArrayAndSumElementsFromInterval(table,2,4));

    }

    public static int getArrayAndSumElementsFromInterval(int[] table, int first, int second) {
        int result = table[first];

        for (int i = first ; i < second; i++) {
            table[i] = i + 1;

            result = result + table[i];

        }
        return result;
    }


}
