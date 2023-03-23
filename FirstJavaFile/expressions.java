package Javapractice.FirstJavaFile;

public class expressions {

	public static void main(String[] args) {

		calculateScore(true,1000,100,500);
	}

	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		int finalScore  = score;

		if(gameOver){
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("your final score was: " + finalScore);


		}

	}

	
}
/*
	// methods

	- is a way to reduce duplicate codes
	- invoked, passed a fixed number of values as arguments
	- create a re-usable code just once 
	
	public static void methodName(){

		// public - access modifier 
			- accessable from the outside world 

		// void - return's nothing ( usually a data type)
			- usually a data type that you are returning

		// static
			- can be access using a class name

		//invoking/calling a method
		calculateScore();
		calculateScore(5,"7"); if there are parameters/arguments

		//psvm short form for public static void main method

	}
 
*/
