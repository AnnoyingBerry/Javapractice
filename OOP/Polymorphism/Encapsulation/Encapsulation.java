package Javapractice.OOP.Polymorphism.Encapsulation;

public class Encapsulation {
	public static void main(String[] args) {

		// health is 0 because nothing is done
		// to make sure that player's health is 100.
		Player player = new Player();

		EnahncedPlayer tim = new EnahncedPlayer("tim",200,"Sword");
		System.out.println("Initial health is " + tim.healthRemaining());



	}
}

/*
	Encapsulation:
		- Only show what is necessary
		- To protect integrity of the data
		- restrict access to some data or operations
		- To decouple(seperate/muffle) the internal details of the class,hide class names and types
		- edits will not affect other parts of the code

		* Problem one
			- Allowing direct access to data on an obejct can potentially
				bypass checks,additional processing your class has in place
				that manage the data
		* Problem two
			- Allowing direct access to fields, means calling code fields
				will need to change, when you edit any of the fields.
		
		To create an Encapsulation class:
			* create constructors for object initialisation, which enforces that only object with 
				valid data get initalised
			* private access modifiers
			* setter and getter only when needed
			* public only for methods or calling code needed to use
		

*/
