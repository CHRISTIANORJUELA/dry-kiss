package services;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AdminImplementation {

    private final List<Employee> employees = new ArrayList<>();

    public void showAllEmployees(){
        employees.forEach(employee -> System.out.println(employee.printDataEmployee()));
    }

    public void createEmployee(int id,String nameEmployee,int ageEmployee,Float salaryEmployee){
      employees.add(new Employee(id,nameEmployee,ageEmployee,salaryEmployee));
    }


    public void showSalaryAllEmployees(){
        Float totalSalaryEmployees = employees
                .stream()
                .map(Employee::getMensualSalaryEmployee)
                .reduce((partA,partB)-> partA+partB)
                .orElseThrow();
        System.out.println("El salario de todos los empleados es igual a : "+totalSalaryEmployees);
    }

    public Employee getEmployeeById(int id){
        return employees
                .stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("El id "+id+" no existe en la base de datos"));

    }

}
