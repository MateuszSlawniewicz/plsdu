package ZadaniaSwiateczne;

public class TestNumbers {
    public static void main(String[] args) {

        System.out.println(isSumOfAnyTwoParamsGiveThirdValue(3, 5, 2));

        System.out.println(isAnyOfNumbersIsLessThanZero(4, 5, -6, 7, 8));

    }

    private static boolean isBothEven(int a, int b) {
        return a % 2 == 0 && b % 2 == 0;   //Utwórz metodę, do której przekazujesz dwa parametry a ona zwróci
        // informację (wartość logiczną - `boolean`) czy **obydwie** są parzyste.
    }


    private static boolean isSumOfFirstTwoParamsGiveThirdParam(int a, int b, int c) {
        return (a + b) == c;
    }
//    Utwórz metodę, do której przekazujesz trzy liczby a ona zwróci informację (wartość logiczną - `boolean`)
//    czy suma pierwszych dwóch daje trzecią//


    private static boolean isSumOfAnyTwoParamsGiveThirdValue(int a, int b, int c) {
        if ((a + b) == c) {
            return true;

        } else if ((b + c) == a) {
            return true;
        } else if ((a + c) == b) {
            return true;

        } else {
            return false;
        }

    }   // w drugiej wersji sprawdź czy jakiekolwiek dwie dają trzecią.

//    Utwórz metodę, do której przekazujesz dwie liczby a ona zwróci informację (wartość logiczną - `boolean`)
//    czy **chociaż jedna z nich** jest większa od zera

    private static boolean checkIsAnyOfTwoNumbersIsGreateraThanZero(int a, int b) {
        if (a > 0 || b > 0) {
            return true;
        } else {
            return false;
        }

    }

    //    Utwórz metodę do której przekazujesz dowolną liczbę liczb:) i sprawdzasz czy jakakolwiek
//    jest mniejsza od zera. #varargs
    private static boolean isAnyOfNumbersIsLessThanZero(int... args) {


        for (int i : args) {
            if (i < 0) {
                return true;
            } else i++;

        }
        return false;

    }

}







