package Javapractice.dev.lpa.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayMain {
	public static void main(String[] args) {

		// fixed sized array, in this case 10 element index [0-9]
		int [] myIntArray = new int[10];
		myIntArray[5] = 50;

		double[] myDoubleArray = new double[10];
		myDoubleArray[2] = 3.5;
		System.out.println(myDoubleArray[2]);

		//array initializer
		int[] firstFivePositives = new int[]{1,2,3,4,5};
		//anonymous array initializer
		int[] firstFivePositives2 = {1,2,3,4,5}; // simpler way, can only be used on a declaration statement
		System.out.println("first in array = " + firstFivePositives[0]);
		System.out.println("array length = " + firstFivePositives.length);
		System.out.println("last in array = " + firstFivePositives[firstFivePositives.length-1]);

		int[] newArray;
		newArray = new int[]{5,4,3,2,1};
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] + " ");
		}
		System.out.println();
		for(int element:newArray){
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println(Arrays.toString(newArray));
		
		Object objectVariable = newArray;
		if(objectVariable instanceof int[]){
			System.out.println("it is really a int[]!");
		}

		// array with many types
		Object[] objectArray = new Object[3];
		objectArray[0] = "Hello";
		objectArray[1] = new StringBuilder("World");
		objectArray[2] = newArray;

		// random array
		int[] firstArray = getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
		Arrays.sort(firstArray);
		System.out.println(Arrays.toString(firstArray));

		int[] secondArray = new int[10];
		System.out.println(Arrays.toString(secondArray));
		// fill the array with value 5 in all of the index
		Arrays.fill(secondArray,5);
		System.out.println(Arrays.toString(secondArray));

		int[] thirdArray = getRandomArray(10);
		System.out.println(Arrays.toString(thirdArray));

		// a full copy of an array
		int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
		System.out.println(Arrays.toString(fourthArray));

		// a partial copy
		int [] smallerArray = Arrays.copyOf(thirdArray, 5);
		System.out.println(Arrays.toString(smallerArray));

		// a copy plus additional element
		int[] largerArray = Arrays.copyOf(thirdArray, 15);
		System.out.println(Arrays.toString(largerArray));

		// ------------------------------------------------- Arrays for searching and matching ----------------------------------------------------\

		String[] sArray = {"Able","Jane", "Mark", "Ralph", "David"};
		// binary search only works on sorted array
		Arrays.sort(sArray);
		System.out.println(Arrays.toString(sArray));
		// returns the index position of a match, else return -1
		if(Arrays.binarySearch(sArray, "Mark") >= 0){
			System.out.println("Found Mark in the list");
		}

		int[] s1= {1,2,3,4,5};
		int[] s2= {1,2,3,4,5,0};

		// array types have to match, it will return boolean
		if(Arrays.equals(s1, s2)){
			System.out.println("Arrays are Equals");
		}else {
			System.out.println("Arrays are not Equals");
		}
		

	}
	public static int[] getRandomArray(int len){
		// generate random numbers
		Random random = new Random();
		//initialize array size
		int[] newInt = new int[len];
		for(int i =0; i < len; i++){
			// assign a random number(0 to 99) into the array. exclusive upperbound
			newInt[i] = random.nextInt(100);
		}
		return newInt;
	}	
}
/* 
	* Arrays - Data Stucture
		- Stores a sequence of values, of the same type
		- can have arrays of any class,primitive types
		- the size of the array  once created is fixed

		** Array copy(Arrays.copyof)
			- it creates a new array
			- a new instance/object of an array
			- copies the array elements over to the new array
			- for primitives, values get copied over
			- for objects, it reference get copied over

		** Algorithms for Searching and matching
			* Linear search/Sequential - checking through element by element
				* -> Psudo
					- start looping from start to finish, and check each element, 
						to see it it equals what you're looking for.

					- If you find a match, you'd stop looping, and return that a match was found, 
						either with the position you found the element at, 
						or just a boolean value, true if it was found, and false if not.
					
					- Inefficient if elements are sorted out

			* Interval Searching
				* -> Psudo
					- split each section up, testing the values at the boundaries, 
						and based on that, split again into smaller sections, 
						narrowing the number of elements to test, each time.
					
				- most common interval searches, is the binary search
					In this search, intervals are continually split into two, hence the word binary.

				* -> Psudo - Binary Search
					- First, the array has to be sorted.

					- Second, if there are duplicate values in the array, 
						there's no guarantee which one it'll match on.

					- Finally, elements must be comparable. 
						Trying to compare instances of different types, may lead to errors and invalid results.
					
					- This method returns:
						- The position of a match if found.
						- It returns a -1 when no match was found.
						- It's important to remember, that a positive number may not be the position of the first match.
						- If your array has duplicate values, and you need to find the first element, other methods should be used.


	** Enhanced For-loop
		syntax: 
		
			for(declaration : collection){

			}
		

*/
