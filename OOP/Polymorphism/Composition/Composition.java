package Javapractice.OOP.Polymorphism.Composition;

public class Composition {

	public static void main(String[] args) {
		Computercase thecase = new Computercase("2208", "Dell","240");

		Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, "2540 x 1440");
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor,theMotherboard,thecase);

		// thePC.getMonitor().drawPixelAt(10, 10, "Red");
		// thePC.getMotherboard().loadProgram("Windows OS");
		// thePC.getComputerCase().pressPowerButton();

		thePC.powerUp();

	}
	
}
/* 

	Inheritance - IS A relationship
	Composition - Has A relationship

	example:
	A personal computer IS A product
	A personal computer HAS A computer case,monitor,motherboard

	- it is like creating an object over an object,a master object
	- look at composition first before deciding to use inheritance

	Composition vs Inheritance
	- composition is more flexible, you can add or remove parts, 
		less likely to have a downstream effect
	- provides function reuse outside of the class hierachy
	- inheritance breaks encapsulation
	- inheritance is less flexible, add or remove a class may impact subclasses
	

*/
