package ZadaniaSwiateczne;

public class Wagon {
//
//    . Utwórz klasę reprezentującą wagon
//    pola:
//      -masa wagonu
//      -klasa wagonu
//      -liczba pasażerów
//      -czy jest dotępne jedzenie
//      metody:
//            -gettery i settery
//              -toString() wyświetlający powyższe dane


    private double weight;
    private String wagonsClass;
    private int numberOfPassangers;
    private boolean isFoodAvailable;

    @Override
    public String toString() {
        return "Wagon{" +
                "Waga = " + weight +
                ", klasa wagonu ='" + wagonsClass + '\'' +
                ", liczba pasażerów =" + numberOfPassangers +
                ", czy jedzenie jest dostępne = " + isFoodAvailable +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWagonsClass() {
        return wagonsClass;
    }

    public void setWagonsClass(String wagonsClass) {
        this.wagonsClass = wagonsClass;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    public boolean isFoodAvailable() {
        return isFoodAvailable;
    }

    public void setFoodAvailable(boolean foodAvailable) {
        isFoodAvailable = foodAvailable;
    }
    //

}
