//Q.3 Take three numbers from the user and print the greatest number.

import java.util.*;
public class program3 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the first number");
            int a=sc.nextInt();
            System.out.println("enter the second number");
            int b=sc.nextInt();
            System.out.println("enter the third number");
            int c=sc.nextInt();

            if(a>b)
                if (a>c)
                    System.out.println("this gretest number is:"+a);
            if (b>a)
                if (b>c)
                    System.out.println("this is grtest number:"+b);
            if(c>a)
                if(c>b)
                    System.out.println("this is grtest number:"+c);

        }
    }


