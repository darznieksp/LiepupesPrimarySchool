import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tools {

    public static void addThreeStudents(List<Student> studentList) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("First name: ");
            String firstName = sc.nextLine();
            System.out.print("Last name: ");
            String lastName = sc.nextLine();
            System.out.print("Class: ");
            int whichClass = sc.nextInt();
            sc.nextLine();
            studentList.add(new Student(i, firstName, lastName, whichClass));
            System.out.println();
        }
    }

    public static String serializeStudentList(List<Student> studentList) {

        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();
        String json = gson.toJson(studentList);

        return json;
    }

    public static List<Student> deserializeStudentList(String json) {

        Gson gson = new Gson();
        Type studentListType = new TypeToken<ArrayList<Student>>(){}.getType();
        ArrayList<Student> studentList = gson.fromJson(json, studentListType);

        return studentList;
    }

    public static void reverseStudentList(List<Student> studentList){

        Collections.reverse(studentList);
    }

    public static void displayStudentList(List<Student> studentList){

        for (Student student : studentList){
            System.out.println(student);
        }
        System.out.println();
    }

}
