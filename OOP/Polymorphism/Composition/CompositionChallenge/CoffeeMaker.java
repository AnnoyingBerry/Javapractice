package Javapractice.OOP.Polymorphism.Composition.CompositionChallenge;

public class CoffeeMaker {

	private boolean hasWorkToDo;

	//method
	public void brewCoffee(){
		if (hasWorkToDo) {
			System.out.println("Brewing Coffee...");
			hasWorkToDo = false;
		}else{
			System.out.println("Doing Dishes");
		}
		
	}


	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}


	
}
