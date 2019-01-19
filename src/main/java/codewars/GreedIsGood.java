package codewars;

import java.util.Arrays;

public class GreedIsGood {

    public static void main(String[] args) {
//        Three 1's => 1000 points
//        Three 6's =>  600 points
//        Three 5's =>  500 points
//        Three 4's =>  400 points
//        Three 3's =>  300 points
//        Three 2's =>  200 points
//        One   1   =>  100 points
//        One   5   =>   50 point
        int[] ints = {5, 1, 3, 4, 1};
        System.out.println(greedy(ints));
        System.out.println(Arrays.toString(countering(ints)));
        int[] ints2 = {1, 1, 1, 3, 1};
        System.out.println(greedy(ints2));
    }

    public static int greedy(int[] dice) {

        int[] counters = countering(dice);
        int counterForOne = counters[0];
        int counterForTwo = counters[1];
        int counterForThree = counters[2];
        int counterForFour = counters[3];
        int counterForFive = counters[4];
        int counterForSix = counters[5];
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        if (counterForOne < 3) {
            one = counterForOne * 100;
        } else one = 1000 + (counterForOne - 3) * 100;
        if (counterForFive < 3) {
            five = counterForFive * 50;
        } else five = 500 + (counterForFive - 3) * 50;
        if (counterForFour >= 3) {
            four = 400;
        }
        if (counterForThree >= 3) {
            three = 300;
        }
        if (counterForTwo >= 3) {
            two = 200;
        }
        if (counterForSix >= 3) {
            six = 600;
        }
        return one + two + three + four + five + six;
    }

    private static int[] countering(int[] dice) {
        int counterForOne = 0;
        int counterForTwo = 0;
        int counterForThree = 0;
        int counterForFour = 0;
        int counterForFive = 0;
        int counterForSix = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                counterForOne++;
            }
            if (dice[i] == 2) {
                counterForTwo++;
            }
            if (dice[i] == 3) {
                counterForThree++;
            }
            if (dice[i] == 4) {
                counterForFour++;

            }
            if (dice[i] == 5) {
                counterForFive++;
            }
            if (dice[i] == 6) {
                counterForSix++;
            }
        }
        int[] counters = new int[]{counterForOne, counterForTwo, counterForThree, counterForFour, counterForFive, counterForSix};
        return counters;

    }


}
