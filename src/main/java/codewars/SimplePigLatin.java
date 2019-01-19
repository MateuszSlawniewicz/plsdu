package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimplePigLatin {

    public static void main(String[] args) {

        System.out.println(pigIt("Pig latin is cool"));


    }

    private static String pigIt(String str) {

        String[] output = str.split(" ");
        String[] inOut = new String[output.length];
        int counter = 0;
        for (String o : output) {
            if (o.equals("!")|| o.equals(".")||o.equals("?")) {
                inOut[counter] = o;
                counter++;
            } else {

                inOut[counter] = o.substring(1, o.length()) + o.charAt(0) + "ay";
                counter++;

            }
        }
        String strToRet = Arrays.stream(inOut).collect(Collectors.joining(" "));
        return strToRet;
    }
}
