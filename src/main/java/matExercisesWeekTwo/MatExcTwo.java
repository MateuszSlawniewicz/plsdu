package matExercisesWeekTwo;

import day3.ArraysExample;

import java.util.Scanner;

public class MatExcTwo {
    public static void main(String[] args) {
//        Napisz metodę pobierającą od użytkownika 5 różnych
//        liczb całkowitych za pomocą pętli for,
//• Po zakończeniu pobierania wypisz sumę oraz średnią
//        wszystkich pobranych liczb.
//• Wypisz najmniejszą oraz największą z
//        podanych przez użytkownika liczb.


        getfiveNumbers(5);


    }

    public static void getfiveNumbers(int param) {

        int[] arrayForFive = new int[param];

        for (int i = 0; i < param; i++) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę");
            arrayForFive[i] = scanner.nextInt();
        }
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < param; i++) {
            sum = arrayForFive[i] + sum;
        }


        System.out.println(sum);

        avg = sum / param;

        System.out.println(avg);
        int[] tabForHelp = ArraysExample.calculateMinMax(arrayForFive);
        System.out.println("Min to " + tabForHelp[0] + "Max to " + tabForHelp[1]);


    }

}


