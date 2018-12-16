package matExercisesWeekOne;

import java.util.Scanner;

public class MatExcSeven {
    public static void main(String[] args) {
//        . testResult - program, który pyta o ilość uzyskanych punktów z testu (0-100),
//        a następnie wystawia ocenę (gdzie 50 punktów zalicza test, a każde następne 10 podwyższa ocenę o 1,
//        tak że 90-100 punktów daje najwyższą możliwą ocenę czyli 6). Użyj zagnieżdżonej instrukcji if … else if … else


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wynik testu");
        int points = scanner.nextInt();
        System.out.println(testResult(points));

    }

    public static int testResult(int points) {


        if (points >= 50) {
//            if (points < 59)
//                return 2;
//            else if (points < 69 && points >= 60) {
//                return 3;
//            } else if (points < 79 && points >= 70) {
//                return 4;
//            } else if (points < 89 && points >= 80) {
//                return 5;
//            } else {
//                return 6;

            return calculateResultWhenExamIsPassed(points);   // wywolaj w metodzie!!
        } else {
            return 1;
        }
    }

    public static int calculateResultWhenExamIsPassed(int points) {
        if (points < 59)
            return 2;
        else if (points < 69 && points >= 60) {
            return 3;
        } else if (points < 79 && points >= 70) {
            return 4;
        } else if (points < 89 && points >= 80) {
            return 5;
        } else {
            return 6;

        }


    }


}



