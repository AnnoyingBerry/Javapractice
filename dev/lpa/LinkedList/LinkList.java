package Javapractice.dev.lpa.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		var placesToVisit = new LinkedList<String>();
		
		placesToVisit.add("Sydney");
		placesToVisit.add(0, "Canberra");
		System.out.println(placesToVisit);

		addMoreElements(placesToVisit);
		System.out.println(placesToVisit);

		// removeElements(placesToVisit);
		// System.out.println(placesToVisit);

		//gettingElements(placesToVisit);

		//printItinerary(placesToVisit);
		//printItinerary2(placesToVisit);
		//printItinerary3(placesToVisit);

		// test iterator
		testIterator(placesToVisit);


	}

	public static void addMoreElements(LinkedList<String> list) {

		list.addFirst("Darwin");
		list.addLast("Hobart");
		
		//Queue methods
		list.offer("Melbourne");
		list.offerFirst("Brisbane");
		list.offerLast("Toowoomba");

		//stack methods
		list.push("Alice Springs"); // push to the first element



		
	}
	
	private static void removeElements(LinkedList<String> list) {

		list.remove(4);
		list.remove("Brisbane");

		System.out.println(list);
		String s1 = list.remove(); // remove first element in the list
		System.out.println(s1 + " was removed");

		String s2 = list.removeFirst(); // remove first element in the list
		System.out.println(s2 + " was removed");

		String s3 = list.removeLast(); // remove last element in the list
		System.out.println(s3 + " was removed");

		// dequeue methods
		String p1 = list.poll(); // removes first element of the list
		System.out.println(p1 + " was removed");
		String p2 = list.pollFirst(); // removes first element of the list
		System.out.println(p2 + " was removed");
		String p3 = list.pollLast(); // removes Last element of the list
		System.out.println(p3 + " was removed");


		//push method
		list.push("Sydney");
		list.push("Brisbane");
		list.push("Canberra");
		System.out.println(list);

		String p4 = list.pop();
		System.out.println(p4 + " was removed"); // removes the first element


		
	}

	private static void gettingElements(LinkedList<String> list) {

		System.out.println("Retrieved Elelemt = " + list.get(4));

		System.out.println("First Element = " + list.getFirst());
		System.out.println("LastElement = " + list.getLast());

		System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
		System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

		//queue retrieval method
		System.out.println("Element from element() = " + list.element());

		//stack retrieval methods
		System.out.println("Element from peek() = " + list.peek());
		System.out.println("Element from peekFirst() = " + list.peekFirst() );
		System.out.println("Element from peekLast() = " + list.peekLast() );

		
	}

	public static void printItinerary(LinkedList<String> list) {

		System.out.println("Trip starts at " + list.getFirst());

		for (int i = 1; i < list.size(); i++) {
			System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
		}

		System.out.println("Trip ends at " + list.getLast());
		
	}

	public static void printItinerary2(LinkedList<String> list) {

		System.out.println("Trip starts at " + list.getFirst());
		String previousTown = list.getFirst();
		for(String town:list){
			System.out.println("--> From: " + previousTown + " to " + town);
			previousTown = town;
		}



		System.out.println("Trip ends at " + list.getLast());
		
	}

	public static void printItinerary3(LinkedList<String> list) {

		System.out.println("Trip starts at " + list.getFirst());
		String previousTown = list.getFirst();
		// it is pointed at a position after index 0 and before index 1
		// by default, it will be position before index 1
		ListIterator<String> iterator = list.listIterator(1);
		while(iterator.hasNext()){
			// when next() is called the cursor will move to the next position
			// until there is no elements left
			var town = iterator.next();
			System.out.println("--> From: " + previousTown + " to " + town);
			previousTown = town;
		}
		System.out.println("Trip ends at " + list.getLast());
		
	}

	private static void testIterator(LinkedList<String> list) {

		var iterator = list.listIterator();
		while(iterator.hasNext()){
			//System.out.println(iterator.next());
			if(iterator.next().equals("Brisbane")){
				// if u use list.remove()
				// you wll get ConcurrentModificationException error
				// it will happen if you use enhance forloop
				// remember to call it in the iterator object not hte list object
				iterator.add("Lake Wivenhoe");
			}
		}
		// nothing happens because hasnext() is false after the first while loop
		// we can no longer use the same instance to loop through
		// we have to create a new instance or move the cursor backwoards
		while(iterator.hasPrevious()){
			System.out.println(iterator.previous());
		}
		System.out.println(list);

		var iterator2 = list.listIterator(3);
		System.out.println(iterator2.previous());
		
	}
}
/* 
	**** Linked List
		- not indexed, no array
		- stored addresses are in a neat ordered way
		- Retrieval of and element costs alot
			- start from head to tail
			- check if the element matches
			- or keep track of the number of elements traversed, if match by index
		- inserting or removing is easy
			- add at the start or the end of the list is more efficient than arraylist
			- breaking the two links in wthe chain, and re-establish the links

		*** Double Linked list (Double ended Queue)
			- each element consist of:
				- previous element address/null if its the head
				- value
				- next element address/null if its the tail
			- can be called a Queue
	
		
		*** Iterator
			- it is like a database cursor
			- a mechanism that enables traversal, over records in a collection
			* next()
				- it is to get the next element in the list
			* hasNext()
				- to check if there is any element remained to be process
				- returns true or false
			* remove()
				- only supports this method
				- you cannot add or set with Iterator
		*** Listiterator
			- supports add and set methods
			* add()
			* set()




*/
