package Javapractice.dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoboxingandUnboxing {
	public static void main(String[] args) {
		
		Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
		Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
		int unboxedInt = boxedInt.intValue(); // unnecessary

		//Automatic boxing
		Integer autoboxed = 15;
		int autoUnboxed = autoboxed;

		System.out.println(autoboxed.getClass().getName());

		// cannot compile because it is a primitive data type
		//System.out.println(autoUnboxed.getClass().getName()); 


		// methods returns a primitive double but it is boxed because it was assigned to a 
		// Wrapper Class, Double
		Double resultBoxed = getLiteralDoubePrimitive();

		//method returns a wapper class Double, but unboxing occurs because it 
		// was assigned to a primitive double type variable
		double resultUnboxed = getDoubleObject();

		// wrapper class using array
		Integer[] wrapperArray = new Integer[5];
		wrapperArray[0] = 50;
		System.out.println(Arrays.toString(wrapperArray));

		System.out.println(wrapperArray[0].getClass().getName());

		Character[] characterArray = {'a','b','c','d'};
		System.out.println(Arrays.toString(characterArray));


		var ourList = getList(1,2,3,4,5);
		System.out.println(ourList);



		

	}

	private static Double getDoubleObject(){
		return Double.valueOf(100.00);
	}

	private static double getLiteralDoubePrimitive() {
		return 100.0;
	}

	private static int returnAnInt(Integer i) {
		return i;
	}

	private static Integer returnAnInteger(int i) {
		return i;
		
	}

	private static ArrayList<Integer> getList(Integer... varargs) {
		ArrayList<Integer> alist = new ArrayList<>();
		for (int i : varargs) {
			// autoboxing happens here
			// here the add method is not a primitive type
			// it is a integer wrapper parameter type
			alist.add(i);
		}
		return alist;
	}
}
/* 
	**** Usage 
		- Arraylist,linkedlist
		- collection type
		- these classes can't use primitive data types
		- Linkedlist<int> myIntegers - new LinkedList<>(); // wont compile
	**** Autoboxing
		*** Boxing - A primitive type to a wrapper class
			- e.g from int(primitive) to Integer(warpper class)
			** generally we use .valueOf(); to get an instance of the wrapper class

	**** Unboxing
		- A wrapper class type to a primitive type
	
	* Deprecated code
		- it means that it is an old code, there are better alternatives
		- valueOf(int) is better
		- it has better space and time performance 



*/
