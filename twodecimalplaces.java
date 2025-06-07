package Day5;
import java.util.Scanner;
public class twodecimalplaces {

	public static void main(String[] args) {
		// Write a program to accept 2 floating numbers and 
		//check there are the same up to two decimal places
		
		Scanner number=new Scanner(System.in);
		System.out.print("Enter the number1 : ");
		float a = number.nextFloat();
		System.out.print("Enter the number2 : ");
		float b = number.nextFloat();
		number.close();
		
	   if(a==b) {
		   System.out.println("Same");
	   }
	   else {
		   System.out.println("It's different");
	   }

	}

}
