package practice;

import java.util.Formatter;

public class Employee {
    private String fullName;
    private Double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        String salaryString = String.format("%.2f",salary);
        formatter.format("Employee`s name: %1$s;\nEmployee`s salary: %2$10s",fullName,salaryString);
        return formatter.toString();
    }
}