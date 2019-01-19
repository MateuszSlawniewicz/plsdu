package day7;

import day6.Pensioner;
import day6.Person;
import day6.Student;
import day6.Worker;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsExample {
    public static final Student student1 = new Student("B3", "Nowak", 3, 5, 43, BigDecimal.ZERO);
    public static final Student student2 = new Student("B5", "Nowak", 5, 5, 43, BigDecimal.ZERO);
    public static final Worker worker1 = new Worker("B6", "Kowalski", 6, 6, BigDecimal.ZERO);
    public static final Pensioner pensioner1 = new Pensioner("B7", "Psikuta", 7, 5, BigDecimal.ZERO);
    public static final Pensioner pensioner2 = new Pensioner("B7", "Psikuta", 7, 5, BigDecimal.ZERO);

    public static void main(String[] args) {
        treeSetExample();
        listExample();

        hashMapExample();
        namesStatisticMaps();
        List<Person> personList = populatePeopleList();
        Map<String, Long> collect = personList.stream()
                .map(e -> e.getLastName())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));//elementy w strumieniu, po prostu użyć
        System.out.println(collect);

    }

    private static void namesStatisticMaps() {
        List<Person> personList = populatePeopleList();
        Map<String, Integer> lastNameMap = new HashMap<>();
        for (Person x : personList) {
            String surname;
            if (x.getLastName() == null) {
                surname = null;
            } else {
                surname = x.getLastName().trim();
            }                                                               //ctrl+alt+v  wyciągnięcie zmiennej !
            if (lastNameMap.containsKey(surname)) {
                int counter = lastNameMap.get(surname);
                lastNameMap.replace(surname, counter + 1);
            } else {
                lastNameMap.put(surname, 1);

            }

        }


        System.out.println(lastNameMap);
    }

    private static void hashMapExample() {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(student1.getIdentity(), student1);
        personMap.put(student2.getIdentity(), student2);
        personMap.put(worker1.getIdentity(), worker1);
        personMap.put(pensioner1.getIdentity(), pensioner1);
        personMap.put(pensioner2.getIdentity(), pensioner2);
        System.out.println(personMap);
    }

    private static void hashSetExample() {
        Set<Person> personSet = new HashSet<>();    // gdyby było LinkedHashSet to kolejność dodawania elementów będzie zachowana, w tym prazypadku kolejność ustatla hashcode
        System.out.println(personSet.add(student1));
        System.out.println(personSet.add(pensioner1));
        System.out.println(personSet.add(worker1));
        System.out.println(personSet.add(pensioner2));   // bo już jest, boolean sprawdza czy jest i stosuje contains, a przez to equals
        System.out.println(personSet.size());
    }

    private static void listExample() {
        List<Person> personsList = populatePeopleList();

        System.out.println(personsList.contains(worker1));
        personsList.remove(pensioner1);
        System.out.println(personsList.contains((pensioner1)));

        System.out.println(personsList);
    }

    private static List<Person> populatePeopleList() {
        List<Person> personsList = new ArrayList<>();
        personsList.add(student1);
        personsList.add(student2);
        personsList.add(worker1);
        personsList.add(pensioner1);
        personsList.add(pensioner2);
        return personsList;
    }

    private static void treeSetExample() {
        Set<Person> tSet = new TreeSet<>();      //dobra praktyka, nie pisać dokładnej implementacji tylko interface
        tSet.add(student2);
        tSet.add(student1);
        System.out.println(tSet);
        tSet.stream()
                .map(e -> e.getFirstName())
                .forEach(e -> System.out.println(e));
    }
}
