package corejavapractice;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c = 0;
		double discriminant = 0;
		double root1, root2 = 0;
		
		// Scanner instance
		Scanner input = new Scanner(System.in);
		
		// take inputs
		System.out.println("Enter a: ");
		a = input.nextDouble();
		
		System.out.println("Enter b: ");
		b = input.nextDouble();
		
		System.out.println("Enter c: ");
		c = input.nextDouble();
		
		// calculate discriminant
		discriminant = (Math.pow(b, 2)) - 4 * a*c;
		
		// calculate roots
		root1 = -b +  Math.pow(discriminant, 0.5)  / 2*a;
		root2 = -b -  Math.pow(discriminant, 0.5)  / 2*a;
		
		// find roots on conditions
		if(discriminant > 0) {
			System.out.println("The equation has two roots: ");
			System.out.println("root1 = " + root1);
			System.out.println("root2 = " + root2);
		}
		else if(discriminant == 0) {
			System.out.println(" the equation has one root = " + root1);
		}
		else {
			System.out.println("equation has no roots.");
		}

	}

}
