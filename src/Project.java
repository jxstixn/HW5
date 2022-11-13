import java.util.ArrayList;

public class Project {
    private String name;
    private ArrayList<Student> members;
    private Course course;

    public Project(Course c){
        this.course = c;
        c.addProject(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(Student student){
        student.setProject(this);
        members.add(student);
    }

    public ArrayList<Student> getMembers(){
        return this.members;
    }
}

