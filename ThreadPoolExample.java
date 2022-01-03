package corejavapractice;

import java.util.concurrent.*;

public class ThreadPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		
		executor.execute(new PrintB());
		executor.execute(new Print100Integers());
		executor.execute(new PrintA());

	}

}
