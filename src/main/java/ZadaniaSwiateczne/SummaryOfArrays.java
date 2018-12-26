package ZadaniaSwiateczne;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SummaryOfArrays {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(createNewArrayFromTwoArrays(new int[]{1, 2, 3}, new int[]{2, 5, 6})));

    }

    //Utwórz metodę przyjmującą dwie tablice z liczbami i zwracającą tablicę będącą efektem połączenia tych dwóch.


    private static int[] createNewArrayFromTwoArrays(int[] firstArray, int[] secondArray) {

        int[] newArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < firstArray.length + secondArray.length; i++) {

            newArray[i] = secondArray[i - firstArray.length];

        }

        return newArray;
    }
}



