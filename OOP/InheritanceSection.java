package Javapractice.OOP;

public class InheritanceSection {

	public static void main(String[] args) {
		
	}
	
}

/*

	** This keyword
		- refers to the instance/object that was created when initialised
		- refernce name for the object/instance to discribe itself
	** Objects
		real world objects:
			- a computer
			- keyboard
			- microphone
			- sheleves
			- door
		Has 2 major components:
			* State
				- e.g. a computer has 
					- amount of ram
					- operating system
					- hard drive size
					- size of monitor
				- e.g. a ant has
					- the age
					- the conscious state
					- number of legs
					- sleeping or awake
			* Behavior - an action that could be perform by an object
				- e.g. a computer has
					- booting up
					- shutting down
					- beeping, output of sound
					- drawing something on screen
				- e.g. a ant has
					- eating
					- drinking
					- fighting
					- carrying food
	
	** Class - describe as data(fields) and behavious(methods)
		* Class members - field,method or type of dependent element
			* Intance Members - each object may have a different value stored for the fields

			* Static members - only one copy in memory , and this value is associated with the class or template iself
				- cant be dependent on one object state, so it cant reference any instance members
				

		* Packages - Logical organized groupings of classes
		* Top-level class- only if its define in the source code file , and not enclosed in a code block of another class,type or method

		*Access Modifiers 
			* Public
				- any other class in any package can access this class
			* Private
				- the class is only accessible within the class
			* none declared (default)
				- the class is only accessible within classes and within package
			* Protected
				- allows some classes,subclasses in the same or other packages to have access	
		usually you want to keep all things private

		* Analogy : Building a House
			Class - is a blueprint of the house
			Object/instance of a class(house in this case) - each house we build ('new' operator)
				- you only can access object by using a reference variable
			Location/address - each house has a location/address
			* Reference
				- we give others our address(maybe on a piece of papaer e.g.)
				- we can copy many this address many times but there is only one house
				- we copy the address on the paper not the house itself

	** Encapsulation
		- bundling behaviour and atrributes on a single object
		- hiding fields, and methods from pubic access (each with degrees of access allowed)
		- not allowing people to access the field/attribute directly
		- setting up a controlled way for others to set up the data on the object
		* Set method
			- usually you will have validations here so that you cant make invalid objects
			- a way to manupulate certain attributes within the object
		* get method
			- a way to retrieve infomation about a certain attribute from the object
	
	** Constructors
		- same name as the class name
		- a special code block that looks like a method
		- doesnt return any values
		- you can have access modifiers 
		

		public class Account{
			public Account(){ // a constructors

			}
		}

		- on default java will create a empty constructor, if
			nothing is declared

		- it is in byte code, generated during compilation
		- if there is constructors declared, 
			the compliation will no generate a default

		* Constructor overloading
			- the number of parameters can be different from each constructors
			- if the number of parameters is the same, their type or orders must differ

		

		
	
			



*/
