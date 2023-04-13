package Javapractice.OOP.Polymorphism.Composition.CompositionChallenge;

public class SmartKitchen {

	private CoffeeMaker brewMaster;
	private DishWasher dishWasher;
	private Refrigerator iceBox;

	
	//constuctors
	public SmartKitchen() {
		brewMaster = new CoffeeMaker();
		dishWasher = new DishWasher();
		iceBox = new Refrigerator();
	}

	//methods
	public void addWater() {
		brewMaster.setHasWorkToDo(true);
	}
	public void pourMilk(){
		iceBox.setHasWorkToDo(true);
	}

	public void loadDishwasher() {
		iceBox.setHasWorkToDo(true);
	}


	public void setKitchenState(boolean addWater,boolean pourMilk,boolean loadDishwasher) {
		brewMaster.setHasWorkToDo(addWater);
		iceBox.setHasWorkToDo(pourMilk);
		iceBox.setHasWorkToDo(loadDishwasher);
	}

	public void doKitchenWork() {
		brewMaster.brewCoffee();
		dishWasher.doDishes();
		iceBox.orderFood();
		
	}

	//getter
	public CoffeeMaker getBrewMaster() {
		return brewMaster;
	}
	public DishWasher getDishWasher() {
		return dishWasher;
	}
	public Refrigerator getIceBox() {
		return iceBox;
	}

	
}
