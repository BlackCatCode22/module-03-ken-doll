package mystudent;

public class App {
    public static void main(String[] args) {
        System.out.println("\nHello from class App\n");

        // Create a student object
        Student myStudent = new Student();

        // Fill the new myStudent object's data fields
        myStudent.firstName = "Kendall";
        myStudent.lastname = "Reagan";
        myStudent.gpa = 3.0;
        myStudent.major = "Mechanical Engineering";
        myStudent.city = "Clovis";

        System.out.println("\nThe first name of the student is: " + myStudent.firstName + "\n");
        System.out.println("\nThe last name of the student is: " + myStudent.lastname + "\n");

    }
}
