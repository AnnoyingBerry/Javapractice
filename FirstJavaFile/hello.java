package Javapractice.FirstJavaFile;

public class hello {
	public static void main(String[] args) {
		 
		// ctl + K + C, comment out codes, ctrl+K+U uncomment out codes

		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(Integer.MIN_VALUE);

		// System.out.println(Short.MAX_VALUE);
		// System.out.println(Short.MIN_VALUE);

		// System.out.println(Byte.MAX_VALUE);
		// System.out.println(Byte.MIN_VALUE);

		// System.out.println(Long.MAX_VALUE);
		// System.out.println(Long.MIN_VALUE);

		// System.out.println(Float.MAX_VALUE);
		// System.out.println(Float.MIN_VALUE);

		byte a = 50;
		short b = 20000;
		int c = 40000;

		long d = (50000L) + (10L * (a + b + c));


		System.out.println(d);
		
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

 /*

	//float 
	Float.MIN_VALUE
	Float.MAX_VALUE

	suffix "f" can be lower or upper case

	10.0f  


	//double
	is more precise than float
	Double.MIN_VALUE
	Double.MAX_VALUE

	Java default is double because it is more precise

	//char
	it is a 2 byte number(unicode) in the memory or 16 bits just to store one character

	when it is printed it will not show the representating number but character

	exameple 'd' is part of a unicode

	char myUnicode = '\u0044' -> this will print 'D' remember to add backslash to print unicode

	char myDecimalcode = '68' -> result in 'D' too
	
	//boolean

	either true or false, yes or no , 1 or 0

	//String 
	is a class not a primitive type

	it is a little different from other wrapper class

	limited to the memory/heap space in our pc

	which is max_value of our int

	"+" means concatination in String

	String is immutable meaning it's content cant be change after it is created,
	instead java will create a new String in the memory each time

	when you try to concat, java will create a new String in the memory and discard the old one automatically.



 */
/*
	Operators

	* / + - %

	Char letterA = 'A' + 'B' = 131
	// it is because it is saved as a unicode number in the memory which is 66+65 = 131

	//post-increment

	result = result +1 // is the same as
	result++ //this
	result+=1 // and this

	// Post-decrement
	result = result - 1
	result-=1
	result--

	// Multiplication conpound assisngment operator
	result *= 1
	result = result * 1

	// division conpound assisngment operator 
	result /= 1
	result = result / 1

	//issues

	int results = 10
	results -= 5.5
	System.out.println(results) // output is 4
	
	int results = 10
	results = results - 5.5 
	System.out.println(results) // error lossy conversion from double to int

	int results = 10
	results = (int) (results - 5.5)
	System.out.println(results) // output 4

	usually
	!! x -= y
	is 
	x = x - y

	but it only works if its the same data type

	but it is actually

	x = (data type of x) (x - y)

 
 */

