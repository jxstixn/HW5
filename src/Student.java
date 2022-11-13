import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private Project project;
    private ArrayList<Exam> registeredExams;
    private ArrayList<Course> courses;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Project getProject(){
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void addExam(Exam e) {
        this.registeredExams.add(e);
    }

    public void enrollCourse(Course c){
        courses.add(c);
    }
}
