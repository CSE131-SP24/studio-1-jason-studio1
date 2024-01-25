package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		Double n0 = in.nextDouble();
		System.out.print("Enter the second number: ");
		Double n1 = in.nextDouble();
		double n2 =((n0 + n1)/2);
		System.out.print("The average of " + n0 + " and " + n1 + " is " + n2 + " .");
		
	}

}
