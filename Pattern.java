/*1
212
32123
4321234
543212345

3. Write a program to print following :*/
package lab;

public class Pattern {

	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int k=2;k<=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
