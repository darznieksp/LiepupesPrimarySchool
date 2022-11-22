import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Add three students to list
        Tools.addThreeStudents(studentList);

        //Convert list to JSON
        String json = Tools.serializeStudentList(studentList);
        System.out.println(json);
        //Convert JSON to list
        studentList = Tools.deserializeStudentList(json);

        //Display student list before reverse
        System.out.println("Before reverse:");
        Tools.displayStudentList(studentList);

        //Reverse student list
        Tools.reverseStudentList(studentList);

        //Display student list after reverse
        System.out.println("After reverse:");
        Tools.displayStudentList(studentList);

    }
}
