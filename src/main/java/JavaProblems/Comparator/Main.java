package JavaProblems.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 29, "Aman", new Address("Street1", 456));
        Employee e2 = new Employee(1, 45, "Dani", new Address("Street2", 344));
        Employee e3 = new Employee(1, 19, "Edi", new Address("Street3", 12));
        Employee e4 = new Employee(1, 50, "Vadim", new Address("Street4", 567));

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        System.out.println("Unsorted List :" + empList);

        // sort based on age comparison
        Collections.sort(empList, new AgeComparator());
        System.out.println("Sorted based on age: " +empList);
        System.out.println("***********");

        // sort based on name comparison
        Collections.sort(empList, new NameComparator());
        System.out.println("Sorted based on Name: " +empList);
        System.out.println("***********");

        // sort based on address comparison
        Collections.sort(empList, new AddressComparator());
        System.out.println("Sorted based on address: " +empList);
        System.out.println("***********");


    }
}
