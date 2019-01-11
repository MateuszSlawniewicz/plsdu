package codewars;

import java.util.Arrays;

public class SortTheOdd {
    //       You have an array of numbers.
    //       Your task is to sort ascending odd numbers but even numbers must be on their places.
    //       Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
    //               Example
    //       sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]


    public static void main(String[] args) {
        int[] array = {5, 3, 2, 8, 1, 4};


        System.out.println(Arrays.toString(sortArray(array)));
    }


    private static int[] sortArray(int[] array) {
        int k = 0;

        for (int l = 0; l < array.length; l++) {
            if (array[l] % 2 == 0) {
                k++;
            }

        }   // ilośc parzystych


        int[] oddArray = new int[array.length - k];
        int j = 0;


        for (int i = 0; i < array.length; i++) {             // tworzenie tablicy niepatzystych


            if ((array[i] % 2) == 1) {
                oddArray[j] = array[i];
                j = j + 1;
            }


        }
        Arrays.sort(oddArray);     //sortowanie tablicy nieparzystych

        int[] sortArrayWitgOdds = new int[array.length];

        int counter = 0;       // counter do tablicy nieparzystych


        for (int i = 0; i < array.length; i++) {        // tworzenie gotowej tablicy

            if (array[i] % 2 == 1) {
                sortArrayWitgOdds[i] = oddArray[counter];
                counter++;
            } else {
                sortArrayWitgOdds[i] = array[i];
            }


        }
        return sortArrayWitgOdds;


    }


}
