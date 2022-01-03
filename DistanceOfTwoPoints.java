package corejavapractice;

import java.util.Scanner;

public class DistanceOfTwoPoints {
	
	static double x1, x2, y1, y2;
	static double dx, dy;
	static double distance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// take point1
		System.out.println("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		// take point2
		System.out.println("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input. nextDouble();
		
		// power of difference between x2 x1
		dx = Math.pow((x2 - x1), 2);
		
		// power of difference between y2 y1
		dy = Math.pow((y2 - y1), 2);
		
		// calculate distance
		distance = Math.pow((dx + dy), 0.5);
		
		//print the result
		System.out.println("distance is: " + distance);
		
		

	}

}
