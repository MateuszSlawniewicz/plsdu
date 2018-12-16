package day2;

public class ifExampleTwo {
    public static void main(String[] args) {

        System.out.println(introduction("Mateusz", 27, true));
        System.out.println(areBothEven(4, 2));
        System.out.println(sumOfTwoGiveThre(3, 4, 7));
        System.out.println(sumOfTwoAnother(3, 2, 5));
        System.out.println(isOneGreaterThaZero(-1, -1));

        System.out.println(checkWhichOneIsBigger(74, 54, 63));
    }

    public static double addTax(double price, int tax) {
        double afterTax = price * tax / 100 + price;
        return afterTax;


    }


    public static String introduction(String name, int age, boolean genderParam) {

        String gender;
        if (genderParam) {
            gender = "mezczyzna";
        } else {
            gender = "kobieta";
        }


        return "Czesc jestem " + name + ", mam " + age + "lat i jestem " + gender;
    }

    public static boolean areBothEven(int a, int b) {
        return a % 2 == 0 && b % 2 == 0;
    }

    public static boolean sumOfTwoGiveThre(int a, int b, int c) {
        return a + b == c;
    }

    public static boolean sumOfTwoAnother(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else if (c + b == a) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOneGreaterThaZero(int a, int b) {
        return a > 0 || b > 0;
    }



    public static double checkWhichOneIsBigger(double a, double b, double c) {

        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        } else {
            return c;
        }


    }
}

