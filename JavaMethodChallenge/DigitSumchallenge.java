package Javapractice.JavaMethodChallenge;

public class DigitSumchallenge {
	
	public static void main(String[] args) {

		System.out.println("results: " + (sumDigit(125)));
		System.out.println("-------------------------------");
		System.out.println("\n");
		System.out.println("results: " + (sumDigit(232145452)));
		System.out.println("-------------------------------");
		System.out.println("\n");
		System.out.println("results: " + (sumDigit(-185)));
		System.out.println("-------------------------------");
		System.out.println("\n");
		System.out.println("results: " + (sumDigit(1234)));
		
	}

	public static int sumDigit(int number) {

		int result = 0;

		if (number < 0){
			result = -1;
			return result;
		}

		while(number > 9){
		
			result += (number % 10);
			System.out.println("Sum of total: " + result);

			number /= 10;
			System.out.println("parse of number: " + number);
			System.out.println("-----------------------------");
		}

		if(number < 10){
			System.out.println("leftover number: " + number);
			System.out.println("current total: " + result);
			result += number;

		}

		return result;
		
	}
	
}
