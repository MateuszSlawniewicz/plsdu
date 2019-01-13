package day5;

public class OOP2 {


    public static void main(String[] args) {

        equalsExample();
        referencesExamples();
        staticFinal();
        TestPerson testPerson1 = new TestPerson("Janusz", "Kowalski");
        System.out.println(testPerson1.getIdentity());


    }

    private static void staticFinal() {
        TestPerson testPerson1 = new TestPerson();
        TestPerson testPerson2 = new TestPerson();
        System.out.println(testPerson1.getIdentity());
        System.out.println(testPerson2.getIdentity());
        System.out.println(TestPerson.counter);
        CalculatorUtils utils = new CalculatorUtils();
        System.out.println(utils.add(2, 5));
        System.out.println(CalculatorUtils.addition(2, 5));     // bo statyczne to możemy na klasie
        testPerson1.setFirstName("Anna");
        ExperimentalObject eo = new ExperimentalObject(1, 2, testPerson1);
        eo.setNotFinalImmutable(6);
        TestPerson testPersonFromEo = eo.getFinalMutable();
        testPersonFromEo.setFirstName("Ola");                // dostajemy się do środka obiektu person
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
        TestPerson testPerson1 = new TestPerson();
        TestPerson testPerson2 = new TestPerson();
        testPerson1.setFirstName("Anna");
        testPerson2.setFirstName("Anna");
        testPerson1.setSurname("Nowak");
        testPerson2.setSurname("Nowak");
        testPerson1.setIdentity(123);
        testPerson1.setIdentity(123);
        System.out.println(testPerson1 == testPerson2);
        System.out.println(testPerson1.equals(testPerson2));
        TestPerson testPerson3 = new TestPerson("Anna", "Nowak", 123);
        testPerson3.setIdentity(111);


    }


}
