package ZadaniaSwiateczne;


import java.util.Scanner;

public class Factioral {


    public static void main(String[] args) {

//        Napisz program, który oblicza silnię dla zadanej liczby przez użytkownika (do n=12) przy użyciu while

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość n");
        int integerN = scanner.nextInt();

        System.out.println(factorialTillTwelveWithWhile(integerN));

    }


    private static int factorialTillTwelveWithWhile(int integerN) {

        int i = 1;
        int j = 1;
        int z = 0;


        if (integerN == 0) {
            z = 1;
        } else {
            while (i <= integerN) {

                z = j * i;
                j = z;
                i++;

            }

        }

        return z;
    }
}
