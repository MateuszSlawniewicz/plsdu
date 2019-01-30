package codewars;

import java.util.Arrays;

public class SplitArrays {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getAnotherArray(new int[]{4, 2, 5, 3, 2, 5, 7}, 2
        )));
    }

    public static int[] getAnotherArray(int[] numbers, int n) {


        for (int i = 0; i < n; i++) {
            int[] temp = splitAndAdd(numbers);
            numbers = temp;

        }
        return numbers;


    }


    public static int[] splitAndAdd(int[] numbers) {

        int[] ints = new int[numbers.length / 2];
        int[] ints2 = new int[numbers.length - ints.length];
        int size = ints2.length;
        int[] sumArray = new int[size];

        for (int i = 0; i < numbers.length / 2; i++) {
            ints[i] = numbers[i];
        }
        for (int i = ints.length, j = 0; i < numbers.length; i++, j++) {
            ints2[j] = numbers[i];
        }

        if (ints.length < ints2.length) {
            for (int i = ints2.length - 1, j = ints.length - 1; i > 0; i--, j--) {
                sumArray[i] = ints2[i] + ints[j];
            }
            sumArray[0] = ints2[0];
        } else {
            for (int i = 0; i < size; i++) {
                sumArray[i] = ints[i] + ints2[i];
            }
        }
        return sumArray;


    }

}
