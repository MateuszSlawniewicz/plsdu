package ZadaniaSwiateczne;

import java.util.Arrays;

public class SumOfArrayWithoutMax {
    public static void main(String[] args) {
//        Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca sumę elementów z pominięciem największego.


        int[] tab = new int[]{5, 4, 3, 2, 1};
        System.out.println(sumOfArrayWithoutMaxValue(tab));
    }

    private static int sumOfArrayWithoutMaxValue(int[] tab) {

        Arrays.sort(tab);
        int sum = 0;
        for (int i = 0; i < tab.length - 1; i++) {

            sum = sum + tab[i];
            sum = sum;


        }
        return sum;


    }
}
