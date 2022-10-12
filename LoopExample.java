/*2. Write a do-while loop that asks the user to enter two numbers. 
 * The numbers should be added and the sum displayed. 
 * The loop should ask the user whether he or she wishes to perform the operation again.
 *  If so, the loop should repeat; otherwise it should terminate.*/
package lab;
import java.util.*;
public class LoopExample {

	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		char ch;
		do
		{
			System.out.println("enter the first number:");
			num1=sc.nextInt();
			
			System.out.println("enter the second number:");
			num2=sc.nextInt();
			
			int sum =num1+num2;
			System.out.println("sum of the number:"+sum);
			
			System.out.println("Do you want to continue y/n?:");
			ch=sc.next().charAt(0);
			
			System.out.println();
			}
		while(ch=='y'|| ch=='y');
		
	}

}
