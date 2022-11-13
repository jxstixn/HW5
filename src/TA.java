import java.util.ArrayList;

public class TA {
    private String name;
    private ArrayList<Course> course;
    private ArrayList<Exam> exams;

    public TA(Course course){
        this.course.add(course);
        course.setTA(this);
    }

    public ArrayList<Course> getCourse(){
        return this.course;
    }

    public void extendContract(Course course){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(Course c){
        course.add(c);
        c.setTA(this);
    }
}
