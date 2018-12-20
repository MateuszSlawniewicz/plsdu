package ZadaniaSwiateczne;

import java.util.Scanner;

public class SwitchWelcomeClass {


    public static void main(String[] args) {


//        switchWelcome - Napisz program, który po podaniu kodu języka (dostępne PL, EN, DE, FR)
//        wyświetli odpowiedni napis powitalny (przy użyciu "switch") w danym języku (dla PL – „Dzień dobry.
//        Witam serdecznie”, dla EN – „Good morning. Welcome!”, dla DE – „Guten Morgen. Herzlich Willkommen!”,
//        dla FR – „Bonne matin. Bienvenue!”). Jeżeli wprowadzony kod nie odpowiada żadnemu z powyższych program
//        powinien o tym poinformować i przywitać się w języku angielskim.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your language: PL, EN, DE, FR");
        String language = scanner.nextLine();
        switchWelcome(language);

    }

    private static void switchWelcome(String language) {

        switch (language) {
            case "PL":
                System.out.println("Dzień dobry. Witam serdecznie");
                break;
            case "EN":
                System.out.println("Good morning. Welcome!");
                break;
            case "DE":
                System.out.println("Guten Morgen. Herzlich Willkommen!");
                break;
            case "FR":
                System.out.println("Bonne matin. Bienvenue!");
                break;
            default:
                System.out.println("Your answer is incorrect.\nGood morning. Welcome!");

        }


    }
}
