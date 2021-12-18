package corejavapractice;

import java.util.Scanner;


public class ComputeCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// new comment.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		
		double area = computeAreaOfCircle(radius);
		System.out.println("area is: " + area);

	}
	
	public static double computeAreaOfCircle(double radius) {
		
		double area = radius * radius * 3.14159;
		
		return area;
	}

}
