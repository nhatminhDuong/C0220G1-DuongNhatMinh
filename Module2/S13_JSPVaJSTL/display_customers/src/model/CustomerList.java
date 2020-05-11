package model;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public static List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Tom Cat", "12/12/1999", "House",
                "images/tom.png"));
        customerList.add(new Customer("Jerry Mouse", "01/01/2000", "Hole Wall",
                "images/jerry.png"));
        customerList.add(new Customer("Conan Edogawa", "04/05/1997", "Japan",
                "images/conan.jpg"));
        customerList.add(new Customer("Doraemon Dora", "03/09/2112", "Future World",
                "images/doraemon.jpg"));

        return customerList;
    }
}
