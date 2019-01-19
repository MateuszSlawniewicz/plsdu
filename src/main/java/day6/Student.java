package day6;

import java.math.BigDecimal;

public class Student extends Person implements NameHolder{
    private Integer index;
    private BigDecimal scholarship;

    public Student(String firstName, String lastName, Integer identity, Integer age, Integer index, BigDecimal scholarship) {
        super(firstName, lastName, identity, age);
        this.index = index;
        this.scholarship = scholarship;
    }

    public void introduceInner() {
        super.introduce();
        System.out.println("Oraz przy okazji studentem");
    }

    @Override
    public BigDecimal showMeTheIncome() {
        return scholarship;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public BigDecimal getScholarship() {
        return scholarship;
    }

    public void setScholarship(BigDecimal scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String showMeYourName() {
        return getFirstName() + " " +super.getLastName();   // można ominąć super bo  nie ma innej metody getFirstName

    }

    @Override
    public String toString() {
        return "Student{" +
                "index=" + index +
                ", scholarship=" + scholarship +
                "} " + super.toString();
    }




}