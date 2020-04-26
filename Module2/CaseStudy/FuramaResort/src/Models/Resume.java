package Models;

import Controllers.MainController;

import java.util.Stack;

public class Resume {
    public Resume() {
    }

    public static Stack<Employee> getAllEmployees() {
        Stack<Employee> stackEmployees = new Stack<Employee>();
        MainController.EmployeeCsvReader.readAllRecords();
        for (Employee employee : MainController.EmployeeCsvReader.listEmployees) {
            stackEmployees.push(employee);
        }
        return stackEmployees;
    }
}
