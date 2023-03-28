package Javapractice.FirstJavaFile;

public class controlFlowstatements {
	public static void main(String[] args) {
		
		// switch challenge 1
		char test = 'a';
		switch(test){
			case 'a': case 'A':
				System.out.println("Able");
				break;
			case 'b': case 'B':
				System.out.println("Bravo");
				break;
			case 'c': case 'C':
				System.out.println("Charlie");
				break;
			case 'd': case 'D':
				System.out.println("Dog");
				break;
			default:
				System.out.println("not found");
				break;

		}
		//switch challenge 2
		

		printDayOfWeek(1);
		printDayOfWeek(3);
		printDayOfWeek(7);

		// if-else challenge
		printWeekDay(1);
		printWeekDay(3);
		printWeekDay(7);

		//isprime

		System.out.println("0 is " + (isPrime(0)? "": "NOT ") + "a prime number");
		System.out.println("1 is " + (isPrime(1)? "": "NOT ") + "a prime number");
		System.out.println("2 is " + (isPrime(2)? "": "NOT ") + "a prime number");
		System.out.println("3 is " + (isPrime(3)? "": "NOT ") + "a prime number");

		int primeCounter =0;
		for(int i =0; primeCounter < 5 && i < 1001; i++){
			boolean isPrime = isPrime(i);

			if(isPrime){
				primeCounter++;
				System.out.println("Prime Counter: " + primeCounter);
				System.out.println(i + " is a prime number");
			}
		
		//while loop challenge
		int j = 5;
		int counter = 0;
		while(j <= 20){

			if(counter >= 5){
				break;
			}

			if(isEvenNumber(j)){
				System.out.println(j);
				counter++;
			}
			
			j++;
		}

		}

	}

	// switch challenge 2
	public static void printDayOfWeek(int day) {

		String dayOfWeek = switch (day){

			case 0 -> {yield "Sunday";}
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> "Invalid day";

		}; 

		System.out.println(dayOfWeek);
	}

	//if-else bonus challenge
	public static void printWeekDay(int day) {

		String dayofWeek = "Invalid day";

		if(day == 0){
			dayofWeek ="Sunday";
		}else if(day == 1){
			dayofWeek = "Monday";
		}else if(day == 2){
			dayofWeek = "Tuesday";
		}else if(day == 3){
			dayofWeek = "Wednesday";
		}else if(day == 4){
			dayofWeek = "Thursday";
		}else if(day == 5){
			dayofWeek = "Friday";
		}else if(day == 6){
			dayofWeek = "Saturday";
		}
		
		System.out.println(dayofWeek);
		
	}

	public static boolean isPrime(int wholeNumber){
		
		if(wholeNumber <=2){
			return (wholeNumber == 2); // returns true if == 2 else false, becase -1 0 1 is not prime
		}

		for(int divisor = 2; divisor <= wholeNumber/2; divisor++ ){

			System.out.println("Divisor = " + divisor);
			System.out.println("wholeNumber = " + wholeNumber);
			System.out.println("wholeNumber/2 = " + (wholeNumber/2));
			System.out.println("wholeNumber%divisor: " + (wholeNumber % divisor) );

			if(wholeNumber % divisor == 0){
				
				return false;
			}
		}

		return true;

	}

	//while loop
	public static boolean isEvenNumber(int number) {

		if(number % 2 == 0){
			return true;
		}

		return false;
		
	}
		
}


		




	/*
	
	// switch statement
		- only byte,short,int,char,string,enum data types can be used as value
		* traditional switch statement jdk 8:

			int switchValue = 1;
			switch(switchValue){
				case x:
					//code for value == x
					break;
				case y:
					// code for value == y
					break;
				case z: case a: case:b
					//code for these cases
					//usually when there are many values
					break
				default:
					// code for neither value x or y

			}

			public static String getQuarter(String month){
				switch (month){
					case "Jan":
					case "Feb":
					case "Mar":
						return "1st";
					case "Apr":
					case "May":
					case "Jun":
						return "2nd";
					case "Jul":
					case "Aug":
					case "Sep":
						return "3rd";
					case "Oct": 
					case "Nov"
					case "Dec":
						return "4th"

				}
				return "bad"
			}
		
		* note that "fall through" will happen if there is not "break" statement
			- it means that if any of the case that does not have a break statement, 
				the next case: code block will be excecuted too until it finds a break statment.
		
		* Enhanced switch statement 
		
		public static String getQuarter(String month){

			return switch (month){
				case "Jan","Feb","Mar" -> "1st" // it is interpreted as {yield "1st"} hence we dont need another yield
				case "Apr","May","Jun" -> "2nd" // unless it is in a code block
				case "Jul","Aug","Sep" -> "3rd"
				case "Oct","Nov","Dec" -> "4th"
				default ->{
					String badresposnse = month + " is bad"
					yield badresponse;
					//in this case we cannot use  return statement, yield is an alt return statement
				} 
			};


		}

		}

		//for loop
		for(init;expression(once false will stop processing); increment){
			//code to loop
		}

		//whileloop
		while(expression){
			//code
		}

		int j = 1; // init for control expression to work
		while(j <= 5){
			System.out.println(j);
			j++; // counter to escape while loop
		}

		int j = 1;
		while(true){
			if(j > 5){
				break;
			}
			System.out.println(j);
			j++;
		}

		// do while loop
		- excecute at least once before it check the condition
		- if true it will continue to excecute

		int j =1;
		boolean isReady = false;
		do{
			if(j > 5){
				break;
			}
			System.out.println(j);
			j++;
			isReady = (j > 0);
		} while(isReady);

		int num = 0;
		while (num < 50){
			num += 5;
			if(num % 25 ==0){
				continue; // stop this current iteration and start the next iteration
			}
			System.out.println(num + "_");
		}

		// best practices for local variables

		- only initilize variables when necessary in the narrowest code block
		- 
	*/
	

