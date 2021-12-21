package corejavapractice;

import java.util.Scanner;

public class CalculateLuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// take input
		System.out.println("Enter your name: ");
		String name = input.next();
		
		// sum all the characters of name string
		int sumOfChars = 0;
		for(int i = 0; i < name.length(); i++) {
			sumOfChars += name.charAt(i);
		}
		
		// if sum of characters have four digits, reduce it to three only
		if(sumOfChars > 999) {
			sumOfChars = sumOfChars % 1000;
		}
		
		//System.out.println("sum of chars is : " + sumOfChars);
		
		// calculate lucky number
		int luckyNumber = calculateLuckyNumber(sumOfChars);
		
		// print the result
		System.out.println("Your lucky number is: " + luckyNumber);
		

	}
	
	// create a method to calculate lucky number frome sum of characters
	public static int calculateLuckyNumber(int number) {
		int luckyNumber = 0;

		// first extract last element form left
		luckyNumber += number % 10;

		// extract middle digit
		luckyNumber += (number / 10) % 10;

		// extract last element
		luckyNumber += number / 100;
		
		return luckyNumber;
	}

}
