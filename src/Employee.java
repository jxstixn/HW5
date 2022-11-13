public class Employee {
    private String name;
    private int employeeId;
    private Department department;

    Employee(String name, int employeeId, Department department){
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        department.addEmployee(this);
    }
}
