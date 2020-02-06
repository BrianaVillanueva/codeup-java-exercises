package grades;
import java.util.ArrayList;


public class Student { //rendering information in this constructor//
    private String name; //these 2 lines you're setting your properties(everything you need to begin)//
    private ArrayList<Integer> grades;

    public Student(String name) {//constructor (makes space you need work)//(type name of param)

        this.name = name; //these lines you're saying what your properties are//
        this.grades = new ArrayList<>();//you'e creating an instance of anew array list//

    }

    // returns the student's name
    public String name(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades (loop)
    public double getGradeAverage(){
        double total = 0; //your bucket starting at 0//
        for (Integer grade: grades){
            total += grade; //increment (grabbing total grades)//
        }

        return total/grades.size(); //the total divided by the "length/size" of grades//
    }

    public String getName(){ //using "getters" to get info from a private property(bypass security)(can use on public too)//
        return this.name;
    }


    public static void main(String[] args) {//test your student class by adding a main method and creating Student objects//

        Student student = new Student("Briana"); //creating your instance of the student, a particular student now building a car//
        student.addGrade(100); //adding this grade to the student//
        student.addGrade(90);
        student.addGrade(80);
        System.out.println(student.getGradeAverage());//tests if it works and gives average of this student//

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
    }

}