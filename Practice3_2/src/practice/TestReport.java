package practice;

import java.util.ArrayList;

public class TestReport {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<Employee>() {{
            add(new Employee("Nick",50000));
            add(new Employee("John",42500.9));
            add(new Employee("Ricky",70900.99));
        }};
        Report.generateReport(arrayList);
    }
}
