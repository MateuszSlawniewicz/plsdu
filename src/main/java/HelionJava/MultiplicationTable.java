package HelionJava;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość");
        int width = scanner.nextInt();
        System.out.println("Podaj szerokość");
        int hight = scanner.nextInt();

//        multiplicationTableWhile(width, hight);

        multiplicationTableFor(width,hight);
    }

    private static void multiplicationTableWhile(int hight, int width) {

        int i = 1;
        while (i <= hight) {
            int j = 1;

            while (j <= width) {
                System.out.print(i * j+"\t");
                j++;
            }
            i++;
            System.out.println();


        }


    }

    private static void multiplicationTableFor(int hight, int width){


        for (int i = 1; i <= hight; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }



    }
}