import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToolsTest {

    @Test
    void serializeStudentListTest() {
        List<Student> studentList = Arrays.asList(
                new Student(0, "Beatrise", "Celmina", 8),
                new Student(1, "Signe", "Ozola", 3)
        );

        String result = Tools.serializeStudentList(studentList);
        String expected = "[{\"id\":0,\"firstName\":\"Beatrise\",\"lastName\":\"Celmina\",\"whichClass\":8}," +
                           "{\"id\":1,\"firstName\":\"Signe\",\"lastName\":\"Ozola\",\"whichClass\":3}]";

        assertEquals(expected, result);

    }

    @Test
    void deserializeStudentListTest() {
        String testJson = "[{\"id\":0,\"firstName\":\"Beatrise\",\"lastName\":\"Celmina\",\"whichClass\":8}," +
                           "{\"id\":1,\"firstName\":\"Signe\",\"lastName\":\"Ozola\",\"whichClass\":3}]";

        List<Student> result = Tools.deserializeStudentList(testJson);

        List<Student> expected = new ArrayList<>();
        expected.add(new Student(0, "Beatrise", "Celmina", 8));
        expected.add(new Student(1, "Signe", "Ozola", 3));


        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).getId(), result.get(i).getId());
            assertEquals(expected.get(i).getFirstName(), result.get(i).getFirstName());
            assertEquals(expected.get(i).getLastName(), result.get(i).getLastName());
            assertEquals(expected.get(i).getWhichClass(), result.get(i).getWhichClass());
        }
    }
}