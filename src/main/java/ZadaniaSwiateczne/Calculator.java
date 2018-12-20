package ZadaniaSwiateczne;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        int i;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj pierwsza liczbe");
            double firstNumber = scanner.nextDouble();
            System.out.println("podaj druga liczbe");
            double secondNumber = scanner.nextDouble();
            System.out.println("podaj rodzaj działania");
            System.out.println("dla mnożenia podaj /");
            System.out.println("dla dzielenia podaj *");
            System.out.println("dla odejmowania -");
            System.out.println("dla dodawania + ");
            scanner.nextLine();                                 // scanner problem solution
            String mathematicalOperation = scanner.nextLine();
            doWhileCalculator(firstNumber, secondNumber, mathematicalOperation);
            System.out.println("Koniec?  (jesli tak napisz koniec)");
            String isEnd = scanner.nextLine();
            i = isEnd == "koniec" ? 1 : 0;

        } while (i < 1);
    }

    private static void doWhileCalculator(double firstNumber, double secondNumber, String mathematicalOperation) {

        switch (mathematicalOperation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("dzialanie niemozliwe do wykonania");

        }


    }
}
