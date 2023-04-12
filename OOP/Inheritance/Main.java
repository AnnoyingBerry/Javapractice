package Javapractice.OOP.Inheritance;

/*
	*null reference - variable/attribute has a type but no object reference
	* Default values assigned on fields
		- int bool bye long short : 0 (default value)
		- bool : false (default value)
		- double float : 0.0 (default value)
		- any other type will be 'null'
*/

public class Main {


	public static void main(String[] args) {
		

		Car car = new Car();
		//Car car1 = null; // null point exception but can compile, runtime error
		//Car car; // cannot compile, compile time error
		// car.make = "porche";
		// car.model = "carrea";
		// car.colour = "red";
		car.describeCar();


		//bank challenge 

		Bank bank = new Bank();
		bank.getAccBalance();

		//customers challange

		Customers details = new Customers("john",1000,"john@mail");
		
		System.out.println(details.getName());
		System.out.println(details.getEmail());
	


	}
	
}
