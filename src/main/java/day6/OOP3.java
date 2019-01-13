package day6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOP3 {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam", "Nowak", 123, 50, BigDecimal.valueOf(1300.00));
        Student student1 = new Student("Kasia", "Kowalska", 321, 20, 987, BigDecimal.valueOf(1000));
        Pensioner pensioner1 = new Pensioner("Janusz", "Kwiatkowski", 124, 70, BigDecimal.valueOf(1000));

        Person[] personsArray = new Person[]{worker1, student1, pensioner1};
        Object[] objects = new Object[]{worker1, student1, pensioner1};

        List<Person> personList = new ArrayList<>();
        personList.add(worker1);
        personList.add(student1);
        personList.add(pensioner1);

        printSomeData(personList);

        List<NameHolder> nameHolders = new ArrayList<>();
        nameHolders.add(worker1);
        nameHolders.add(student1);
        //   nameHolders.add(pensioner1);   nie implementuje tego interfaceu
        printNames(nameHolders);
    }

    private static void printNames(List<NameHolder> nameHolders) {
        nameHolders
                .forEach(e -> System.out.println(e.showMeYourName()));


    }

    private static void printSomeData(List<Person> personList) {
        personList
                .forEach(e -> e.introduce());
        personList
                .forEach(e -> e.showMeTheIncome());


        for (Person o : personList) {
            System.out.println(o.showMeTheIncome());
            if (o instanceof Worker) {
                ((Worker) o).introduceInner();
            } else if (o instanceof Student) {
                ((Student) o).introduceInner();
            } else if (o instanceof Pensioner) {
                ((Pensioner) o).introduceInner();
            }


        }

    }

}
