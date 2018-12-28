package ZadaniaSwiateczne;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddNewElementToArray {
    public static void main(String[] args) {
        //       Utwórz metodę przyjmującą tablicę liczb i liczbę a zwracającą tę tablicę z dopisaną liczbą.

        System.out.println(Arrays.toString(addElementToArray(new int[]{1, 2, 3}, 4)));

    }

    private static int[] addElementToArray(int[] tab, int element) {

        int[] newArray = new int[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            newArray[i] = tab[i];

        }

        newArray[tab.length] = element;
        return newArray;








    }
}
