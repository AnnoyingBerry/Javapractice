package Javapractice.OOP.Polymorphism.Composition;

public class PersonalComputer extends Products{
	
	private Monitor monitor;
	private Motherboard motherboard;
	private Computercase computerCase;

	public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard,
			Computercase computerCase) {
		super(model, manufacturer);
		this.monitor = monitor;
		this.motherboard = motherboard;
		this.computerCase = computerCase;
	}

	// public Monitor getMonitor() {
	// 	return monitor;
	// }

	// public Motherboard getMotherboard() {
	// 	return motherboard;
	// }

	// public Computercase getComputerCase() {
	// 	return computerCase;
	// }

	private void drawLogo(){
		monitor.drawPixelAt(1200, 50,"Yellow");
	}

	public void powerUp(){
		computerCase.pressPowerButton();
		drawLogo();
	}

	

	
}
