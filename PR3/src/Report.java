import java.util.ArrayList;

public class Report {
    public static void generateReport(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.printf("%-5s %10.2f%n", employee.getFullName(), employee.getSalary());
        }
    }
}
