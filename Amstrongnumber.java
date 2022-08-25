//Write a java program to print Armstrong number.
import java.util.*;
public class Amstrongnumber {
    public static void main(String[] args) {
        int number=153;
       int digit=0;
       int  last=0;
        int sum=0;
     while(digit!=0){
         last=digit%10;
         sum+=Math.pow(last,3);
         digit/=10;
     }
     if(sum==number)
         System.out.println(number+"this is armstrong" );
       else
           System.out.println(number+"this not a armstrong");
    }
}
