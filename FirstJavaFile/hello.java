package Javapractice.FirstJavaFile;

public class hello {
	public static void main(String[] args) {
		 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		}
}

/*
	Wrapper class
	For all 8 primitive data types
	Byte,Integer,Character,Long,Boolean,Float,Double,Short
	- comes under java.util
	- converts primitive data's into objects

	Integer requires 16 bit memory
	methods:  Integer.MIN_VALUE,Integer.MAX_VALUE

	java only pass-by-value

	which means 

	values inside a function will only stay inside the function and not somewhere elze when called, unless assigned

	int count = 0
	incrementalcount(count)
	System.out.println(count) // this will output 0

	//byte 8 bit
	takes up less space, quicker to access
	document things we know its gonna be small, expected results, know what is going to happen stuffs

	//short requires 32 bit memory space
	-32768 to 32767
	same overflow and underflow issue

	//Long has a 64 bit width(size)

	long number=100L; 

	"L" is necessary to tell java that it is a long number and not an int
	java by default will treat numbers as an int unless specified


	//declaring data types in single statement
	- can not declare multiple data type in a single statement
	byte a, int b; (nono)
	
	- you can declare multiple variable with same data type in a single statement
	byte a; int b; (yes)
	byte a; b; (yes)
	btye a=1, byte b =2; (NONO)

	//Casting
	int number = (myMinmumByteNumber/2); //works because its an int

	short number = (myMinShortNum/2); // this will not work  because the value is int(java default), variable is short

	byte number = (byte) (myMinmumByteNumber/2); 
	- on default, java treat it as int, hence casting is needed to tell java to treat it as byte


 */