package matExercisesWeekOne;

public class MatExcSix {
    public static void main(String[] args) {


//        printCubesOfNumbers - wyswietlenie kolejnych liczb z wybranego zakresu i ich sześcianów
//        countdown - odliczanie w dół po podaniu liczby startowej
//        printMultiplications - wypisanie wyników mnożenia podanej liczby przez kolejne liczby całkowite do tej liczby włącznie


        printCubesOfNumbers(2, 5);
        countdown(10);
        printMultiplications(5);

    }


    public static void printCubesOfNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println("liczba i wynosi " + i + "  szescian liczby i to " + i * i * i);
        }

    }


    public static void countdown(int a) {
        for (int i = a; i >= 0; i--) {
            System.out.println(i);

        }
    }

    public static void printMultiplications(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println(i * a);
        }

    }


}
