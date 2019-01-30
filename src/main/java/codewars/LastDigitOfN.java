package codewars;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LastDigitOfN {

    public static void main(String[] args) {
        System.out.println(get(12));    // "1"
        System.out.println(get(2));    // "5"
        System.out.println(get(3));    // "6"
        System.out.println(get(4));    // "25"


    }


    public static BigInteger get(int n) {
        int counter = 0;

        for (int i = 1; counter <= n; i++) {
            String temp = Integer.toString((int) (Math.pow(i, 2)));
            String secondTemp = Integer.toString(i);

            if (temp.substring(temp.length() - secondTemp.length()).equals(secondTemp)) {
                counter++;
            }
            if (counter == n) {
                return BigInteger.valueOf(i);
            }


        }
        return BigInteger.valueOf(1);


    }


}
