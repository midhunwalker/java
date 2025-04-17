class Employee {
    private int employeeNo;
    private String employeeName;
    private double employeeSalary;

    public void setEmployeeNo(int empNo){
        employeeNo = empNo;
    }

    public void setEmployeeName(String empName){
        employeeName = empName;
    }

    public void setEmployeeSalary(double empSalary){
        employeeSalary = empSalary;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }
}

public class Employees {

    public static void main (String args[]) {
        Employee emp = new Employee();
        emp.setEmployeeNo(123);
        emp.setEmployeeName("John");
        emp.setEmployeeSalary(5000);
        System.out.println("Employee no: " + emp.getEmployeeNo());
        System.out.println("Employee name: " + emp.getEmployeeName());
        System.out.println("Employee salary: " + emp.getEmployeeSalary());
    }
}
