import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors = new ArrayList<Professor>(2);
    private ArrayList<Project> projects;
    private ArrayList<TA> tas;
    private Department department;

    public Course(int id, String name, int cap, Professor prof, Department department) {
        this.id = id;
        this.name = name;
        this.maxCapacity = cap;
        this.professors.add(prof);
        this.department = department;
        prof.addCourse(this);
        department.addCourse(this);
    }

    public void enroll(Student student) {
        student.enrollCourse(this);
        students.add(student);
    }

    public void apply(TA ta) {
    }

    public void setMaxCap(int max) {
        this.maxCapacity = max;
    }

    public ArrayList<Professor> getProf() {
        return this.professors;
    }

    public ArrayList<TA> getTA() {
        return this.tas;
    }

    public void setTA(TA ta) {
        this.tas.add(ta);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProject(Project p){
        projects.add(p);
    }
}
