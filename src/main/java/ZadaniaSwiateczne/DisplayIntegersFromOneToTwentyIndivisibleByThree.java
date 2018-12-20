package ZadaniaSwiateczne;

public class DisplayIntegersFromOneToTwentyIndivisibleByThree {
    public static void main(String[] args) {


//        Wykorzystując pętlę while, napisz program, który wyświetli liczby całko
//        wite od 1 do 20 niepodzielne przez 3.

        displayIntegersFromOneToTwentyIndivisibleByThreeUsingWhile(20, 3);
    }

    private static void displayIntegersFromOneToTwentyIndivisibleByThreeUsingWhile(int lastNumber, int divider) {


        int i = 1;


        while (i <= lastNumber) {

            if (i % divider != 0) {
                System.out.print(i + "\t");
            }

            i++;

        }


    }
}
