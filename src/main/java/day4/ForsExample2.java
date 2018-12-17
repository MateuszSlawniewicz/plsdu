package day4;

import java.sql.SQLOutput;

public class ForsExample2 {
    public static void main(String[] args) {

        christmasTree(3);
        christmasTreeUpsidedown(3);
        System.out.println();
        printNumbersInTower(3);

        printAnotherTowerOfNumbers(5);
    }

    public static void christmasTree(int param) {

        for (int i = 0; i < param; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }


    }

    public static void christmasTreeUpsidedown(int param) {

        for (int i = param - 1; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }


    }

    private static void printNumbersInTower(int param) {


        for (int i = 0; i < param; i++) {
            int num = 1;
            for (int j = 0; j <= i + 1; j++) {


                System.out.print(num);
                num++;
            }
            System.out.println();
        }


    }


    private static void printAnotherTowerOfNumbers(int param) {


        for (int i = 0; i < param; i++) {


            for (int j = (param - i - 1); j > 0; j--) {
                // printing spaces
                System.out.print(" ");
            }
            int num = 1;

            for (int j = 0; j <= i; j++) {

                System.out.print(num);
                num++;
            }

            System.out.println();
        }
    }
}
