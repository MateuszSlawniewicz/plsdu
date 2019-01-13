package day6;

import java.math.BigDecimal;

public class Worker extends Person implements NameHolder {
    public Worker(String firstName, String lastName, Integer identity, Integer age, BigDecimal salary) {
        super(firstName, lastName, identity, age);      //wywoływanie konstruktora z nadklasy
        this.salary = salary;
    }

    public void introduceInner() {
        super.introduce();
        System.out.println("Oraz przy okazji pracownikiem");
    }


    @Override
    public BigDecimal showMeTheIncome() {
        return salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    private BigDecimal salary;


    @Override
    public String showMeYourName() {
        return getFirstName() + " " + super.getLastName();   // można ominąć super bo  nie ma innej metody getFirstName
    }
}
