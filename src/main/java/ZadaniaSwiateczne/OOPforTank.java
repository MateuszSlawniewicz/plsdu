package ZadaniaSwiateczne;

public class OOPforTank {


    public static void main(String[] args) {


        Tank tank = new Tank();
        tank.setName("Tiger");
        tank.setFuelUsage(60);
        tank.setFuelTankCapacity(600);
        tank.setWeight(500);
        double fuel = 120;
        System.out.println(tank.toString());
        System.out.println(tank.howFarCanTankGo(fuel));



//        Należy utworz
//        yć nową instację czołgu, nadać mu nazwę i masę, określić spalanie i pojemność zbiornika paliwa.
//        Następnie wypisać w konsoli wartość określoną w toString() (przekazując obiekt do System.out.println())
//        Następnie wypisać ile kilometrów przejedzie czołg dla dowolnych wartości (wykorzystując metodę z utworzonej klasy)///

    }
}
