package day3;

import java.sql.SQLOutput;

public class WhileExample {
    public static void main(String[] args) {
        countdownFor(2);
        countdownWhile(3);
        countdownDoWhile(-1);
        fibonacci(6);


    }

    private static void fibonacci(int i) {
        int first = 0;
        int second = 1;
        int counter = 1;
        System.out.println(0);
        System.out.println(1);

        while (counter < i) {


            int sum = first + second;    //musimy nadać sume najpierw, później można nadpisac, ważna kolejność działań !!!!
            System.out.println(sum);
            counter++;
            first = second;
            second = sum;

        }

    }

    public static void countdownFor(int a) {


        System.out.println("parametr" + a);
        for (int i = a; i >= 0; i--) {
            System.out.println(i);

        }

    }


    public static void countdownWhile(int a) {
        System.out.println("parametr" + a);
        while (a >= 0) {
            System.out.println(a);
            a--;
        }
    }


    public static void countdownDoWhile(int a) {


        System.out.println("parametr " + a);


        if (a <= 0) {
            return;
        }
        do {
            System.out.println(a);
            a--;
        } while (a >= 0);
    }


}