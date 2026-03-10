import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(true){

            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. Show students");
            System.out.println("3. Remove student");
            System.out.println("4. Exit");

            System.out.println("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Student ID");
                    int id = scanner.nextInt();

                    System.out.println("Enter Student Name");
                    String name = scanner.next();

                    System.out.println("Enter Age: ");
                    int age = scanner.nextInt();

                    Student student = new Student(id, name, age);
                    manager. addStudent(student);
                    break;

                case 2:
                    manager.showStudents();
                    break;

                    case 3:
                        System.out.println("Enter ID to Remove: ");
                        int removeID = scanner.nextInt();
                        manager.removeStudent(removeID);
                        break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                    default:
                        System.out.println("Invalid choice");



            }
        }
    }
}
