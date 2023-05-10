package Javapractice.dev.lpa2.Abstraction_Generalisation;

import java.util.ArrayList;

public class AbstractionMain {
	public static void main(String[] args) {
		//Animal animal = new Animal("animal","big",100); // cannot initaize an abstract class

		Dog dog = new Dog("Wolf", "big", 100);
		dog.makeNoise();

		doAnimalStuff(dog);

		// it could hold any kind of animals
		// including fish and dog
		// we can have an arraylist of an abstracted type 
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(dog);
		animals.add(new Dog("German Shepard", "big", 150));
		animals.add(new Fish("Goldfish", "small", 1));
		animals.add(new Fish("Barracuda", "big", 75));
		animals.add(new Dog("Pug", "small", 20));

		animals.add(new Horse("Clydesdale", "large", 1000));

		// at runtime, instances/object that inherit from Animals
		// can use polymorphism to execute conde specific to the concrete type
		for (Animal animal : animals) {
			doAnimalStuff(animal);
			if(animal instanceof Mammal currentMammal){
				currentMammal.shedHair();
			}
		}


	}

	private static void doAnimalStuff(Animal animal) {

		/* 
			** Abstraction using Polymorphism techniques

				- An abstract class does not prevent us from using 
					this type in methods, declarations and lists
					anyone can use to call those methods
					as long as the object is an animal,
					meaning it has Animal class in its hierarchy
					this code will work 
		
		*/

		animal.makeNoise();
		animal.move("slow");
	}
	
}
/* 
	**** Abstraction
		*** Abstract Class
			

			** Declaration:
				abstract class Animal{}

			** Cannot have/do:
				- A class that is incomplete
					// it cannot be instantiated
					Animal a = new Animal(); // invalid
			
			** Can have/do:
				* Constructor
					- called by its subclasses during construction

				* Always participates in Inheritance

					// can be concrete
					class Dog extends Animal{} // animal is abstract, dog is concrete
				
				* Abstract class can extend another abstract class
					
					// animal is abstractm Mammal is also abstract
					abstract class Mammal extends Animal{}
				
				* abstract class can extend concrete class

					// BestofBreed is abstract, dog is not
					abstract class BestOfBreed extends Dog{}
			
			*** Abstract method
				- only can be declared on a abstract class or interface
					- e.g. it tells the outside world that all Animals will move
				** Declaration

					abstract class Animal{
						public abstract void move();
					}
				
				- any subclasses that uses Animals can call the method move
				- and the subtype will implement this method with this signature.


	**** Inheritace vs Abstraction
		*** Inheritance
			** Animals was a concrete class
				* Move and makeNoise method had code in their method bodies
			
			** Subclasses have choises when they 'extends' a concrete class with concrete methods
				- They can inherit their behaviour from their parent
				- dont have to declare methods in their class bodies
				- They can override the behavior from their parent, with their own code
				- they can override the behavior but also use their parent;s method code using super();
			
		*** Abstraction
			** When Animals class is abstract, and methods are abstract
				they cant not do what Inheritance with concrete class does
			
			** No concrete method for a subclass to inherit code from
				- subclass must provide a method for any abstract method declared on its parent
				- subclass wont compile, if it does not implement the abstract methods

					
				
				
				
			
			



*/
