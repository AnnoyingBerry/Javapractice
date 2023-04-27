package Javapractice.OOP.Polymorphism.Polymorph.PonlymorphChallenge;

public class CarMain {

	public static void main(String[] args) {
		
		var car1 = Car.carType(1);
		car1.startEngine();
		car1.drive();
		System.out.println("________________");

		var car2 = Car.carType(2);
		car2.startEngine();
		car2.drive();
		System.out.println("________________");
		


	}
	
}
