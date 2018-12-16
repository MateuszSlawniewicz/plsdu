package matExercisesWeekTwo;

import java.util.Arrays;

public class MatExcOne {
    public static void main(String[] args) {
//        Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca nową tablicę z liczbami w odwrotnej kolejności.


        int[] firstArray = {1, 9, 3, 5};
        int[] secondArray = changeSequenceInArray(firstArray);
        System.out.println(Arrays.toString(secondArray));

        System.out.println(Arrays.toString(reversedArray(new int []{1,2,3})));


    }

    public static int[] changeSequenceInArray(int[] firstArray) {

        int temp;    // zmiennna w celu pamięci

        for (int i = 0; i < firstArray.length / 2; i++) {


            temp = firstArray[firstArray.length - i - 1];
            firstArray[firstArray.length - i - 1] = firstArray[i];
            firstArray[i] = temp;


        }
        return firstArray;


    }

    public static int[] reversedArray(int[] firstArray) {
        int length = firstArray.length;
        int[] tabResult = new int[length];
        for (int i = length; i > 0; i--) {
            tabResult[length - i] = firstArray[i - 1];
        }
        return tabResult;
    }
}
