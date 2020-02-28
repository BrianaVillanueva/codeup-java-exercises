////INITAL CLASS//
//public class Person {
//    private String name; //Create a private name property that is a string//
//
//private Person(){}
//    // THIS IS THE CONSTRUCTOR//
//    public Person(String name){
//        this.setName(name);//set the persons name to the passed string//
//    }
//    @Override
//    public String toString(){
//    return name;
//    }
//
//    //RETURNS THE PERSON'S NAME METHOD//
//    public String getName(){
//        return this.name;
//    }
//    //CHANGES THE NAME PROPERTY TO THE PASSED VALUE METHOD//
//    public void setName(String name){
//        this.name = name; //passed value method//
//    }
//    //PRINTS A MESSAGE TO THE CONSOLE USING THE PERSON'S NAME METHOD//
//    public void sayHello(){
//        System.out.printf("Hello, my name is %s\n", this.name); //prints to console//
//    }
//
//    //THIS IS THE MAIN METHOD//
//    public static void main(String[] args) {
//        Person a = new Person("Elmo");//to create a new person passed to constructor//
//        a.sayHello();//tests the above methods//
//
//
//        //----2.)UNDERSTANDING REFERENCES----//
//        //do not need to focus on these, just for reference//
//        /*The following code blocks make use of the Person class
//        from the previous exercise. comment/comment out each block to see output*/
//
//
//        //WILL COME BACK TRUE AND FALSE, THEY ARE//
////        Person person1 = new Person("John");
////        Person person2 = new Person("John");
////        System.out.println(person1.getName().equals(person2.getName()));
////        System.out.println(person1 == person2);
//
//
//        //WILL COME BACK TRUE, THEY ARE EQUAL//
////        Person person1 = new Person("John");
////        Person person2 = person1;
////        System.out.println(person1 == person2);
//
//
//
//        //WILL COME BACK, THEY ARE//
////        Person person1 = new Person("John"); //only created one new person, have 2 variables pointing at that object//
////        Person person2 = person1;
////        System.out.println(person1.getName());
////        System.out.println(person2.getName());
////        person2.setName("Jane");
////        System.out.println(person1.getName());
////        System.out.println(person2.getName());
//
//    }
//
//}


