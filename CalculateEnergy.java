package corejavapractice;

import java.util.Scanner;

public class CalculateEnergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// take water amount
		System.out.println("Enter amount of water in KG: ");
		double m = input.nextDouble();
		
		// take take initial temperature
		System.out.println("Enter initial temperature: ");
		double t0 = input.nextDouble();
				
		// take water amount
		System.out.println("Enter final temperature: ");
		double t1 = input.nextDouble();		
		
		// calculate eneergy
		double energy = m * (t1-t0) * 4184;
		
		// print the result
		System.out.println("the required energy: " + energy);
		
		

	}

}
