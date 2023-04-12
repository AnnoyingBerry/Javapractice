package Javapractice.OOP.Inheritance.Inheritance_p1;

public class Main1 {

	public static void main(String[] args) {
		Animals animal = new Animals("Generic","Huge",400);
		doAnimalStuffs(animal,"slow");

		Dog dog = new Dog();
		doAnimalStuffs(dog, "fast");

		Dog yorkie = new Dog("Yorkie",15);
		doAnimalStuffs(yorkie, "fast");

		Dog retriever = new Dog("Labourer Retriever",65,"Floppy","Swimmer");
		doAnimalStuffs(retriever, "slow");

		Dog wolf = new Dog("Wolf",40);
		doAnimalStuffs(wolf, "slow");

		Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
		doAnimalStuffs(goldie, "fast");
	}

	public static void doAnimalStuffs(Animals animals,String speed ) {
		animals.makeNoise();
		animals.move(speed);

		System.out.println(animals);
		System.out.println("_ _ _ _");
		
	}
	
}
