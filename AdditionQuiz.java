package corejavapractice;

import java.util.Scanner;

public class AdditionQuiz {
	static int num1, num2, ans;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// ask user to enter size of quiz
		System.out.println("How many number of questions you want? ");
		int quizSize = input.nextInt();
		
		int correctAnswers = 0;
		for(int i = 0; i < quizSize; i++) {
			num1 = (int)(Math.random()*10);
			num2 = (int)(Math.random()*10);
			
			ans = num1 + num2;
			
			System.out.println("What is " + num1 + "+" + num2 + " ?");
			int userInput = input.nextInt();
			
			if(userInput == ans) {
				System.out.println("Correct.");
				correctAnswers++;
			}
			else {
				System.out.println("Incorrect.");
			}
			
		}
		System.out.println("\nTotal correct answers: " + correctAnswers +
				" out of " + quizSize);
		
		// calculate score in percentage
		double score = (double)(correctAnswers) / (double)(quizSize) * 100;
		
		System.out.println(" Score: " + score + "%");

	}
	

}
