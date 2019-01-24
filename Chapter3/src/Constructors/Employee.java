package Constructors;

public class Employee {
    double empSalary;
    int empNum = 0;

    public Employee() {
        empSalary = 10.00;
    }

    public Employee(double salary) {
        empSalary = salary;
    }

    public void setEmpNum(int emp) {
        empNum = emp;
    }

    public int getEmpNum() {
        return empNum;
    }
}
