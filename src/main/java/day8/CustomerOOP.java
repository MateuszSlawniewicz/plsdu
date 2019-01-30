package day8;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerOOP {
    public static void main(String[] args) {

    }

    private Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333),
    };

    public List<Customer> fromArrayToList() {
        return Arrays.stream(people)
                .collect(Collectors.toList());
    }

    public List<String> listWithNames() {
        return Arrays.stream(people)
                .map(e -> e.getName().trim() + " " + e.getLastName().trim())
                .collect(Collectors.toList());
    }

    public Map<Integer, Customer> mapWithId() {
        return Arrays.stream(people)
                .collect(Collectors.toMap(x -> x.getId(), x -> x));
    }

    public Map<BigDecimal, List<String>> mapWithSalary() {
        Map<BigDecimal, List<String>> salaryMap = new HashMap<>();
        for (Customer customer : people) {
            if (salaryMap.containsKey(customer.getSalary())) {
                List<String> innerList = salaryMap.get(customer.getSalary());
                innerList.add((customer.getName().trim() + " " + customer.getLastName().trim() + " " + customer.getId()));
                salaryMap.replace(customer.getSalary(), salaryMap.get(customer.getSalary()), innerList);
            } else {
                List<String> innerList = new ArrayList<>();
                innerList.add(customer.getName().trim() + " " + customer.getLastName().trim() + " " + customer.getId());
                salaryMap.put(customer.getSalary(), innerList);
            }
        }
        return salaryMap;
    }



}
