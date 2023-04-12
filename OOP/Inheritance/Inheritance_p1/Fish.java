package Javapractice.OOP.Inheritance.Inheritance_p1;

public class Fish extends Animals {

	private int gills;
	private int fins;


	public Fish(String type, double weight, int gills, int fins) {
		super(type, "small", weight);
		this.gills = gills;
		this.fins = fins;
	}

	private void moveMuscle(){
		System.out.println("Muscle Moving");
	}

	private void moveBackFin(){
		System.out.println("Backfin Moving");
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		moveMuscle();
		if(speed == "fast"){
			moveBackFin();
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + "]" + "\n" +
			super.toString();
	}

	
	


	


	
}
