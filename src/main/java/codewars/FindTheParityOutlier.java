package codewars;

import java.util.Arrays;

public class FindTheParityOutlier {

    public static void main(String[] args) {

    }

    private static int find(int[] integers) {

        int evenCounter = 0;
        int even = 0;
        int oddCounter = 0;
        int odd = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evenCounter++;
                even = integers[i];
            }
            if (integers[i] % 2 != 0) {
                oddCounter++;
                odd = integers[i];
            }


        }

        if (evenCounter == 1) {
            return even;
        }

        if (oddCounter == 1) {
            return odd;
        }

        return 0;
    }
}
