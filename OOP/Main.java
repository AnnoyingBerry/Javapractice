package Javapractice.OOP;

public class Main {

	public static void main(String[] args) {
		
		/*
			*null reference - variable/attribute has a type but no object reference
			* Default values assigned on fields
				- int bool bye long short : 0 (default value)
				- bool : false (default value)
				- double float : 0.0 (default value)
				- any other type will be 'null'
		*/
		Car car = new Car();
		// car.make = "porche";
		// car.model = "carrea";
		// car.colour = "red";
		car.describeCar();
	}
	
}
