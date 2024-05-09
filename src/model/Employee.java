package model;

public class Employee {
    private final int id;
    private String nameEmployee;
    private int ageEmployee;
    private Float currentSalary;
    private Float mensualSalaryEmployee;

    public Employee(int id ,String nameEmployee,int ageEmployee,Float currentSalary){
        this.id = id;
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.currentSalary = currentSalary;
        this.mensualSalaryEmployee = currentSalary;
    }

    public int getId(){
        return this.id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public Float getMensualSalaryEmployee() {
        return mensualSalaryEmployee;
    }

    public void setMensualSalaryEmployee(Float mensualSalaryEmployee) {
        this.mensualSalaryEmployee = mensualSalaryEmployee;
    }

    public Float getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Float currentSalary) {
        this.currentSalary = currentSalary;

    }

    public String printDataEmployee(){
        return "Nombre : " + this.nameEmployee
                +" "+
                "edad : " + this.ageEmployee
                +" "+
                "Salario mensual : " + this.mensualSalaryEmployee;
    }
}
