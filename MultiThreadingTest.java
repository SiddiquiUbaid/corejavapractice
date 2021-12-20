package corejavapractice;

public class MultiThreadingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Print100Integers print100 = new Print100Integers();
		PrintA printA = new PrintA();
		PrintB printB = new PrintB();
		
		System.out.println("hello");
		
		Thread thread1 = new Thread(print100);
		Thread thread2 = new Thread(printA);
		Thread thread3 = new Thread(printB);
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
