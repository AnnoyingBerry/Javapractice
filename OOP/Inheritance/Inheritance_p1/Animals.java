package Javapractice.OOP.Inheritance.Inheritance_p1;

public class Animals {

	// protected - let any subclass access this field
	protected String type;
	private String size;
	private double weight;

	//constructor
	public Animals(){

	}

	public Animals(String type, String size, double weight){
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	//tostring
	@Override
	public String toString() {
		return "Animals [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}

	
	public void move(String speed){
		System.out.println(type +" moves " + speed);
	}
	
	public void makeNoise(){
		System.out.println(type + "make some kind of noise");;
	}

}
