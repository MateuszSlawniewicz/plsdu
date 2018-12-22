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
//    Uzupełnij metodę toString() z pociągu aby wyświetlała także wagony (Arrays.toString())    // todo
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


    private double weight;
    private String name;
    private int numberOfPassengers;
    private int numberOfWagons;
    private Wagon[] wagon;






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
