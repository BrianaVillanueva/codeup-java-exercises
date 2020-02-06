import java.util.Arrays;

//-----------------ARRAYS EXERCISE----------------//


//public class ArraysExercises {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers)); //The Arrays.toString is necessary to print the array correctly instead of the string address location//
//    }
//}


/*
Now create an array that holds 3 person objects.
Assign a new instance of the Person class to each element.
Iterate through the array and print out the name of each person
in the array.
 */

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] persons = new Person[3]; //creating the actual object
        Person aPerson = new Person("bill");  //instance, you use "Person" here to initially declare the object but dont need it for the following
        persons[0] = aPerson;
        aPerson = new Person("bob");
        persons[1] = aPerson;
        aPerson = new Person("Ben");
        persons[2] = aPerson;

        for (Person person : persons) {  //for(object, instance, index)
            System.out.println(person);
        }

        aPerson = new Person("Bro"); //creating a new person
        Person[] people = addPerson(persons, aPerson);
        for (Person person : people) {
            System.out.println(person);
        }

    }
    public static Person[] addPerson(Person[] persons, Person newPerson) { //method for adding the new person
        Person[] persons2 = Arrays.copyOf(persons, persons.length + 1); //take copy of original array and adding one
        persons2[persons.length] = newPerson;
        return persons2;
    }

}


/*
create a static method named addPerson that accepts
an array of person objects, as well as a single person object
to add to the passed array. It should return an array whose
length is 1 greater than the passed array, with the passed
person object at the end of the array.
 */
