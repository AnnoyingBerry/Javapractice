package Javapractice.JavaMethodChallenge;

public class SecondandMinChallenge {

	public static void main(String[] args) {
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(-3945));
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(-65, -45));
	}

	public static String getDurationString(int seconds) {

		if(seconds < 0){
			return "Invalid Time";
		}

		int min = seconds/60;
		int remainderSec = seconds % 60;
		return getDurationString(min, remainderSec);

		
	}

	public static String getDurationString(int min,int sec) {


		if(min < 0){
			return "Invalid Time";
		}

		if((sec < 0) || (sec > 59) ){
			return "Invalid Time";
		}

		int hour = min/60;

		int remainderMins = min % 60;

		String results = hour + " h " + remainderMins + " m " + sec + "s";


		return results;
		
	}
	
}
