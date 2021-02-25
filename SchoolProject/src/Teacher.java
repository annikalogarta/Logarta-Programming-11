//Teacher.java is the arraylist which holds a list of teachers in the school, as well as basic information.

public class Teacher {
    //FIELDS
    private String firstName;
    private String lastName;
    private String subject;

    //CONSTRUCTORS
    Teacher() {
        lastName = "Unknown";
        firstName = "Unknown";
        subject = "Unknown";
    }
    Teacher(String surname, String givenName, String subjectArea) {
        this.lastName = surname;
        this.firstName = givenName;
        this.subject = subjectArea;
    }

    //METHODS
    // Here it sets that we print out the teacher's name and subject when you want to print out the teacher.
    public String toString() {
        return ("Name: " + this.lastName + ", " + this.firstName + "\nSubject: " + this.subject);
    }



    //GETTERS AND SETTERS
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
