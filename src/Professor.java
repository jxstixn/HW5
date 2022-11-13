import java.util.ArrayList;

public class Professor extends Employee{
    private ArrayList<Course> courses;

    Professor(String name, int employeeId, Department department) {
        super(name, employeeId, department);
    }

    public void publicCourse(){
    }

    public void assignTA(Course c, TA ta){
        ta.addCourse(c);
    }

    public void addCourse(Course c){
        this.courses.add(c);
    }
}
