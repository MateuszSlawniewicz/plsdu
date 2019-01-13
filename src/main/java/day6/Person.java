package day6;

import java.math.BigDecimal;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Integer identity;
    private Integer age;      //Integer w domyśle to null, int to 0, lepszy jest null

    public Person(String firstName, String lastName, Integer identity, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identity = identity;
        this.age = age;
    }

    public abstract BigDecimal showMeTheIncome();

    protected void introduce() {
        System.out.println("Jestem człowiekiem");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
