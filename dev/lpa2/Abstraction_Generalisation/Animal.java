package Javapractice.dev.lpa2.Abstraction_Generalisation;

abstract class Mammal extends Animal{
	/* 
		*** An abstract class do not need to implement abstract methods

			* it can implment all of the parent's class methods
			* it can implement some
			* it can implement none
			* it can include additional methods, which subclasses will have to implement both


	*/
	public Mammal(String type, String size, double weight) {
		super(type, size, weight);
		
	}

	@Override
	public void move(String speed) {
		System.out.print(getExplicitType() + " ");
		System.out.println(speed.equals("slow")? "walks":"runs");
		
	}

	public abstract void shedHair();
	
	
}
public abstract class Animal {

	// subclasses can access this directly
	protected String type;
	// require getter methods
	private String size;
	private double weight;

	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	// abstract methods cannot be private
	// because subclasses have to declare this method
	public abstract void move(String speed);
	public abstract void makeNoise();

	//concrete methods can be declared here
	// method can be overriden without final keyword
	public final String getExplicitType() {
		return getClass().getSimpleName() + " (" + type + ")";
	}

}
