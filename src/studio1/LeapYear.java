package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int n0 = in.nextInt();
		int fourYears = (n0%4);
		boolean checkOne = (fourYears == 0);
		int hundredYears = (n0%100);
		boolean checkTwo = (hundredYears != 0);
		int fourHundredYears= (n0%400);
		boolean checkThree = (fourHundredYears == 0);
		boolean hundredYearsCheck = (checkTwo||checkThree);
		boolean leapYear = (checkOne && hundredYearsCheck);
		System.out.print("Year " + n0 + "is a leap year is: " + leapYear + " .");
	}

}
