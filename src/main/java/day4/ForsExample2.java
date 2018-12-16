package day4;

import java.sql.SQLOutput;

public class ForsExample2 {
    public static void main(String[] args) {

        christmasTree(3);
    }

    public static void christmasTree(int param) {

        for (int i = 0; i < param; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }


    }
}
