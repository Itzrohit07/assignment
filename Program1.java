 //Q.1 WAJP to get a number from the user and print whether it is positive or negative.
 import java.util.*;
  public class Program1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
     int a =sc.nextInt();
     if(a>0){
         System.out.println("given nuber is positive");
     }
     else{
         System.out.println("given number is negetive");
     }


    }
}
