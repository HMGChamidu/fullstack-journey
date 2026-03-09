import java.util.ArrayList;
public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added.");
    }

    public void showStudents(){
        if(students.isEmpty()){
            System.out.println("No students available.");
            return;
        }
        for(Student s:students){
            s.display();
        }
    }
    public void removeStudent(int id){
        for(Student s : students){
            if(s.getId() == id){
                students.remove(s);
                System.out.println("Student removed.");
                return;
            }


        }
        System.out.println("Student not found.");
    }
}

