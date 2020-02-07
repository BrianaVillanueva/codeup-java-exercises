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


//----Example Two----//

public class ExceptionThrown{
    public static void main(String[] args){
//       int a[] = new int [10];
//       a[11] = 9;
//        System.out.println(a);
   // }
    try {
        int a[] = new int [10];
        a[11] = 9;
        System.out.println(a);
    } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("I am catching ArrayIndexOutOfBounds exception");
    }

    }
}