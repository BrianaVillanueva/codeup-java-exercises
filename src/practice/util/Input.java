//package practice.util;
//
//import java.util.Scanner;
//
//public class Input {
//
//    public Scanner scanner = new Scanner(System.in);
//
//
//    public String getString(){
//        return this.scanner.nextLine();
//    }
//    public boolean yesNo(){
//        System.out.println("yes or no?");
//        String answer;
//        answer = getString();
//        return answer.toLowerCase().startsWith("y");
//    }
//    public int getInt(int min, int max){
//        System.out.println("enter a valid number: ");
//        int userNum = getInt();
//        while (min > userNum || max < userNum){
//            userNum = getInt();
//        }
//        System.out.println("Bingo!");
//        return userNum;
//    }
//   public int getInt(){
//    return this.scanner.nextInt();
//   }
//
//   public double getDouble(double min, double max){
//        System.out.println("enter a valid number: ");
//        double userNum = getDouble();
//        while (min > userNum || max < userNum){
//        userNum = getDouble();
//    }
//        System.out.println("Bingo!");
//        return userNum;
//   }
//
//   public double getDouble(){
//       return scanner.nextDouble();
//   }
//}
