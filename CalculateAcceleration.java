package corejavapractice;

import java.util.Scanner;

public class CalculateAcceleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double v0, v1, t, a = 0;
		
		Scanner input = new Scanner(System.in);
		
		// take inputs
		
		System.out.println("Enter initial velocity v0: ");
		v0 = input.nextDouble();
		
		System.out.println("Enter ending velocity v1: ");
		v1 = input.nextDouble();
		
		System.out.println("Enter time taken t: ");
		t = input.nextDouble();
		
		double changingVelocity = v1 - v0;
		
		// calculate acceleration
		a = changingVelocity / t;
		
		// print result
		System.out.println("accerelation is: " + a);

	}

}
