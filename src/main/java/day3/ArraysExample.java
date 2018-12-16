package day3;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // int[] tab = {1,2,3}
        // jeżeli int [] tab = new int[3] to tablica z 3 zerami bo int to domyślnie 0
        // aby wyciągnąć int x=tab[1]


        int[] tabOne = {1, 5, 7, 8, 9};
        int[] tabTwo = new int[5];
        tabTwo[0] = 1;
        tabTwo[1] = 5;
        tabTwo[2] = 7;
        tabTwo[3] = 8;
        tabTwo[4] = 9;

        int[] anotherTable = new int[]{1, 2, 3, 4, 5, 6};
        int[] emptyTable = new int[9];


//        for (int i = 0; i < emptyTable.length; i++) {
//            emptyTable[i] = i + 1;
//
//
//        }
        printPrettyArray(anotherTable);
        System.out.println(Arrays.toString(anotherTable));


        int[] table = createArray(4);
        System.out.println(Arrays.toString(table));


        System.out.println(checkIfArraysAreSame(anotherTable, tabOne));
        System.out.println(checkIfArraysAreSame(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));

    }

    public static void printPrettyArray(int[] newTable) {
        String result = "[";

        for (int i = 0; i < newTable.length; i++) {
            newTable[i] = i + 1;
            result = result + newTable[i];
            if (i < newTable.length - 1) {
                result = result + ",";
            } else
                result = result + "]";

        }

        System.out.println(result);
    }


    //    Utwórz metodę, która zwraca tablicę o podanym rozmiarze wypełnioną kolejnymi wartościami.
    public static int[] createArray(int size) {

        int[] tabNew = new int[size];
        for (int i = 0; i < size; i++) {
            tabNew[i] = i + 1;
        }
        return tabNew;
    }


    public static int calculateDifferenceBetweenMinAndMax(int[] table) {
        int[] tab = calculateMinMax(table);

        return Math.abs(tab[1] - tab[0]);
    }

    public static int[] calculateMinMax(int[] table) {
        int max = table[0];
        int min = table[0];

        for (int element : table) {
            if (element > max) {
                max = element;
            }

            if (element < min) {
                min = element;
            }}

            int[] tabOfMinAndMax = new int[2];
            tabOfMinAndMax[0] = min;
            tabOfMinAndMax[1] = max;
            return tabOfMinAndMax;

        }


        public static boolean checkIfArraysAreSame ( int[] newTab, int[] anotherNewTab){

//        Utwórz metodę, która przyjmuje dwie tablice. Metoda ma zwrócić informację czy przekazane tablice są takie same.

            if (newTab.length != anotherNewTab.length) {
                return false;
            }

            for (int i = 0; i < newTab.length; i++) {
                if (newTab[i] != anotherNewTab[i]) {
                    return false;
                }

            }
            return true;
        }


    }