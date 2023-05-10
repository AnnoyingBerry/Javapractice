package Javapractice.dev.lpa.Arrays;

import java.util.Scanner;

public class MinimumElementChallenge {

	public static void main(String[] args) {
		
		System.out.println(findMin(readIntegers()));
	
	}

	public static int[] readIntegers() {
		Scanner scanner = new Scanner(System.in);	
		String listofNumbers;
		
		System.out.println("Enter a list of numbers(delimited with ',') ");
		listofNumbers = scanner.nextLine();
		String[] strValue = listofNumbers.split(",");
		int[] numbers = new int[strValue.length];

		for (int i = 0; i < strValue.length; i++) {
			
			numbers[i] = Integer.parseInt(strValue[i].trim());
			
		}
		scanner.close();
		return numbers;
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(min > array[i]){
				min = array[i];
			}
		}

		return min;
	}
}
