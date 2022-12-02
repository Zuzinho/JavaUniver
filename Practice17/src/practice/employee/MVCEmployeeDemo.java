package practice.employee;

public class MVCEmployeeDemo {
    public static void main(String[] args) {
        Employee employee = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(employee,view);

        controller.updateView();

        controller.setEmployeeName("Artur");

        System.out.println("Employee after changes");
        controller.updateView();
    }

    public static Employee retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Nikita");
        employee.setSalary(50000);
        return employee;
    }
}
