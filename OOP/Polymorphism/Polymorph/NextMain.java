package Javapractice.OOP.Polymorphism.Polymorph;

public class NextMain {
	public static void main(String[] args) {

		Movie movie = Movie.getMovie("A", "Jaws");
		movie.watchMovie();

		// casting to an adventure object type
		Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
		jaws.watchMovie();

		/* Object comedy = Movie.getMovie("C", "Airplane");
		// the compiler cannot find the method in the object class
		comedy.watchMovie() */;

		Object comedy = Movie.getMovie("C", "Airplane");
		Comedy comedyMovie = (Comedy) comedy;
		comedyMovie.watchMovie();

		/* 
		 	*var
				- special keyword
				- it is to tell java to figure out the compile time type

			* Local Variable Type inference jdk 10
				- improve readability, reduce boilderplate code
				It can't be:
					- used in field declaration on a class
					- used in method signatures,either as a parameter type or return type
					- used without an assignemnt, if not the type cannot be inferred
					- assigned a null literal, type can't be inferred


		*/
		// airplane should be a movie
		var airplane = Movie.getMovie("C", "Airplane");
		airplane.watchMovie();
		
		var plane = new Comedy("Airplane");
		plane.watchComedy();

		/* 
			Evaluate Runtime types
				* instanceof
					syntax: variable 'instanceof' Type
						- left operand is the reference variable that you are testing
						- right operant is the type you are testing
					syntax: variable 'instanceof' Type assignmentvariable
						- 'pattern matching support'
						- it can extract data from object without casting
						- assigned to a binding variable
					- lets you test the type of an object/instance

					
		*/

		Object unknownObject = Movie.getMovie("C", "Airplane");
		//get the name of the class and comapre
		if(unknownObject.getClass().getSimpleName() == "Comedy"){
			Comedy c = (Comedy) unknownObject;
			c.watchComedy();
		}else if(unknownObject instanceof Adventure){ // testing if it is actually an Object from Adventure
			((Adventure) unknownObject).watchAdventure(); // casting
		}else if(unknownObject instanceof ScienceFiction syfy){
			syfy.watchScienceFiction();
		}
	}


	
}
