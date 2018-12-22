package ZadaniaSwiateczne;

public class OOPForTrain {
    public static void main(String[] args) {
        Train train = new Train();
        train.setName("Pendolino");
        train.setWeight(600);
        train.setNumberOfPassengers(500);




        Wagon firstWagon = new Wagon();
        firstWagon.setFoodAvailable(true);
        firstWagon.setNumberOfPassangers(25);
        firstWagon.setWagonsClass("Pierwsza");
        firstWagon.setWeight(300);


        Wagon secondWagon = new Wagon();
        secondWagon.setFoodAvailable(false);
        secondWagon.setNumberOfPassangers(45);
        secondWagon.setWeight(400);
        secondWagon.setWagonsClass("druga");





    }


}
