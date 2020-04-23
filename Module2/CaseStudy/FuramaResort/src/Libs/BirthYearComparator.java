package Libs;

import Models.Customer;

import java.util.Comparator;

public class BirthYearComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        int birthYear1 = Integer.parseInt(customer1.getDateOfBirth().substring(6));
        int birthYear2 = Integer.parseInt(customer2.getDateOfBirth().substring(6));

        return Integer.compare(birthYear1, birthYear2);
    }
}
