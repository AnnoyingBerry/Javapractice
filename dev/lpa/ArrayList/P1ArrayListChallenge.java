package Javapractice.dev.lpa.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1ArrayListChallenge {

	public static void main(String[] args) {
		
		program(true);
		
	}

	public static void program(boolean flag) {

		Scanner s = new Scanner(System.in);
		int choise;
		ArrayList<String> items = new ArrayList<>();

		while(flag){
			System.out.println("Avalaible Actions");
			System.out.println("0 - to Shutdown");
			System.out.println("1 - to add item(s) to list(comma Delimited list)");
			System.out.println("2 - to remove any items (comma delimited list)");
			System.out.println("Enter a Number for which action you want to do: ");
			
			choise = s.nextInt();
			System.out.println();

			if (choise == 0) {
				s.close();
				flag = false;
			}else if(choise == 1){
				System.out.println("Add items to list (comma Delimited list)");
				s.nextLine();
				String things = s.nextLine();
				addItem(things,items);
				System.out.println();
				System.out.println("items added...");
				System.out.println();
				
			}else if(choise == 2){
				System.out.println("Remove items to list (comma Delimited list)");
				s.nextLine();
				String things = s.nextLine();
				removeItem(things, items);
				System.out.println();
				System.out.println("items Removed...");
				System.out.println();

			}
			items.sort(Comparator.naturalOrder());
			System.out.println(items);
			System.out.println();


		}
	
	}

	public static void addItem(String item,ArrayList<String> arrayList) {

		
		String[] things = item.toLowerCase().split(",");

		for (String b : things) {
			arrayList.add(b.trim());
		}

	}

	public static void removeItem(String item,ArrayList<String> arrayList) {
		
		String[] things = item.toLowerCase().split(",");
		var list = Arrays.asList(things);

		if(arrayList.containsAll(list)){
			arrayList.removeAll(list);
		}
		
	}
	
}
