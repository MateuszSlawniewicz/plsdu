package ZadaniaSwiateczne;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysSort {

    public static void main(String[] args) {
//        Utwórz metodę przyjmującą dwie tablice z liczbami i zwracającą tablicę zawierającą posortowane unikatowe wartości z
//        przekazanych tablic (do posortowania można użyć pętli while z zamienianiem elementów miejscami, albo Arrays.sort -
//        prostsza wersja; do wybrania wartości unikatowych najlepiej zaimplementować dodatkową metodkę sprawdzającą czy wynikowa
//        tablica zawiera już dany element).


        System.out.println(Arrays.toString(getUniqueArray(new int[]{1, 2, 3}, new int[]{1, 4, 3, 5, 6})));


    }

    private static int[] getUniqueArray(int[] firstArray, int[] secondArray) {


        int[] newArray = createNewSortedArray(firstArray, secondArray);


        int[] uniqueArray = IntStream.of(newArray).distinct().toArray();
        return uniqueArray;


//        int i = 0;
//
//        for (int z = 0; z <= i + 1; z++) {
//
//
//            for (i = 0; i < newArray.length; i++) {
//                for (int j = 0; j < newArray.length; j++) {
//                    if (newArray[j+1]== newArray[i]) {
//                        i++;
//                    }
//
//                }
//
//            }
//            uniqueArray[z] = newArray[i];
//        }
//       return uniqueArray;

    }

    private static int[] createNewSortedArray(int[] firstArray, int[] secondArray) {

        int[] newArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < firstArray.length + secondArray.length; i++) {

            newArray[i] = secondArray[i - firstArray.length];

        }


        return newArray;


    }


}
