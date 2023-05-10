package Javapractice.dev.lpa.Arrays;

import java.util.Arrays;

public class TwoDimenionArray {

	public static void main(String[] args) {
		int [][] array2 = new int[4][4];
		// it will print out two dimensional int array with object address [[I@5acf9800]
		System.out.println(Arrays.toString(array2));
		System.out.println("Array2.length = " + array2.length);

		//------------------------------------------------------------
		// print out the inner array [I@5acf9800
		for (int[] outer : array2) {
			System.out.println(outer);
		}

		System.out.println();
		System.out.println("Traditional option than using foreach");
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			
			System.out.println(array2[i]);
		}
		System.out.println();

		//------------------------------------------------------------
		// prints out the values in the two dimensional array
		for (int[] outer : array2) {
			System.out.println(Arrays.toString(outer));
		}
		System.out.println();
		System.out.println("Traditional option than using foreach");
		System.out.println();

		// foreach equalvalent
		for (int i = 0; i < array2.length; i++) {
			// the condition is j < array2[i].length
			// because we going into the length of the inner array
			System.out.print("[");
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]);

				if(j < array2[i].length-1){
					System.out.print(", ");
				}else{
					System.out.println("]");
				}
			}

			
		}
		System.out.println();

		// print out only inner loops
		for (int i = 0; i < array2.length; i++) {
			System.out.println(Arrays.toString(array2[i]));
		}

		for (int[] outer : array2) {
			for (var element : outer) {
				System.out.print(element + " ");	
			}
			System.out.println();
		}

		//using deeptString
		System.out.println(Arrays.deepToString(array2));
	}

	
	
}
/* 
		** Two-Dimension array
			* initializer:
				int[][] array = new int[5][5];
				int[][] array = {
					{1,2,3},
					{3,5,6},
					{4,2,3}
				};
				int[][] array = new int[row][];
			
			* how it look like:
				  |j = 0|j = 1|j = 3| 	
			|i = 0|  1	|  2  |  3  |
			|i = 1|  0  |  3  |  4  |
			|i = 2|  3  |  4  |  5  |

*/