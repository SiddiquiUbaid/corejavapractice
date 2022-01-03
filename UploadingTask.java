package corejavapractice;

public class UploadingTask implements Runnable{
	
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.println("uploading..." + i);
		}
	}

}
