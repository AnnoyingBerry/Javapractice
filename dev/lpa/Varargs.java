package Javapractice.dev.lpa;

public class Varargs {

	public static void main(String... args) {
		// split the string into parts and store in an array with a delimiter
		String[] splitStrings = "Hello World Again".split(" ");
		printText(splitStrings);

		/* 
			can take multiple String values and telling the code
			to form into an array and process them, it will not form an error
			https://www.programiz.com/java-programming/varargs
		*/
		System.out.println("_".repeat(20));
		printText("Hello");
		
		System.out.println("_".repeat(20));
		printText("Hello","World","Again");

		System.out.println("_".repeat(20));
		printText();

		String[] sArray = {"first","Second","third","fourth"};
		System.out.println(String.join(",",sArray));

		/* 
			compared to a String[] as parameter arguments
			it will form an error if its not an actual array itself
		*/

		printText1(splitStrings);

		//both of this is not an array but only a string value
		// printText1("hello"); // does not work
		// printText("Hello","World","Again"); // does not work



	}

	private static void printText(String... textList) {

		for(String t : textList){
			System.out.println(t);
		}
	}

	private static void printText1(String[] textList) {

		for(String t : textList){
			System.out.println(t);
		}
	}
	
}
/* 
	*** Variable Arguments - Varargs
		- Java will take zero,one or many Strings as arguments
		- Java will create an array to process them in the method

		** Restrictions
			* There can only be one variable argument in a method
			* The variable arguemtn must be the last argument

		
	// takes an array of a datatype
	public static void main(String... args) {
	
	}


*/
