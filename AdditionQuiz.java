package corejavapractice;

import java.util.Scanner;

public class AdditionQuiz {
	static int num1, num2, ans;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take user choice for difficulty
		Scanner input = new Scanner(System.in);
		System.out.println("Choose difficulty: "
		        +"\n1.Easy"
				+ "\n2.Medium"
				+ "\n3.Hard");
		int choice = input.nextInt();
		
		// choose the appropriate case based on difficulty
		switch(choice) {
		case 1: quizGenerator(10);
		break;
		
		case 2: quizGenerator(100);
		break;
		
		case 3: quizGenerator(1000);
		break;
		
		default: System.out.println("wrong input!");
		}
		
		
		
		
		
	}
	
	public static void quizGenerator(int difficulty) {
		// ask user to enter size of quiz
		Scanner input = new Scanner(System.in);
		System.out.println("How many number of questions you want? ");
		int quizSize = input.nextInt();
		
		System.out.println("\nquiz started... \n");
		int correctAnswers = 0;
		for(int i = 0; i < quizSize; i++) {
			num1 = (int)(Math.random()*difficulty);
			num2 = (int)(Math.random()*difficulty);
			
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
		System.out.println("\nquiz ended... \n");
		System.out.println("Score: " + score + "%");

	}
	

	

}
