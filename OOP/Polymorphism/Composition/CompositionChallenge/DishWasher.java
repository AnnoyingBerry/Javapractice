package Javapractice.OOP.Polymorphism.Composition.CompositionChallenge;

public class DishWasher {

	private boolean hasWorkToDo;

	public void doDishes() {
		if(hasWorkToDo){
			System.out.println("Doing Dishes");
			hasWorkToDo = false;
		}
		else{
			System.out.println("Dishwasher doing nothing");
		}
		
	}

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
		
	}
	
}
