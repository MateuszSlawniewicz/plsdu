package day5;


import java.util.Objects;

public class Person {


    public static final int HEADS_QUANTITY = 1;

    private String firstName;
    private String surname;
    private int identity;              //lepiej Int bo typy obiektowe dają nulla, a to lepiej niż zero
    static Integer counter = 0;

    {
        this.identity = ++counter;           //blok inicjalizujący, uruchamia się za każdym użyciem
    }


    public Person() {
        this.identity = ++counter;

    }

    public Person(String firstName, String surname, int identity) {
        this.firstName = firstName;
        this.surname = surname;
        this.identity = identity;
    }                                             // wywalamy settery żeby było immutable!

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return identity == person.identity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }
}
