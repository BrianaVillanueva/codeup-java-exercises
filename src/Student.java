import java.util.Date;

public class Student {
    static int numberOfStudents = 0; //static int happens at compile time, numberOfStudents happens at load time
    public String name; //you can add public to make it accessible to others. if you add private, you will not be able to and will get a "null" when you try to report
    String cohort;
    private Date startDate;
    String program;
    boolean drinksCoffee;
    String location;

    public static void main(String[] args) {
        Student daniel = new Student("Daniel");
//        daniel.name = "Daniel";
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web Development";
        daniel.location = "San Antonio";
        daniel.drinksCoffee = true;



        Student zach = new Student("Zach"); //passed to the constructor, zachs name instead of no parameters.
//        zach.name = "Zach";
        zach.cohort = "Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;




    daniel.report();
    zach.report();
    System.out.printf("There are now %d students.\n", numberOfStudents);

        System.out.println(daniel.report());
//        if(zach.drinksCoffee)
//        System.out.println(zach.name + "drinks coffee.");
    }



    public Student(String name) {   //created a constructor, second lesson. a way to create a new instance of this class.
        numberOfStudents ++;
        this.name = name;
//        this.startDate = new Date(); // this was for the example of trying to access these properties in another class
    }



    public String report() {
        String output = "";
        output += "My name is " + this.name + ". ";
        output += "I started learning " + this.program + " with " + this.cohort + "on" + this.startDate + ",";
        if (this.drinksCoffee)
            output += "I drink coffee in " + this.location + ".";
        else
            output += "I don't drink coffee in" + this.location + ".";
        return output;
    }
}
