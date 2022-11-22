public class Student {

    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWhichClass() {
        return whichClass;
    }

    private int whichClass;

    public Student(int id, String firstName, String secondName, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = secondName;
        this.whichClass = grade;
    }

    @Override
    public String toString() {
        return id + " | " + firstName + " " + lastName +" | " + whichClass ;
    }
}
