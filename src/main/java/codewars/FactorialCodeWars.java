package codewars;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FactorialCodeWars {
    public static void main(String[] args) {

        System.out.println(factorial(140));


    }


    public static String factorial(int n) {

        if (n < 2) {

            return "1";

        }

        return IntStream.rangeClosed(2, n).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get().toString();

    }


}
