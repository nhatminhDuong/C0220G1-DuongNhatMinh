package Libs;

import Models.Customer;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getFullName().compareTo(customer2.getFullName());
    }
}
