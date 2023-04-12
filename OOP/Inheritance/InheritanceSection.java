package Javapractice.OOP.Inheritance;

public class InheritanceSection {

	public static void main(String[] args) {
		
		/*
			String formatting options
			https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#dt

		*/

		int age = 35;
		System.out.printf("Age = %d %n",age);

		int birthYear = 2023 - age;
		System.out.printf("Birth year = %d %n", birthYear);
		System.out.printf("Birth year = %f %n", (float) birthYear);
		System.out.printf("Birth year = %.2f %n", (float) age);

		for(int i=1; i<=100000; i*= 10){
			// print out formated to the right becuase there are 6 '0'
			System.out.printf("Printing append right %6d %n",i);

		}

		for(int i=1; i<=100000; i*= 10){
			// print out formated to th left
			System.out.printf("Printing append left %d %n",i);

		}

		String formattedString = String.format("your Age is %d", age);
		System.out.println(formattedString);

		formattedString = "Your Age is %d".formatted(age);
		System.out.println(formattedString);

		//String class
		System.out.println("---------------");
		printInformation("hello world");
		printInformation("");
		printInformation("   ");

		String helloworld = "Hello World";
		System.out.printf("index of r = %d %n", helloworld.indexOf('r'));
		System.out.printf("index of world = %d %n", helloworld.indexOf("world"));

		System.out.printf("index of r = %d %n", helloworld.indexOf('l'));
		System.out.printf("index of world = %d %n", helloworld.lastIndexOf('l' ));

		System.out.printf("index of r = %d %n", helloworld.indexOf('l',8));
		System.out.printf("index of world = %d %n", helloworld.lastIndexOf('l',8));

		//string comparison methods
		String helloworldLower = helloworld.toLowerCase();

		if(helloworld.equals(helloworldLower)){
			System.out.println("Values match exactly");
		}
		if(helloworld.equalsIgnoreCase(helloworldLower)){
			System.out.println("Values match ignoring case");
		}
		if(helloworld.startsWith("Hello")){
			System.out.println("String starts with Hello");
		}
		if(helloworld.endsWith("World")){
			System.out.println("String ends with world");
		}
		if(helloworld.contains("World")){
			System.out.println("String contains world");
		}
		if(helloworld.contentEquals("Hello World")){
			System.out.println("Values match exactly");
		}

		/*
			**Stirng manipulation methods

				* String clean up methods
					- indent (jdk 15) -> add/remove spaces from the beginning of lines of multiline text
					- strip,stripLeading,stripTrailing,trim
					- toLowerCase(), toUpperCase

				* String tranformation
					- conat (similar to plus operator)
					- join (join multiple strings together in a single method, with a delimiter)
					- repeat
					- replace,replaceAll,replaceFirst
					- subString,subSquence
		*/

		String birthDate = "25/11/1982";
		int startingIndex = birthDate.indexOf("1982");
		System.out.println("startingIndex = " + startingIndex);
		System.out.println("Birth year = " + birthDate.substring(startingIndex));

		System.out.println("Month = " + birthDate.substring(3,5));
		
		String newDate = String.join("/", "25","11","1983");
		System.out.println("new date = " + newDate);

		//uses character/string
		System.out.println(newDate.replace("/", "-"));

		// uses regular expressions
		System.out.println(newDate.replaceFirst("/", "-"));
		System.out.println(newDate.replaceAll("/", "---"));

		//repeat
		System.out.println("ABC\n".repeat(3));
		System.out.println("-".repeat(20));


		System.out.println("ABC\n".repeat(3).indent(8));
		System.out.println("-".repeat(20));

		System.out.println("    ABC\n".repeat(3).indent(-2));
		System.out.println("-".repeat(20));


	}
	
	public static void printInformation(String string) {

		int length = string.length();

		System.out.printf("length = %d%n",length);

		if(string.isEmpty()){
			System.out.println("String is Empty!");
			// exit out of this method
			return;
		}

		if(string.isBlank()){
			System.out.println("String is Blank!");
		}

		System.out.printf("First Character = %c%n",string.charAt(0));
		System.out.printf("Last Character = %c%n",string.charAt(length-1));

		System.out.println("---------------");


		
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
			* Instance Members - each object may have a different value stored for the fields

				e.g.
						class Dog{
							private String name // instance variable

							public Dog(String name){
								Dog.name = name;
							}

							public void printName(){
								System.out.println("name = " + Dog.name); // use Dog.name is easier to understand
							}
						}

						public class main{
							pubic static void main(String[] args){
								Dog rex = new Dog("rex"); // each instance/object has its own values,class or state.
								Dog fluffy = new Dog("fluffy"); 
								rex.printName(); // prints rex
								fluffy.printName(); // prints fluffy

							}
						}

			* Static members - only one copy in memory , and this value is associated with the class or template iself
				- cant be dependent on one object state, so it cant reference any instance members
				* Static variables
					- General usage:
						- Storing constant values e.g. PI
						- Storing counters
						- Generating unique IDs
						- Creating and Controlling access to a shared resource
					- best practice is to use class name to access the static variable
						e.g. Bank.interestRate
					- bad practice 
					
					e.g.
						class Dog{
							private static String name // static variable

							public Dog(String name){
								Dog.name = name;
							}

							public void printName(){
								System.out.println("name = " + Dog.name); // use Dog.name is easier to understand
							}
						}

						public class main{
							pubic static void main(String[] args){
								Dog rex = new Dog("rex");
								Dog fluffy = new Dog("fluffy"); 
								rex.printName(); // prints fluffy
								fluffy.printName(); // prints fluffy

							}
						}
			* Static Methods
				- can't access instance methods or variables directly
				- usually dont require data from an instance class 'this'
				class Calculator{
					public static void printSum(int a, int b){
						System.out.println("Sum = " + ( a + b) );
					}
				}

				public class main{
					public static void main(String[] args){

						// dont require 'New'/object/instance to use
						Calculator.printSum(5,6); // called by using className.methodName(); 
						printHello(); // methodName(); if its in the same calss

					}

					public static void printHello(){
						System.out.println("hello");
					}
				}
					
					

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

		* toString()
			- a special method in java
			- it allows your to print out the current state of the object
			- 
		* Annotation
			- it always with a '@' symbol e.g. @override
			- type of metadata
				- Meta data is

		
	** Inheritance
		E.g. Animals is the base class, Dog is the sub-class
			- a child can only have a one direct parent class
			- the child will inherit the parent's atrributes and methods
			

		* extends ( java key word);
			- use to tell the compiler which is the parent class
		
		* super()
			- it is something like using this() method.
			* calling constructor:
				- Dog classes constructor:
					public Dog(){
						//if empty, java will implicity call the default constructor of animal
						super(); // this is hidden if nothing was declared 

					}

					@override
					public void toString(){
						super.toString(); // it can inherit from parent class, 
										// and it can override the parent class
					}

					- if method was created, it will override the super class method,
						if its the same name/type.
				it will inherit animals constructor,methods and attributes/variables
		
			*Overriding method
					- create a method in subclass, which have same method signature as the super class
					- it can implement a different  behaviour(method), overriding the parent class behaviour(method)
					- it can simpily call the parent class method (even if the method is not created), or super.methodName(if any);
					- it can call parent class method and also implement additional things in the method
						- inherited methods can be overriden only in child classes
					- you cannot override static methods, only instance methods
					- The child method cannot have more restrctive access privilages
						e.g. protected parent's method cannot be overwritten by private child method. public would be allowed in this case.
					- constructors and private methods cannot be overriden 
					- methods are final cannot be overriden

		* Covariant return type
			- return type of an overriden method can be the same type as parent method declaration
			- but it can be a subclass

			e.g. 
					// parent class
					public class Parent {
						private String type;
						private int num;

						
						public Parent(String type, int num) {
							this.type = type;
							this.num = num;
						}

						public String getType() {
							return type;
						}

						public int getNum() {
							return num;
						}
						
						public void parMethod() {
							System.out.println("Parent method");
						}
						
						public Parent createNewObject(String type, int num) {
							System.out.println("parent-class-create");
							return new Parent(type, num);
						}
						
						@Override
						public String toString() {
							System.out.println("parent-class-sysout");
							return "Parent [type=" + type + ", num=" + num + "]";
						}
					}
						
						
					// child class
					public class Child extends Parent {
						
						private int age;
						
						public Child(String type, int num,int age) {
							super(type, num);
							this.age=age;
						// TODO Auto-generated constructor stub
						}
						
						public int getAge() {
							return age;
						}
						
						public void ChildMethod() {
							System.out.println("Child method");
						}
						
						@Override
						public Child createNewObject(String type, int num) {
							int age = 8;
							Child child = new Child(type, num, age);
							System.out.println("child-class-create");
							return child;
						}
						
						@Override
						public String toString() {
							System.out.println("child-class-sysout");
							return "Child [age=" + age + ", type=" + getType() + ", num=" + getNum();
						}
					}
						
						
					// line 304 of child-class is overriding line 271 of parent-class
					// the return types are different: Child - Parent
					// this is possible because class Child is a subtype of class Parent


			
				
		

		
	
			



*/
