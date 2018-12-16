package day4;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(returnArray(5)));

    }

    public static int[] returnArray(int size) {

        int[] newTable = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            newTable[i] = random.nextInt();


        }
        return newTable;
    }
}
