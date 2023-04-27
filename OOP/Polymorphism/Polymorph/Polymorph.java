package Javapractice.OOP.Polymorphism.Polymorph;
import java.util.Scanner;


public class Polymorph {

	public static void main(String[] args) {
	
		// Movie theMovie = new Adventure("Star Wars");
		// theMovie.watchMovie();

		// Movie theMovie = Movie.getMovie("Sceince", "Star Wars");
		// theMovie.watchMovie();

		Scanner s = new Scanner(System.in);

		while(true){
			System.out.println("Enter Type (A for Adventure, C for Comedy, "
								+ "S for Sceince Fictron, or Q to quit): ");
			String type  = s.nextLine();
			// if it contains upper or lower letter Q, break the loop
			if("Qq".contains(type)){
				break;
			}
			System.out.println("Enter Movie Title: ");
			String title = s.nextLine();
			Movie movie = Movie.getMovie(type, title);
			movie.watchMovie();
		}
		/*
			we can see here that the code here called the method(watchMovie())
			in the Movie class, using the movie reference variable.
			but in runtime, the Movie was not a Movie but an object of the subclass
			and it was using a method that was overriden in the subclass

			compiled code never knew anything about the subclasses. but at runtime,
			it knew which subclass to call
		*/
	


		

	}
	
}

/*
	**Polymorphism - many forms
		- Each object have different behaviour at runtime
		- The behavour depends on the type of the object
		- it might be different than the declared type
		- The declared type has to have some form of relationship
			to the runtime type
		- inheritance is one way to have this relationship


	** Package
		- A package is a namespace that organizes a set of related types.
		- A package corresponds to a folder or directory, on the operating system, but this isn't a requirement.
		- The package structure is hierarchical, meaning you group types in a tree fashion.
			- e.g java.lang,java.util

		* The import statement has to be declared before any class or type declarations, but after any package statement.
		* Common practices e.g. company name is abscompany.com
			- package name : com.abccompany. (reverse domain)





	


		



*/
