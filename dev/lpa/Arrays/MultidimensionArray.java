package Javapractice.dev.lpa.Arrays;

import java.util.Arrays;

import javax.swing.text.html.parser.Element;

public class MultidimensionArray {
	public static void main(String[] args) {

		int [][] array2 = new int[4][4];

		array2[1] = new int[] {10,20,30};
		System.out.println(Arrays.deepToString(array2));
		System.out.println();
		// ------------------------------------------------

		//initalize and print out null array
		Object[] anyArray = new Object[3];
		System.out.println(Arrays.toString(anyArray));

		//printing out two-dimension array

		anyArray[0] = new String[]{"a","b","c"};
		System.out.println(Arrays.deepToString(anyArray));

		anyArray[1] = new String[][]{
			{"1","2"},
			{"3","4","5"},
			{"6","7","8","9"}
		};
		System.out.println(Arrays.deepToString(anyArray));
		
		anyArray[2] = new int[2][2][2];
		System.out.println(Arrays.deepToString(anyArray));
		System.out.println();


		for(Object element : anyArray){
			System.out.println("Element type = " + element.getClass().getSimpleName());
			System.out.println("Element toString() = " + element);
			System.out.println(Arrays.deepToString((Object[]) element));
			System.out.println();
		}

	}
}
/*

*/
