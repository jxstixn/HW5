import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;
    private ArrayList<Course> courses;

    Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void addCourse(Course c){
        this.courses.add(c);
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
