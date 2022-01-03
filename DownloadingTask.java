package corejavapractice;

public class DownloadingTask implements Runnable {
	
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.println("downloading..." + i);
		}
	}

}
