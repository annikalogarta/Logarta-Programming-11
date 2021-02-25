
public class Main {
    public static void main(String[] args) {
        //Below are the int variables as the number of teachers/students we'll be adding to the list.
        int addStudentsNum = 10;
        int addTeachersNum = 3;

        //This is the for loops to add the 10 students and 3 teachers.
        for(int x=0; x<addStudentsNum; x++) {
            School.addStudent("Logarta","Annika", 10);
        }
        for(int x=0; x<addTeachersNum; x++) {
            School.addTeacher("Logarta", "Annika", "Computer Programming");
        }

        //Display both lists.
        System.out.println(School.showAllStudents());
        System.out.println(School.showAllTeachers());

        //int for how many students/teachers to be removed
        int removeStudentsNum = 2;
        int removeTeachNum = 1;

        //The for loop below is to remove two random students and one random teacher from the list.
        for (int y=0; y<removeStudentsNum; y++) {
            School.deleteStudent((int)(Math.random()*(addStudentsNum-y)));
        }
        for (int y=0; y<removeTeachNum; y++) {
            School.deleteTeacher((int)(Math.random()*addTeachersNum));
        }

        //display new lists
        System.out.println(School.showAllStudents());
        System.out.println(School.showAllTeachers());

    }
}
