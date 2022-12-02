package practice.student;

import practice.student.Student;
import practice.student.StudentController;
import practice.student.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student student = retriveStudentFromDatabase();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student,view);

        controller.updateView();

        controller.setStudentName("John");

        System.out.println("Student after changes");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setRollNo("1");
        student.setName("Nikita");
        return student;
    }
}
