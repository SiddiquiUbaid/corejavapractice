package corejavapractice;

import java.util.Scanner;

public class MathsQuiz {
	static int difficulty, num1, num2, ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// ask user to choose from types of arithmetic operations mentioned.
		generateQuiz();
		
		// call function to generate quiz, according to user choice.
		
		
	}
	
	public static void generateQuiz() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose from type of quizes below: ");
		System.out.println("\n1.Addition"
				+ "\n2.Subtraction"
				+ "\n3.Multiplication"
				+ "\n4.Division");
		int choiceOfQuizType = input.nextInt();
		
		// take user choice for difficulty
		chooseDifficulty();
		
		// choose the appropriate case based on difficulty
		switch(choiceOfQuizType) {
		case 1: addition(difficulty);
		break;
		
		case 2: subtraction(difficulty);
		break;
		
		case 3: multiplication(difficulty);
		break;
		
		case 4: division(difficulty);
		break;
		
		default: System.out.println("wrong input!");
		}
}

	
	public static void chooseDifficulty() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose difficulty: "
		        +"\n1.Easy"
				+ "\n2.Medium"
				+ "\n3.Hard");
		int choice = input.nextInt();
		
		// choose the appropriate case based on difficulty
		switch(choice) {
		case 1: difficulty = 10;
		break;
		
		case 2: difficulty = 100;
		break;
		
		case 3: difficulty = 1000;
		break;
		
		default: System.out.println("wrong input!");
		}
}

	
	public static void addition(int difficulty) {
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
	
	// quiz generating for subtraction
	public static void subtraction(int difficulty) {
		// ask user to enter size of quiz
				Scanner input = new Scanner(System.in);
				System.out.println("How many number of questions you want? ");
				int quizSize = input.nextInt();
				
				System.out.println("\nquiz started... \n");
				int correctAnswers = 0;
				for(int i = 0; i < quizSize; i++) {
					num1 = (int)(Math.random()*difficulty);
					num2 = (int)(Math.random()*difficulty);
					
					ans = num1 - num2;
					
					System.out.println("What is " + num1 + "-" + num2 + " ?");
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
	
	// quiz generating for multiplication
		public static void multiplication(int difficulty) {
			// ask user to enter size of quiz
					Scanner input = new Scanner(System.in);
					System.out.println("How many number of questions you want? ");
					int quizSize = input.nextInt();
					
					System.out.println("\nquiz started... \n");
					int correctAnswers = 0;
					for(int i = 0; i < quizSize; i++) {
						num1 = (int)(Math.random()*difficulty);
						num2 = (int)(Math.random()*difficulty);
						
						ans = num1 * num2;
						
						System.out.println("What is " + num1 + "*" + num2 + " ?");
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
		
		// quiz generating for division
				public static void division(int difficulty) {
					// ask user to enter size of quiz
							Scanner input = new Scanner(System.in);
							System.out.println("How many number of questions you want? ");
							int quizSize = input.nextInt();
							
							System.out.println("\nquiz started... \n");
							int correctAnswers = 0;
							for(int i = 0; i < quizSize; i++) {
								num1 = (int)(Math.random()*difficulty);
								num2 = (int)(Math.random()*difficulty);
								
								ans = num1 / num2;
								
								System.out.println("What is " + num1 + "/" + num2 + " ?");
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
