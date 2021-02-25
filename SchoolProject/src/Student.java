//Student.java is the code of the student arraylist, which lists the current students enroled as well as their basic info.

public class Student {
    //FIELDS
    private String lastName;
    private String firstName;
    private int grade;
    private static int studentNumber = 2021001;
    private final int idNumber;

    //CONSTRUCTORS
    Student() {
        lastName = "Unknown";
        firstName = "Unknown";
        grade = 1;
        idNumber = studentNumber;
        studentNumber++;
    }

    Student(String surname, String givenName, int grade) {
        if (grade <= 0) {
            grade = 1;
        }
        this.lastName = surname;
        this.firstName = givenName;
        this.grade = grade;
        this.idNumber = studentNumber;
        studentNumber++;
    }

    // This is the method for when you want to print out a specific element in the student array.
    // Below sets that we print out Name: and Grade: when you print a student's name.
    public String toString() {
        String grade = String.valueOf(this.getGrade());
        String result = ("Name: " + this.getLastName() + ", " + this.getFirstName() + "\nGrade: " + grade);
        return result;
    }

    // GETTERS AND SETTERS
    //ID Numbers have no setters since it isn't supposed to be changed.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade<=0) { grade = 1; }
        this.grade = grade;
    }

    public int getIdNumber() { return idNumber; }

}
