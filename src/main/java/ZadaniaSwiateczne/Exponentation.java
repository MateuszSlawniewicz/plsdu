package ZadaniaSwiateczne;

public class Exponentation {


    public static void main(String[] args) {


//        Utwórz metodę, do której przekazujesz dwie liczby. Metoda ma wyświetlić wszystkie potęgi
//        pierwszej liczby do momentu przekroczenia drugiej liczby
        getExponentation(4, 32);

    }

    private static void getExponentation(int firstNumber, int secondNumber) {
        int temp = firstNumber;
        System.out.print(temp + "\t");

        for (int j = 1; j < secondNumber; j++) {
            temp = temp * firstNumber;
            temp = temp;
            System.out.print(temp + "\t");

        }


    }
}
