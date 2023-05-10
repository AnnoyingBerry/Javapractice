package Javapractice.dev.lpa.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class P1LinkedListChallenge {

	public static void main(String[] args) {

		LinkedList<Town> list = new LinkedList<>();
		addTown(list, new Town("Adelaide", 1374));
		
		addTown(list,new Town("Alice Spring", 2771));
		addTown(list,new Town("Brisbane", 917));
		addTown(list,new Town("Darwin", 3972));
		addTown(list,new Town("Melbourne",877));
		addTown(list,new Town("Perth", 3923));

		list.addFirst(new Town("Sydney", 0));
		
		program(true, list);

	}

	public static void program(boolean flag,LinkedList<Town> list) {
		
		Scanner s = new Scanner(System.in);
		String choice;
		var iterator = list.listIterator();
		boolean foward = true;

		System.out.println("""
			Available actions (select word or letter):
			(F)oward
			(B)ackward
			(L)ist Places
			(M)enu
			(Q)uit""");

		while(flag){	

			// if the previous element is a null value, it is the head
			if(!iterator.hasPrevious()){
				System.out.println("Starting place: " + iterator.next());
				foward = true;
			}
			// if the next element is null value, it is the tail of the list
			if(!iterator.hasNext()){
				System.out.println("Final place: " + iterator.previous());
				foward = false;
			}

			choice = s.nextLine().toUpperCase();
			switch (choice) {
				case "F","FOWARD":
				 
					if(!foward){  // reversing direction
						foward = true;
						if (iterator.hasNext()) 
						{
							iterator.next(); // adjust position forward
						}
					}	
					fowardIterator(list,iterator); 
					break;
				case "B","BACKWARD":
					if(foward){ // reversing direction
						foward = false;
						if (iterator.hasPrevious()) 
						{
							iterator.previous(); // adjust position backwards
						}
					}
					backwardIterator(list,iterator); 
					break;
				case "L","LIST PLACES": listPlaces(list); break;
				case "M", "MENU": 
					System.out.println("""
						Available actions (select word or letter):
						(F)oward
						(B)ackward
						(L)ist Places
						(M)enu
						(Q)uit""");
					
					break;
				case "Q","QUIT": flag = false; s.close(); break;
				default:
					System.out.println("type something valid!");
					System.out.println();
					break;
			}
		}
		
	}

	private static void fowardIterator(LinkedList<Town> list, ListIterator iterator) {
		
		if (iterator.hasNext()) {
			System.out.println(iterator.next());
		}else{
			System.out.println("end of list!");
		}

		
	}

	private static void backwardIterator(LinkedList<Town> list,ListIterator iterator) {

		if (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}else{
			System.out.println("It is at the starting point!");
		}	
	}

	private static void listPlaces(LinkedList<Town> list) {

		var iterator = list.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	private static void addTown(LinkedList<Town> list, Town town) {

		if(list.contains(town)){
			System.out.println("Place already exists!");
			return;
		}
		for(Town t : list){
			if(t.getTown().equalsIgnoreCase(town.getTown())){
				System.out.println("Place already exists!!");
			return;
			}
		}
		int matchedIndex = 0;
		for(var listTown: list){
			if(town.getDistancefromSydney() < listTown.getDistancefromSydney()){
				list.add(matchedIndex, town);
				return;
			}
			matchedIndex++;
		}
		list.add(town);
	}

	private static LinkedList<Town> populateList(){

		LinkedList<Town> list = new LinkedList<>();

		list.add(new Town("Sydney", 0));
		list.add(new Town("Adelaide", 1374));
		list.add(new Town("Alice Spring", 2771));
		list.add(new Town("Brisbane", 917));
		list.add(new Town("Darwin", 3972));
		list.add(new Town("Melbourne",877));
		list.add(new Town("Perth", 3923));

		return list;
	}
	
}

class Town{
	private String town;
	private int distancefromSydney;

	public Town(String town, int distancefromSydney){
		this.town = town;
		this.distancefromSydney = distancefromSydney;
	}

	
	//get methods
	public String getTown() {
		return town;
	}


	public int getDistancefromSydney() {
		return distancefromSydney;
	}

	
	@Override
	public String toString() {
		return "{" +
			" town= " + getTown() + " " +
			", distancefromSydney= " + getDistancefromSydney() + " " +
			"}";
	}


}
