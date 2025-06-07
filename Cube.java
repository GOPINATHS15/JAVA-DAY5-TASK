package Day5;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// Write a java program to  cube of a number based on the user
		
		Scanner cube = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = cube.nextInt();
		cube.close();
		String result = a + "*" + a + "*" + a + "=" + (a*a*a);
	    System.out.println("Cube : " + result);
	}

}
