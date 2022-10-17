import java.util.ArrayList;
public class GererateReport {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setFullName("Curious Mark");
        e1.setSalary(25000);
        Employee e2 = new Employee();
        e2.setFullName("Ken Shirrif");
        e2.setSalary(30000);
        employees.add(e1);
        employees.add(e2);
        Report.generateReport(employees);
    }
}
