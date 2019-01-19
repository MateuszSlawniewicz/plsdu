package day7;

public class ExceptionsExample {                        //lombok do dependencies
    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));
        } catch (ArithmeticException e) {
            System.out.println("Wystąpił błąd : " + e.getMessage());
        }
        System.out.println(divide(4, 2));


        try {
            System.out.println(divideWithException(2, 0));
        } catch (MyRuntimeException | ArithmeticException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        } finally {
            System.out.println("Blok finally");
        }

        try {
            divideWithCheckedException(2, 0);
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }

    private static int divideWithCheckedException(int a, int b) throws MyCheckedException {
        if (b == 0) {
            throw new MyCheckedException("Nie dziel przez zero!");
        }
        return a / b;


    }


    private static int divideWithException(int a, int b) {
        if (b == 0) {
            throw new MyRuntimeException("Nie dziel przez zero!");
        }
        return a / b;


    }

    private static int divide(int a, int b) {
        return a / b;
    }


}
