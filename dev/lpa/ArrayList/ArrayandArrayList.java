package Javapractice.dev.lpa.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayandArrayList {

	public static void main(String[] args) {
		String[] originalArray = new String[]{"First","Second","Third"};
		var originalList = Arrays.asList(originalArray);

		// the converted array to arraylist is mutable, and changes made will changed for both
		originalList.set(0, "one");
		System.out.println("List: " + originalList);
		System.out.println("Array: " + Arrays.toString(originalArray));

		// nartual order does consider uppercase letters and lower case letters
		// uppercase first then lower case letters
		originalList.sort(Comparator.naturalOrder());
		System.out.println("array: " + Arrays.toString(originalArray));

		//unsupported exception because it cannot add or remove
		//originalList.remove(0);
		//originalList.add("fourth");

		List<String> newList = Arrays.asList("Sunday","Monday","tuesday");
		System.out.println(newList);

	}
	
}
