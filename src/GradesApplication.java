import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Student student = new Student("Briana");
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);

        Student student1 = new Student("Nicole");
        student.addGrade(80);
        student.addGrade(70);
        student.addGrade(60);

        Student student2 = new Student("Lauren");
        student.addGrade(60);
        student.addGrade(50);
        student.addGrade(40);

        Student student3 = new Student("Ashley");
        student.addGrade(40);
        student.addGrade(30);
        student.addGrade(20);

        //----HASH MAP---\\
        HashMap<String, String> students = new HashMap<>();//create a HashMap named students<key, value>//
        students.put("Briana", "briana07");//create keys that are strings that represent username's & values that are student objects//
        students.put("Nicole", "nicole08");
        students.put("Lauren", "lauren09");
        students.put("Ashley", "lauren10");
        System.out.println(students);
    }
}
