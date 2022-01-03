package corejavapractice;

public class DeletingTask implements Runnable{
	
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.println("deleting..." + i);
		}
	}

}
