package day2;

public class MethodsExample {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Pole prostokata wynosi " + (a * b));
        int z = rectangleArea(a, b);
        System.out.println(rectangleArea(a, b));
        z = rectangleArea(5, 6);

        System.out.println(rectangleCircuit(a, b));


        System.out.println(minutesToDateValue((60 * 24 * 365)));
    }

    public static int rectangleArea(int a, int b) {

        return a * b;


    }

    public static int rectangleCircuit(int a, int b) {
        return (a + b) * 2;
    }

    public static double inchToMeter(double inches) {
        return inches * 0.254;


    }

    public static String minutesToDateValue(int minutes) {

        int y = minutes / 525600;
        int d = ((minutes % 525600) % 43200) / 1440;
        int h = (((minutes % 525600) % 43200) % 1440) / 60;
        int m = minutes % 60;

        return y + "y " + d + "d " + h + "h " + m + "m";

    }

    public static int sumThreeDigitsOfNumber(int number) {

        int result;
        int last = number % 10;
        int middle = number % 100 / 10;
        int first = number % 100 / 100;
        result = last + middle + first;

        return result;


    }

    public static double bmi(double w, double h) {

        return w / (h * h);
    }
}
