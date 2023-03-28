package Javapractice.JavaMethodChallenge;

public class Sum3and5Chall {

	public static void main(String[] args) {
		
		int total = 0;
		int counter = 0;

		for (int i =1; i < 1001; i++){

			if(counter == 5){
				break;
			}

			if((i %3 == 0) && (i % 5 == 0)){
				System.out.println("Number divisible by 3 and 5: " + i);
				total += i;
				counter++;
			}

		}
		System.out.println("Sum of all divisible number = " + total);
	}
	
}
