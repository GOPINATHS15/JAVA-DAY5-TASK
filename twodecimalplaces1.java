package Day5;
import java.util.Scanner;
public class twodecimalplaces1 {

	public static void main(String[] args) {
		// Write a program to accept 2 floating numbers and 
		//check there are the same up to two decimal places
		
		Scanner number=new Scanner(System.in);
		System.out.print("Enter the number1 : ");
		float a = number.nextFloat();
		int b = (int) (a*100);
		System.out.print("Enter the number2 : ");
		float c = number.nextFloat();
		int d = (int) (c*100);
		
		number.close();
		
	   if(b==d) {
		   System.out.println("Same");
	   }
	   else {
		   System.out.println("It's different");
	   }

	}

}
