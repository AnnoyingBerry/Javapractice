package Javapractice.JavaMethodChallenge;

public class BarkingDogE4 {

	public static void main(String[] args) {

		boolean barking[] ={false,true,false,true,false,true,true,true,true,true,true};
		int test[] = {-5,-1,24,44,6,4,23,22,8,7,0};

		for(int i=0;i<test.length;i++){

			boolean shouldWakeup = shouldWakeUp(barking[i],test[i]);

			System.out.println("result: " + shouldWakeup);
			if(shouldWakeup){
				System.out.println("Should i wake up? : Yes");
			}else{
				System.out.println("Should i wake up? : No");
			}

			

		}




	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

		// if the dog is barking before 8 or after 22 hours
		if (barking) {

			// check if its a valid hour of a day
			if ((hourOfDay < 0) || (hourOfDay > 23)) {
				return false;

			} else if ((hourOfDay < 8) || (hourOfDay > 22)) {
				return true;
			}

		}

		return false;

	}

}
