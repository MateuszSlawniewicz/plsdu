package day5;

public class OOP2 {


    public static void main(String[] args) {

        equalsExample();
        referencesExamples();
        staticFinal();
        Person person1 = new Person("Janusz", "Kowalski");
        System.out.println(person1.getIdentity());


    }

    private static void staticFinal() {
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1.getIdentity());
        System.out.println(person2.getIdentity());
        System.out.println(Person.counter);
        CalculatorUtils utils = new CalculatorUtils();
        System.out.println(utils.add(2, 5));
        System.out.println(CalculatorUtils.addition(2, 5));     // bo statyczne to możemy na klasie
        person1.setFirstName("Anna");
        ExperimentalObject eo = new ExperimentalObject(1, 2, person1);
        eo.setNotFinalImmutable(6);
        Person personFromEo = eo.getFinalMutable();
        personFromEo.setFirstName("Ola");                // dostajemy się do środka obiektu person
    }

    private static void referencesExamples() {
        String s1 = "napis";
        String s2 = "napis";
        String s3 = new String("napis");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Long firstNumber = 127L;
        Long secondNumber = 127L;
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber.equals(secondNumber));
        Long thirdNumber = 128L;
        Long fourthNUmber = 128L;
        System.out.println(fourthNUmber == thirdNumber);
        System.out.println(fourthNUmber.equals(thirdNumber));
    }

    private static void equalsExample() {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setFirstName("Anna");
        person2.setFirstName("Anna");
        person1.setSurname("Nowak");
        person2.setSurname("Nowak");
        person1.setIdentity(123);
        person1.setIdentity(123);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        Person person3 = new Person("Anna", "Nowak", 123);
        person3.setIdentity(111);


    }


}
