package Javapractice.dev.lpa.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name,String type, int count){
	public GroceryItem(String name){
		this(name,"DAIRY",1);
	}

	@Override
	public String toString(){
		return String.format("%d %s in %s",count,name.toUpperCase(),type);
	}
}
public class ListandArrayListMain {

	public static void main(String[] args) {
		GroceryItem[] groceryArray = new GroceryItem[3];
		groceryArray[0] = new GroceryItem("milks");
		groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
		groceryArray[2] = new GroceryItem("oranges", "PRODUCES", 5);
		System.out.println(Arrays.toString(groceryArray));

		// Compliler is telling me  that it is a raw type
		// which means any type could be added into the arraylist
		// like this example, it suppose to be a grocer
		ArrayList objectlist = new ArrayList();
		objectlist.add(new GroceryItem("butter"));
		objectlist.add("Yogurt");
		System.out.println("_".repeat(20));

		//<> diamond operator, explicit type arguments
		// without the <> on the right assignemnt, the compile time 
		// will allow other types to be included in the arraylist
		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("butter"));
		groceryList.add(new GroceryItem("milk"));
		groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
		// put this at index 0, moviving the rest of the down by 1
		groceryList.set(0,new GroceryItem("apples", "PRODUCE", 6));
		groceryList.remove(1);
		System.out.println(groceryList);





	}
	
}
/* 
	**** List
		*** ArrayList 

			** Initalise: ArrayList<String> arrayList = new ArrayList<>();
				* <> diamond operator - <type Argument/element> 
					- The compile-time will check that only that "type" can be added in the array list
				
			** Initialise with values: ArrayList<String> arrayList = new ArrayList<>(List.of("first","second"));
				- uses arrayList constructor, that takes in a collection/List of values, during creation.

			** Multi-Dimensional ArrayList
				* Initalise: ArrayList<ArrayList<String>> multiDList = new ArrayList<>();

			** Accessing ArrayList Element data:
				* length of array: variableName.size();
				* set method: variableName.set(index,value);
				* get method: arrayList.get(index);
				* Print: System.out.println(arrayList);
			
			** Finding an element in ArrayList
				* arrayList.contains(element); // returns boolean
				* arrayList.containsAll(list of elements) // returns boolean
				* arrayList.indexof(element) // returns index(int) else -1(not found)
				* arrayList.lastIndexOf(element) // returns index(int) else -1(not found)
			
			** Sorting 
				* arrayList.sort(Comparator.naturalOrder()); // there is a natural order for number(0-9) and string(A-Z) 
				* arrayList.sort(Comparator.reverseOrder()); // reverse the array descending
			
			* Array to ArrayList
				* Arrays.asList(array) - method to convert to ArrayList
					*
						String[] originalArray = new String[]{"First","Second","Third"};
						var originalList = Arrays.asList(originalArray); // returns an arrayList
					*
						- this arrayList is not resizable
						- changes made to this List, will change the array that backs it(mutable)
						- conceptually, it is putting an ArrayList wrapper around an existing array

					*
						var newList = Arrays.asList("Sunday","Monday");
					*
						- immutable list
						- not resizable
			
			* Creating Array from ArrayList
				// toArray(initialise object from type array) // returns array
				* 
					ArrayList<String> stringLists = new ArrayList<>(List.of("Jan","Feb"));
					String[] stringArray = stringList.toArray(new String[0]);
					//In the example shown here, 
						we pass a String array with zero as the size, 
						but the array returned has three elements, 
						which is the number of elements in the list.

				*
					- the length of the array you pass, has more elements than the list, 
						extra elements will be filled with the default values for that type

					-the length of the array you pass, has less elements than the list, the method will still return an array, 
						with the same number of elements in it, as the list
				
					
					




				
					
					
				

				
			
			
			
			
				


			
			
*/

