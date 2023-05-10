package Javapractice.dev.lpa.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
	public static void main(String[] args) {
		String[] items = {"apples","bananas","milk","eggs"};
		/* 
			//factory method
			calls a static method on a class
			and it returns a new instance of a class for us. 
			And here we're calling a static method on List,
			simply called of, 
			and that returns a List of String elements back. 
		*/

		// of(items) -> transform an array of String to list of string

		List<String> list = List.of(items); 
		System.out.println(list);
		// returns java.util.ImmutableCollections$ListN
		// type List N  is a nested class
		// in ImmutableCollections class
		// importantly its immutable
		System.out.println(list.getClass().getName()); 
		// list.add("yougurt"); // returns error cause it is immutable


		//result of this is because it is a mutable array list
		ArrayList<String> groceries = new ArrayList<>(list);
		groceries.add("yogurt");
		System.out.println(groceries);

		// all in one statement
		ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
		System.out.println(nextList);

		groceries.addAll(nextList);
		System.out.println(groceries);

		// retrieving value by index for arraylist
		System.out.println("Third Item = "+ groceries.get(2));

		if(groceries.contains("mustard")){
			System.out.println("List contains mustard");
		}

		groceries.add("yogurt");
		System.out.println("First = " + groceries.indexOf("yogurt"));
		System.out.println("Last = " + groceries.lastIndexOf("yogurt"));

		System.out.println(groceries);
		groceries.remove(1);
		System.out.println(groceries);
		// only remove one from the array, the index that is closer to 0
		groceries.remove("yogurt");
		System.out.println(groceries);

		// remove all that that contains in this list
		groceries.removeAll(List.of("apples","eggs"));
		System.out.println(groceries);

		// retain certain list of values and remove the rest
		groceries.retainAll(List.of("apples","milk","mustard","cheese"));
		System.out.println(groceries);

		// clear everything in the list
		groceries.clear();
		System.out.println(groceries);
		System.out.println("isEmpty = " + groceries.isEmpty());

		//ways to add multiple things into the list
		groceries.addAll(List.of("apples","milk","mustard","cheese"));
		groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));

		System.out.println(groceries);
		//sort method
		//type called comparator, allows object to compare with one another
		// a static factory method, called natural order in the comparator class
		// it allows ArrayList with types that have a natrual order to be sorted
		// string A-Z, numbers 0-9, small to big
		groceries.sort(Comparator.naturalOrder());
		System.out.println(groceries);

		//reverse the order of teh array
		groceries.sort(Comparator.reverseOrder());
		System.out.println(groceries);

		var groceriesArray = groceries.toArray(new String[groceries.size()]);
		System.out.println(Arrays.toString(groceriesArray));


	}
}

/* 
	
*/
