package Javapractice.OOP;

public class Car {

	//called fields/attribtues/class variables in side a body of a class
	// should have access modifiers for it
	// dont declare one, default,  java declare (package private)
	// when create an object, it will represent the state of the object
	private String make;
	private String model;
	private String colour;
	private int doors;
	private boolean convertible;


	// usually is public so that people can access to the method
	public void describeCar(){

		System.out.println(doors + "-Door " + 
							colour + " " + make + " "
							+ model + " " + (convertible ? "convertible" :" " ));
	}

	//getters method
	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return this.model;
	}

	public String getColour() {
		return this.colour;
	}

	public int getDoors() {
		return this.doors;
	}

	public boolean getConvertible() {
		return this.convertible;
	}

	public boolean isConvertible() {
		return this.convertible;
	}
	

	// setters method
	public void setModel(String model) {
		this.model = model;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	
}
