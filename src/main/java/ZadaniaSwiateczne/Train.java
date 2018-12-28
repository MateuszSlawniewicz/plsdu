package ZadaniaSwiateczne;


import java.util.Arrays;

public class Train {
//    Utwórz klasę reprezentującą pociąg
//    pola:
//      -masa pociągu
//      -nazwa pociągu
//      -liczba pasażerów
//      -liczba wagonów

    // Do klasy reprezentującej pociąg dopisz pole przedstawiające wagony (tablica wagonów).
//    Uzupełnij metodę toString() z pociągu aby wyświetlała także wagony (Arrays.toString())
//    Utwórz nowy pociąg nadając mu podstawowe wartości a także utwórz kilka wagonów i dodaj je
//    do pociągu (przez setter), następnie wyświetl obiekt pociągu (przekazując go do System.out.println().
//    W klasie pociągu utwórz metodę służącą do dodawania po jednym wagonie do tablicy wagonów.
//    Utworz nowy pociąg i dodaj do niego wagony przy pomocy nowej metody, następnie wyświetl pociąg.


//    24. Do klasy reprezentującej pociąg dopisz pole przedstawiające wagony (tablica wagonów).
//    Uzupełnij metodę toString() z pociągu aby wyświetlała także wagony (Arrays.toString())
//    Utwórz nowy pociąg nadając mu podstawowe wartości a także utwórz kilka wagonów i dodaj je
//    do pociągu (przez setter), następnie wyświetl obiekt pociągu (przekazując go do System.out.println().
//    W klasie pociągu utwórz metodę służącą do dodawania po jednym wagonie do tablicy wagonów.
//    Utworz nowy pociąg i dodaj do niego wagony przy pomocy nowej metody, następnie wyświetl pociąg.


//    dodawania pojedynczych wagonów do pociągu. Załóżmy, że nazwaliście klasę z pociągiem Train (całkiem przewrotnie)
//    a klasę wagonu dajmy na to RailwayWagon. Przypuszczalnie tablica wagonów będzie w takim razie określona jako
//    RailwayWagon[] wagons, natomiast metodka która ma dodawać po jednym wagonie "
//    public void addOneWagon(RailwayWagon wagon){//ciało metody}. Wtedy to w ciele metody możecie zrealizować
//    dodawanie poprzez tworzenie za każdym razem nowej tablicy o jeden element większej niż poprzednia i przepisanie starej
//    do nowej wraz z dodaniem nowego wagonu na koniec i przypisywanie nowej tablicy do pola w klasie/obiekcie.

    private double weight;
    private String name;
    private int numberOfPassengers;
    private int numberOfWagons;
    private Wagon[] wagon;

    public void addOneWagon(Wagon wagon) {


        Wagon[] newWagon;
        newWagon = new Wagon[this.wagon.length + 1];


        for (int i = 0; i < this.wagon.length; i++) {
            newWagon[i] = this.wagon[i];
        }
        newWagon[this.wagon.length] = wagon;
        setWagon(newWagon);


    }


    public Wagon[] getWagon() {
        return wagon;
    }

    public void setWagon(Wagon[] wagon) {
        this.wagon = wagon;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return "Train{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", numberOfWagons=" + numberOfWagons +
                ", wagon=" + Arrays.toString(wagon) +
                '}';
    }


}
