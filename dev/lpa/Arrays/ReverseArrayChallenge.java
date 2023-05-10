package Javapractice.dev.lpa.Arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {

		int[] test1 = {1,2,3,4,5};
		int[] test2 = {20,18,30,90,21,33,44,52};

		System.out.println("test 1");
		reverse(test1);
		System.out.println("-".repeat(20));
		System.out.println();

		System.out.println("test 2");
		reverse(test2);
		System.out.println("-".repeat(20));

		System.out.println("test 3 better reverse");
		reverseBetter(test1);
		System.out.println("-".repeat(20));
		System.out.println();

		System.out.println("test 4 better reverse");
		reverseBetter(test2);
		System.out.println("-".repeat(20));
	}

	public static void reverse(int[] reverse) {
		
		System.out.println("Before = " + Arrays.toString(reverse));
		int[] temp = new int[reverse.length];
		int counter = 0;

		for (int i = reverse.length - 1; i >= 0; i--) {
			temp[counter] = reverse[i];
			counter++;
		}

		System.out.println("After = " + Arrays.toString(temp));

	}

	//mutating method- not a desire effect because 
	//it has impact on the calling code data
	public static void reverseBetter(int[] reverse) {

		int maxIndex = reverse.length -1;
		System.out.println("Before = " + Arrays.toString(reverse));
		for (int i = 0; i < reverse.length/2; i++) {
			/*
				If odd, 
					first iteration:
						- first index and last index swap values
					second iteration:
						- second index and the (last index - 1) swap values
					Iterate until the middle of the array
						- stop the swap
				
				if even, 
					iterate and swap until the middle index has been swap
			*/
			int temp = reverse[i];
			reverse[i] = reverse[maxIndex - i];
			reverse[maxIndex - i] = temp;
			System.out.println("-----> " + Arrays.toString(reverse));
		}
		System.out.println("After = " + Arrays.toString(reverse));
	}
	
}
