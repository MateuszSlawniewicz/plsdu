package ZadaniaSwiateczne;

public class Tank {


//    Utwórz klasę będącą reprezentacją czołgu
//    pola:
//      -masa czołgu
//      -nazwa czołgu
//      -pojemność zbiornika paliwa
//      -spalanie (ile litrów na 100km)
//
//      metody:
//          -gettery i settery do wszystkich pól
//          -nadpisana metoda toString wypisująca "Jestem czołgiem o masie <masa>, nazwie <nazwa> oraz spalam <spalanie> na 100km"
//          -metoda zwracająca wartość kilometrów jaką przejedzie czołg na przekazanej w parametrze ilości paliwa w litrach (edited)



private double weight;
private String name;
private double fuelTankCapacity;
private double fuelUsage;


public double howFarCanTankGo(double fuel){
    return fuel/fuelUsage;

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

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public String toString(){
        return "Jestem czołgiem o masie "+weight+" ton o nazwie"+name+" oraz spalam "+fuelUsage+"l na 100 km.";

    }
}
