package Javapractice.dev.lpa2.Abstraction_Generalisation;

public class Fish extends Animal{

	public Fish(String type, String size, double weight) {
		super(type, size, weight);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void move(String speed) {
		if(speed.equals("slow")){
			System.out.println(getExplicitType() + " Lazily swimming");
		}else{
			System.out.println(getExplicitType() + " darting frantically");
		}
	}

	@Override
	public void makeNoise() {
		if (type == "Goldfish"){
			System.out.print("swish! ");
		}else {
			System.out.print("splash! ");
		}
	}

	
}
