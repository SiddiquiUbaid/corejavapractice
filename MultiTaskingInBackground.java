package corejavapractice;

import java.util.concurrent.*;

public class MultiTaskingInBackground {

	public static void main(String[] args) {
		
		// create threads
		Runnable downloading = new DownloadingTask();
		Runnable uploading = new UploadingTask();
		Runnable deleting = new DeletingTask();
		
		ExecutorService execute = Executors.newFixedThreadPool(3);
		
		execute.execute(deleting);
		execute.execute(uploading);
		execute.execute(downloading);
	} 

}
