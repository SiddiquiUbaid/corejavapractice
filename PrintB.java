package corejavapractice;

public class PrintB implements Runnable {
	
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println("b" + i);
		}
	}

}
