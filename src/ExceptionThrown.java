//linked with input.java//


//-----Example of the concept------//

//public class ExceptionThrown{
//    public static void main(String[] args){
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }
//    }
//}
//----the output from above will be Let's see... Math still works!----//


//
//public class ExceptionThrown {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
//        int x;
//
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!");
//        } finally {
//            System.out.println("This will always run.");
//        }
//    }
//}
//---the out put from above will be---//
/* Caught an array index exception!
This will always run.*/
//---only the most specific catch block was invoked---//


//-----Example One----//

//public class ExceptionThrown {
//    public static void main(String[] args){
//      // String str;
//       // System.out.println(str);
//    }
//
//
//    try {//errors are fatal and exceptions are warnings
//        String str = null;
//        System.out.println(str.length);
//    } catch (NullPointerException e) {
//        System.out.println("I am catching Nullpointer Exception");
//        //handle the error
//    }
//}

//A try-catch block is a code block just like a body of an if statement, or the body of a while loop is. Because of the way block scope works in Java, variables declared inside a try or catch block only exist in that block.
//If you need to do assignment inside of a try-catch, declare the variables outside of the block, and assign to them inside the block.



//----Example Two----//

//public class ExceptionThrown{
//    public static void main(String[] args){
//       int a[] = new int [10];
//       a[11] = 9;
//        System.out.println(a);
   // }
//    try {
//        int a[] = new int [10];
//        a[11] = 9;
//        System.out.println(a);
//    } catch (ArrayIndexOutOfBoundsException e){
//        System.out.println("I am catching ArrayIndexOutOfBounds exception");
//    }
//
//    }
//}


