package Javapractice.OOP.Polymorphism.Polymorph.PonlymorphChallenge;

public class Car {

	private String description;

	//constructer
	public Car(String description) {
		this.description = description;
	}

	//method
	public void startEngine() {
		System.out.println("Starting engine!!");
		
		
	}

	public void drive() {
		runEngine();
		System.out.println("Driving " + getClass().getSimpleName());	
	}

	protected void runEngine() {
		System.out.print("Engine Running");	
	}

	public static Car carType(int type){
		switch(type){
			case 1: return new ElectricCar(10,5);
			case 2: return new GasPoweredCar(20, 4);
			case 3: return new HybridCar(10, 20, 5);
			default: return new Car("Unkwnown Car Type");
		}
	}

	
}

class GasPoweredCar extends Car{

	private double avgKMPerLitre;
	private int cylinders;


	public GasPoweredCar(double avgKMPerLitre,int cylinders) {
		super("Gas Powered Car");
		this.avgKMPerLitre =avgKMPerLitre;
		this.cylinders=cylinders;
	}


	@Override
	protected void runEngine() {
		super.runEngine(); 
		System.out.println(" very Slowly");
		
	}


}

class ElectricCar extends Car{
	private double avgKMPerCharge;
	private int batterySize;

	public ElectricCar(double avgKMPerCharge, int batterySize) {
		super("Electric Car");
		this.avgKMPerCharge = avgKMPerCharge;
		this.batterySize = batterySize;
	}

	@Override
	protected void runEngine() {
		super.runEngine();
		System.out.println(" Very Fast");
	}


	
}

class HybridCar extends Car{
	private double avgKMPerLitre;
	private int batterySize;
	private int cylinders;

	public HybridCar(double avgKMPerLitre, int batterySize, int cylinders) {
		super("Hybrid Car");
		this.avgKMPerLitre = avgKMPerLitre;
		this.batterySize = batterySize;
		this.cylinders = cylinders;
	}

	@Override
	protected void runEngine() {
		super.runEngine();
		System.out.println(" Slightly Faster");
	}

	
}