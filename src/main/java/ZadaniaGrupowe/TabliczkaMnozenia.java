package ZadaniaGrupowe;

import java.util.Scanner;

public class TabliczkaMnozenia {
    public static void main(String[] args) {
        System.out.println("podaj wysokosc ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        System.out.println("podaj szerokosc ");
        int width = scanner.nextInt();
        multiplicationTableFor(height, width);

    }

    private static void multiplicationTableFor(int height, int width) {


        for (int i = 1; i <= height; i++) {
            if (i % 2 == 0) {
                System.out.println();
            } else {


                for (int j = 1; j <= width; j++) {
                    System.out.print((i * j) + "\t");

                }
                System.out.println();

            }


        }

    }


//    private static void multiplicationTableWhile(int height, int width) {
//        int i = 1;
//        while (i <= height) {
//
//            int j = 1;
//            while (j <= width) {
//
//
//            }
//
//        }
//
//
//    }
}
