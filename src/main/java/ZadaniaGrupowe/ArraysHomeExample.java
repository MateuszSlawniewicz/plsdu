package ZadaniaGrupowe;

import java.util.Arrays;
import java.util.Random;

public class ArraysHomeExample {
    public static void main(String[] args) {


        int[] tabNew = generateArray(4);


        System.out.println(Arrays.toString(tabNew));

    }


    private static int[] generateArray(int tabSize) {

        int[] tabToReturn = new int[tabSize ];
        for (int i = 0; i < tabSize; i++) {
          tabToReturn[i] = i + 1;

        }

        return  tabToReturn;


    }
}
