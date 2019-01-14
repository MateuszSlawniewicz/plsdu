package codewars;

import java.util.Arrays;

public class FindTheMissingLetter {

    public static void main(String[] args) {

        char[] chars = new char[]{'a', 'b', 'c', 'd', 'f'};
        int firstValueArray = (int) (chars[0]);
        System.out.println(firstValueArray);
        int lastValue = (int) chars[chars.length - 1];
        System.out.println(lastValue);
        System.out.println(findMissingLetter(chars));
    }

    public static char findMissingLetter(char[] array) {
        int firstValueArray = (int) array[0];
        int lastValue = (int) array[array.length - 1];
        char[] chars = new char[array.length + 1];
        int j = 0;
        for (int i = firstValueArray; i < lastValue; i++) {

            if (i == (int) array[j]) {
                chars[j] = array[j];
                j = j + 1;
            } else {

                return (char) i;
            }
        }
        return ' ';
    }
}

