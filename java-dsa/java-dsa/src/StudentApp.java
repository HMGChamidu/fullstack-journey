public class StudentApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Student s1 = new Student(1, "Chamidu", 22);
        Student s2 = new Student(2, "Kasun", 23);
        Student s3 = new Student(3, "Nimal", 21);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        System.out.println("All Students:");
        manager.showStudents();

        manager.removeStudent(2);

        System.out.println("After Removing:");
        manager.showStudents();
    }
}
