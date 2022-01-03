package corejavapractice;

public class DisplayCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get epoch time in milliseconds
		long milliSeconds = System.currentTimeMillis();
		
		// convert into seconds
		long seconds = milliSeconds / 1000;
		
		// convert seconds into minutes
		int minutes = (int)(seconds / 60);
		
		// convert minutes into hours 
		int hours = minutes / 60;
		
		// calculate current hours
		int currentHours = (hours + 5) % 24;
		
		// Display current time in HH:MM:SS format
		String currentTime = " " + currentHours + ":" + minutes + ":" + seconds;
		
		System.out.println("Current time is :- " + currentTime);

	}

}
