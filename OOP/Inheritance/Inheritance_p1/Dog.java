package Javapractice.OOP.Inheritance.Inheritance_p1;

public class Dog extends Animals {

	private String earShape;
	private String tailShape;

	public Dog(){

		super("mutt","Big",50);

	}

	public Dog(String type, double weight){
		this(type,weight,"Perky","curled");
	}

	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight<15 ? "Small": (weight<35 ? "Medium":"Large"), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "]" + "\n" + super.toString();
	}

	//over ridden makeNoise method in animals(super class)
	// if this method was not created, it will just use the one in parent class

	@Override
	public void makeNoise() {
		if(type == "Wolf"){
			System.out.println("ow wooo!");
		}
		
		bark();
		System.out.println();
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		if(speed == "slow"){
			walk();
			wagTail();
		}else{
			run();
			bark();

		}
		System.out.println();

	} 
	
	// if its only called interenally in this class
	// it should be private
	private void bark(){
		System.out.println("Woof! ");
	}

	private void run(){
		System.out.println("Dog's Running! ");
	}

	private void walk(){
		System.out.println("Dog's Walking! ");
	}

	private void wagTail(){
		System.out.println("tail Wagging! ");
	}
	

	
}
