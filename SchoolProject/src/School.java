import java.util.ArrayList;

// School.java contains all the arraylists as well as its own properties/fields (such as its name and mascot).
// It also has multiple methods for certain ways to manipulate the arraylists, such as adding/removing elements.

public class School {

    //FIELDS
    //The school fields/characteristics.
    private String schoolName;
    private String mascot;
    private String schoolColour;

    // GETTERS AND SETTERS
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getSchoolColour() {
        return schoolColour;
    }

    public void setSchoolColour(String schoolColour) {
        this.schoolColour = schoolColour;
    }

    // CONSTRUCTORS
    School() {
        schoolName = "Unknown";
        mascot = "None";
        schoolColour = "None";
    }

    School(String schoolName, String mascot, String schoolColour) {
        this.schoolName = schoolName;
        this.mascot = mascot;
        this.schoolColour = schoolColour;
    }

    //ARRAYLISTS
    //This is where we create the arraylist.
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();


    //METHODS
    //These two methods are the methods used to add a student or a teacher to their respective arraylists.

    public static void addStudent(String surname, String firstName, int grade) {
        if (surname.isEmpty()) {
            students.add(new Student());
        } else {
            students.add(new Student(surname, firstName, grade));
        }
    }

    public static void addTeacher(String surname, String firstName, String subject) {
        if (surname.isEmpty()) {
            students.add(new Student());
        } else {
            teachers.add(new Teacher(surname, firstName, subject));
        }
    }

    /*
    The next two methods are for removing elements from the student/teacher arraylists.
    Here I just remove elements through index positions. You can see that subtracted 1 from what the input is -
    I did because often lists start counting at 1 instead of 0, this is more for people who aren't tech smart.
     */
    public static void deleteStudent(int i) {
        if (i<=0) {
            i = 1;
        }
        students.remove(i-1);
    }

    public static void deleteTeacher(int i) {
        if (i<=0) {
            i = 1;
        }
        teachers.remove(i-1);
    }

    /*
    The next two methods are for displaying the whole arraylist. For this one, I made one big gigantic string,
    and input all the things I needed for
     */
    public static String showAllStudents() {
        String result = "STUDENTS\n";
        for (int x=0; x<students.size(); x++){
                String grade = String.valueOf(students.get(x).getGrade());
            result += ("Name: " + students.get(x).getLastName() + ", " + students.get(x).getFirstName() + "\nGrade: " + grade + "\n");
        }
        return result;
    }

    public static String showAllTeachers() {
        String result = "TEACHERS\n";
        for (int x=0; x<teachers.size(); x++) {
            result += ("Name: " + teachers.get(x).getLastName() + ", " + teachers.get(x).getFirstName() + "\nSubject: " + teachers.get(x).getSubject() + "\n");
        }
        return result;
    }
}
