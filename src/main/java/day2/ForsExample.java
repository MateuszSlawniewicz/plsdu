package day2;

public class ForsExample {

    public static void main(String[] args) {
        {
            printFewNaturalNumbers(5);
            printNumbersWithoutDevidablesByParam(4);
            sumNaturalNumbersToLimit(1000);
        }
    }

    private static void sumNaturalNumbersToLimit(int limit) {

        System.out.println("Limit");
        int sum = 0;

        for (int i = 0; ; i++) {
            if (sum + i >= limit) {                 // przed przypisaniem wartości, dlatego trzeba dodać
                break;
            }
            sum = i + sum;
        }
        System.out.println(sum);
    }

    private static void printNumbersWithoutDevidablesByParam(int param) {
        System.out.println("dividables");

//        for (int i = 0; i <= 10; i++) {
//            if (i % param != 0) {
//                System.out.println(i);
//            }
//        }
        for (int i = 0; i <= 10; i++) {
            if (i % param == 0) {
                continue;
            }
            System.out.println(i);
        }


    }

    public static void printFewNaturalNumbers(int endNumber) {
        for (int i = 0; i < endNumber; i++) {
            System.out.println(i);
        }
    }


}
