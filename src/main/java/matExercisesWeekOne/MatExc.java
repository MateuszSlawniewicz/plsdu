package matExercisesWeekOne;

import java.util.Scanner;

public class MatExc {
    public static void main(String[] args) {


        // "Cześć. Jak się czujesz?" <pobranie wartości String - o tym jak się czujecie>
        //"Cieszę się, że czujesz się " ... -> wyświetlenie wartości
        //"Jak masz na imię?" <pobranie wartości imienia>
        //"Ile masz lat?" <pobranie wartości lat>
        //imie + " masz " + wiek + " lat" -> wypisanie wartości
        //"Ile masz wzrostu (dokładnie!)?" <pobranie wartości wzrostu>
        //imie + " masz " + wzrost + " cm" -> wypisanie wartości
        //"A jak czujesz się teraz?" <pobranie wartości i reużycie zmiennej o samopoczuciu>
        //"Cieszę się, że czujesz się " -> wyswietlenie samopoczucia

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć. Jak się czujesz?");
        String howDoYouFeel = scanner.nextLine();
        System.out.println("Cieszę się, że czujesz się " + howDoYouFeel);
        System.out.println("Jak masz na imie?");
        String name = scanner.nextLine();
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();
        System.out.println(name + " masz " + age + " lat");
        System.out.println("Ile masz wzrostu (dokładnie!)?");

        int height = scanner.nextInt();
        System.out.println(name + " masz " + height + "cm");
        System.out.println("A jak czujesz się teraz?");

        howDoYouFeel = scanner.nextLine();


        System.out.println("Ciesze sie, ze czujesz sie " + howDoYouFeel);

    }
}


