package codewars;

import java.util.Arrays;

public class FindTheUniqueNumber {

    public static void main(String[] args) {


        //          Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
        //          Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
        //          It’s guaranteed that array contains more than 3 numbers.
        //                  The tests contain some very huge arrays, so think about performance.
//

    }


    private static double findUniq(double arr[]) {


        Arrays.sort(arr);

        if (arr[0] == arr[1]) {

            return arr[arr.length - 1];

        }

        return arr[0];


    }

}
