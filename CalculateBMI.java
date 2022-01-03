package corejavapractice;

import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create Scanner instance
		Scanner input = new Scanner(System.in);
		
		// take inputs
		System.out.println("Enter weight in Kilograms: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in Meters: ");
		double height = input.nextDouble();
		
		// calculate BMI
		double BMI = weight / (height*height);
		
		// print result
		System.out.println("BMI is: " + BMI);

	}

}
