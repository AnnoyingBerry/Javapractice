package Javapractice.OOP.Polymorphism.Polymorph;

public class Movie {

	private String title;

	public Movie(String title) {
		this.title = title;
	}

	//method
	public void watchMovie(){

		/*
			* getClass() - java.linked.object
			 	- returns class type information about the runtime object
					on which this method is executing
			
				*getSimpleName() - java.linked.object
					- return the name of the class
		*/
		String instanceType = this.getClass().getSimpleName(); // method chaining
		System.out.println(title + " is a " + instanceType + " film");
	}

	public static Movie getMovie(String type, String title){
		// Factory method, software designing patterns
		// a way to get an object without having to know the details of how
		// to create a new one, or specify the class we want
		return switch (type.toUpperCase().charAt(0)) {
			case 'A' -> new Adventure(title);
			case 'C' -> new Comedy(title);
			case 'S' -> new ScienceFiction(title);
			default -> new Movie(title);
		};
	}
	
}

class Adventure extends Movie{


	public Adventure(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		
		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3), "Pleasant Scene",
							"Scary Music", "Something Bad Happens");
	}

	public void watchAdventure() {
		System.out.println("Watching an Adventure!");
	}


}

class Comedy extends Movie{


	public Comedy(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		
		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3), "Someting Funny happens",
							"SSomething even funiier happens", "Happy Ending");
	}

	public void watchComedy() {
		System.out.println("Watching an Comedy!");
	}

}

class ScienceFiction extends Movie{


	public ScienceFiction(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		
		super.watchMovie();
		System.out.printf(".. %s%n".repeat(3), "Bad Aliens do Bad stuffs",
							"Space Guys Chase Alients", "Planet Blows Up");
	}

	public void watchScienceFiction() {
		System.out.println("Watching an Science Friction!");
	}

}




