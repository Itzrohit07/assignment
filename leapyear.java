//write a program leap year or not.
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int year=sc.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
            System.out.println("the year is lepyear");
        }
        else
        {
            System.out.println("the year is not a leapyear");
        }

    }
}
