package grades;
// this is using the input method that is used in my Input.java
import util.Input;



import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        // This is the Hashmap for the students name, grades, and github id.
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        students.put("bill3838", new Student("Billy"));
        students.get("bill3838").addGrade(100);
        students.get("bill3838").addGrade(90);
        students.get("bill3838").addGrade(93);

        students.put("angie1234", new Student("Angie"));
        students.get("angie1234").addGrade(88);
        students.get("angie1234").addGrade(91);
        students.get("angie1234").addGrade(97);

        students.put("neil2111", new Student("Neil"));
        students.get("neil2111").addGrade(65);
        students.get("neil2111").addGrade(70);
        students.get("neil2111").addGrade(94);

        students.put("WillWallace3827", new Student("William"));
        students.get("WillWallace3827").addGrade(89);
        students.get("WillWallace3827").addGrade(96);
        students.get("WillWallace3827").addGrade(100);

        // These are showing the information to the user
        System.out.println("Welcome!");
        System.out.println("These are our students usernames: ");
        // created the string keepGoing to use in the if statements
        String keepGoing;
        // The do while allows the user to continue to look at another student once they have already looked at one

        do {
        for (String userName : students.keySet()) {
            System.out.println("Usernames  " + userName);
        }
            String userInput = input.getString("Enter a username: ");
            if (students.containsKey(userInput)) {
                // .get returns the value associated with students
                System.out.println("Studen's Name: " + students.get(userInput).getName());
                System.out.println("Student's GPA is " + students.get(userInput).getGradeAverage());
            } else {
                // This prompts when the user inputs an invalid name
                System.out.println("That is not a current student");
            }
                //keepGoing brings the prompt to continue by typing the letter y or yes
            keepGoing = input.getString("Would you like to continue? ");
        } while (keepGoing.equalsIgnoreCase("y")
                || (keepGoing.equalsIgnoreCase("yes")));
                System.out.println("Goodbye !");

        for (Student value : students.values()){
        System.out.println(students);
    }

    }

}
