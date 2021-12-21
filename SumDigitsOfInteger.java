package corejavapractice;

import java.util.Scanner;

public class SumDigitsOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enteger an intger between 0 to 999: ");
		int userInput = input.nextInt();
		
		int sum = 0;
		
		// first extract last element form left
		sum += userInput % 10;
		
		// extract middle digit
		sum += (userInput / 10) % 10;
		
		// extract last element
		sum += userInput / 100;
		
		// print the result 
		System.out.println("sum of digits of integer " + userInput + " is: " + sum); 

	}

}
