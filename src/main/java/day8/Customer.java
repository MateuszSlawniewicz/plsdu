package day8;

import java.math.BigDecimal;
import java.util.Objects;

public class Customer {
    private Integer id;
    private final String name;
    private final String lastName;
    private final Integer age;
    private final BigDecimal salary;
    private static Integer counter = 0;

    {
        counter++;
    }


    public Customer(String name, String lastName, Integer age, int salary) {
        this.id = counter;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);

    }

    public Customer(String name, String lastName, Integer age, String salary) {

//        this.name = name;
//        this.lastName = lastName;
//        this.age = age;
//        this.salary = BigDecimal.valueOf(Integer.valueOf(salary));
        this(name, lastName, age, Integer.valueOf(salary));


    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }


    public Integer getAge() {
        return age;
    }


    public BigDecimal getSalary() {
        return salary;
    }


}
