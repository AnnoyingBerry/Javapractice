package Javapractice.OOP.Polymorphism.Composition.CompositionChallenge;

public class Refrigerator {

	private boolean hasWorkToDo;

	public void orderFood() {

		if(hasWorkToDo){
			System.out.println("Ordering Food");
			hasWorkToDo = false;
		}else{
			System.out.println("Refrigerator doing nothing");
		}
		
	}

	//setters
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	
	
}
