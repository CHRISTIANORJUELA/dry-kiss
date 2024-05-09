package services;
import java.util.List;
import java.util.Optional;

public class EmployeeImplementation {

    private final AdminImplementation adminImplementation;

    public EmployeeImplementation(AdminImplementation adminImplementation){
        this.adminImplementation = adminImplementation;
    }

    public void setTotalSalaryEmployee(int id,List<Float> bonificationsAndDeduction){
        Float totalCalculated = getSumBonificationDeduction(bonificationsAndDeduction);
        Optional.of(adminImplementation
            .getEmployeeById(id)
        ).filter(employee -> employee.getCurrentSalary()>= totalCalculated)
                .ifPresentOrElse((employee)-> employee.setMensualSalaryEmployee(employee.getMensualSalaryEmployee()+totalCalculated), this::launchException);

    }

    private void launchException() {
        throw new IllegalArgumentException("El total de activos y pasivos es mayor que el salario");
    }

    public Float getSumBonificationDeduction(List<Float> bonificationsAndDeduction){
        return  bonificationsAndDeduction
                .stream()
                .reduce((partA,partB)-> partA+partB)
                .orElseThrow();
    }
}
