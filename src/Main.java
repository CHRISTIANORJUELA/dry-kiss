import services.AdminImplementation;
import services.EmployeeImplementation;
import java.util.Arrays;

public class Main {
    private static final AdminImplementation adminImplementation = new AdminImplementation();
    private static final EmployeeImplementation employeeImplementation = new EmployeeImplementation(adminImplementation);
    public static void main(String[] args) {
        adminImplementation.createEmployee(1,"Camilo",24,3500000F);
        adminImplementation.createEmployee(2,"Pedro",30,2000000F);
        adminImplementation.createEmployee(3,"Pablo",28,4000000F);

        adminImplementation.showAllEmployees();
        adminImplementation.showSalaryAllEmployees();


        int idToSearch = 3;
        employeeImplementation.setTotalSalaryEmployee(idToSearch,Arrays.asList(80000F,-40000F,-50000F,100000F));
        String dataEmployee = adminImplementation.getEmployeeById(idToSearch)
                .printDataEmployee();
        System.out.println(dataEmployee);
    }
}