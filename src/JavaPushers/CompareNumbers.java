package JavaPushers;

public class CompareNumbers {
/*Create a method that */
    public static String compareNumbers(double int1, double int2) {
        if (int1 < int2) {
            return int1 + "<" + int2;
        } else if (int1 > int2){
            return int1 + ">" + int2;
        } else {
            return int1 + "==" + int2;
        }
    }
}
