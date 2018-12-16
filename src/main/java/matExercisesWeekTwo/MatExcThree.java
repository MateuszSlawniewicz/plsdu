package matExercisesWeekTwo;

public class MatExcThree {
    public static void main(String[] args) {
        returnTwentyNumbersAndCheckIsEvenUsingFor(1,20);
//        returnTwentyNumbersAndCheckIsEvenUsingWhile(1,20);

    }

    public static void returnTwentyNumbersAndCheckIsEvenUsingFor(int firstNumber, int lastNumber) {


        boolean even = false;
        for (int i = firstNumber; i <= lastNumber; i++) {
            firstNumber = i;

            even = firstNumber % 2 == 0;

            System.out.println("" + (firstNumber) + "       " + even);
        }



    }

//    public static void returnTwentyNumbersAndCheckIsEvenUsingWhile(int firstNumber, int lastNumber){
//        boolean even;
//        int i = firstNumber;
//        while( i <= lastNumber){
//            i = firstNumber;
//            even = firstNumber % 2 == 0;
//
//            System.out.println("" + (firstNumber) + "       " + even);
//            i++;
//
//        }
//
//    }
}
