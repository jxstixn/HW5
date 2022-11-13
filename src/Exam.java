import java.util.ArrayList;

public class Exam {
    private ArrayList<TA> tas;
    private int maxValue;
    private ArrayList<Student> registeredStudents;
    private ArrayList<Question> questions;

    public Exam(Question q, TA ta){
        questions.add(q);
        tas.add(ta);
    }

    public boolean register(Student student){
        student.addExam(this);
        return true;
    }

    public void addQuestion(int id, String task, int value){
        Question q = new Question(id, task, value);
        questions.add(q);
    }

    public ArrayList<Student> getRegisteredStudents(){
        return this.registeredStudents;
    }

    public void setMaxValue(int max){
        this.maxValue = max;
    }
}
