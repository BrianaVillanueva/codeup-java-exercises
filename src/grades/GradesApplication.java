package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //add a scanner to be able to eventually pull usernames during console prompt//

        Student student = new Student("Briana");
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);

        Student student1 = new Student("Nicole");
        student1.addGrade(80);
        student1.addGrade(70);
        student1.addGrade(60);

        Student student2 = new Student("Lauren");
        student2.addGrade(60);
        student2.addGrade(50);
        student2.addGrade(40);

        Student student3 = new Student("Ashley");
        student3.addGrade(40);
        student3.addGrade(30);
        student3.addGrade(20);

        //----HASH MAP---\\
        HashMap<String, Student> students = new HashMap<>();//create a HashMap named students<key, value>//
        students.put("briana07",student);//create data keys that are strings that represent username's & values that are student objects//
        students.put("nicole08", student1);
        students.put("lauren09", student2);
        students.put("ashley10", student3);

//        System.out.println(students);

        System.out.println("Welcome!" + "\n" + "Here are the Github usernames of our students: ");
        students.forEach((key, value) -> System.out.println((key)));//for each(loop) student I want the key/value. Then only print the key.(this is the protocol only for hashmaps)//


        String userInput = ""; //create this as an empty string for the input to go to//
        int userContinue = 1; //made this a true or false statement by using, "enter 1 for___ or enter 2 for___//
do {


    do { //create your choice of loop//
        if (userInput != "") {
            System.out.println("No users with that username were found.");
        }
        System.out.println("Which student would you like to see more information on?");
        userInput = scanner.next();

    } while (!students.containsKey(userInput));//while the user input does not contain the correct key, loop//
    System.out.println(students.get(userInput).name()+ "\n" + students.get(userInput).getGradeAverage());

    System.out.println("Do you want to continue?\n Type 1:Yes. or 2:No");
    userContinue = scanner.nextInt();

    userInput = "";//reset the value of the user input to empty(clean slate)//

}while (userContinue == 1);//if it equals 1 you continue loop

    }
}
