package corejavapractice;

public class PrintA implements Runnable {
	
	public void run() {
		
		for(int i = 0; i < 100; i ++) {
			System.out.println("a" + i);
		}
	}

}
