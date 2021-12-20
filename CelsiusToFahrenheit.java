package corejavapractice;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create Scanner object.
		Scanner input = new Scanner(System.in);
		
		// take input from user.
		System.out.println("Enter value in Celsius: ");
		double celsius = input.nextDouble();
		
		// convert celsius to fahrenhiet.
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		// print the result.
		System.out.println( celsius + " is " + fahrenheit + " fahrenheit");

	}

}
