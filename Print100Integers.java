package corejavapractice;

public class Print100Integers implements Runnable {
	
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " ");
		}
	}

}
