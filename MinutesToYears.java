package corejavapractice;

import java.util.Scanner;

public class MinutesToYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create Scanner instance
		Scanner input = new Scanner(System.in);
		
		// take input as minutes
		System.out.println("Enter minutes: ");
		long minutes = input.nextLong();
		
		// convert minutes to hours
		long hours = minutes / 60;
		
		// convert hours to days
		int days = (int)(hours / 24);
		
		// convert days into years
		int years = days / 365;
		
		// find remaining days with remainder
		int remainingDays = days % 365;
		
		// print result
		System.out.println("for " + minutes + " minutes, there is apporximately " +
		years + " years and " + remainingDays + " days.");
		

	}

}
