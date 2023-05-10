package Javapractice.dev.lpa.Arrays;

import java.util.Random;

public class ArrayChallenge {
	

	public int[] getRandomArray(int len) {
		Random random = new Random();
		int[] unsorted = new int[len];

		for (int i = 0; i < len; i++) {

			unsorted[i] = random.nextInt(100);
			
		}

		return unsorted;
		
	}
}
