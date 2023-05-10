package Javapractice.dev.lpa.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayChallengeMain {
	public static void main(String[] args) {
		ArrayChallenge s = new ArrayChallenge();

		int[] unsorted = s.getRandomArray(5);
		System.out.println(Arrays.toString(unsorted));
		int temp;
		boolean flag = true;
		while(flag){
			flag = false;
			for (int i = 0; i < unsorted.length -1; i++) {
				// if the value of the first element is small then the 2nd element
				if(unsorted[i] < unsorted[i+1]){
					// store the first element in a temp variable 
					temp = unsorted[i];
					// replace the first element with the second
					unsorted[i] = unsorted[i+1];
					// the first element that was store in temp, is store in the second element
					unsorted[i+1] = temp;
					flag = true;
				}	
			}

		}
		
		System.out.println(Arrays.toString(unsorted));


	}
}
