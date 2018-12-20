package ZadaniaSwiateczne;

public class OOPForTrain {
    public static void main(String[] args) {
        Train train = new Train();
        train.setName("Pendolino");
        train.setWeight(600);
        train.setNumberOfPassengers(500);
        train.setNumberOfWagons(10);

        System.out.println(train.toString());
    }


}
