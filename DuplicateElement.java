//1. Java program to find duplicate elements in an String array.
package lab;
 class DuplicateElement {
public static void main(String[]args) {
 String[] sc={"YAMAHA","KAWASAKI","YAMAHA"};
 
 for(int i=0;i<sc.length;i++) {
	 for (int j=i+1;j<sc.length;j++) {
		 if(sc[i]==sc[j]) {
			System.out.println("Duplicate characters are:"+sc[j]);
			
		 }
		 else {
			 System.out.println("duplicate char is not present");
		 }
	 }
 }
}
}

