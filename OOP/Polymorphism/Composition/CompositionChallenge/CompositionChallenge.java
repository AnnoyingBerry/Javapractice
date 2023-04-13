package Javapractice.OOP.Polymorphism.Composition.CompositionChallenge;

public class CompositionChallenge {
	public static void main(String[] args) {

		SmartKitchen thesmart = new SmartKitchen();

		// thesmart.getDishWasher().setHasWorkToDo(true);
		// thesmart.getBrewMaster().setHasWorkToDo(true);
		// thesmart.getBrewMaster().setHasWorkToDo(true);

		// thesmart.getDishWasher().doDishes();
		// thesmart.getIceBox().orderFood();
		// thesmart.getBrewMaster().brewCoffee();

		thesmart.setKitchenState(true, true, false);
		thesmart.doKitchenWork();

	}
}
