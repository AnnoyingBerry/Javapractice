package Javapractice.FirstJavaFile;

public class conditional {

	public static void main(String[] args){

		Boolean isWrong = true;

		if(isWrong == false){
			System.out.println("hello world");
		}
		else {
			System.out.println("It is True");
		}


		//&& Logical operator

		int topScore = 25;

		if(topScore > 60){
			System.out.println(topScore);
		}

		if((topScore > 30) && (topScore <= 80)){
			System.out.println("Not bad " + topScore);
		
		}else if(topScore > 80){
			System.out.println("Good job " + topScore);
		}else if((topScore == 20) || (topScore == 21)){
			System.out.println("try your best " + topScore);
		}else{
			System.out.println("ooo");
		}

		Boolean isCar = false;
		if(!isCar){  // this means isCar is true '!' means the opposite
		System.out.println("heyy"); // this will be printed
	}

	String makeOfCar = "Ford";
	Boolean isDomestic = (makeOfCar == "Ford") ? false : true;
	
	if (!isDomestic){ // if its isDomestic is false, this condition is true, print out
		System.out.println("Made in Singapore " + isDomestic);
	}

	// java challenge 
	double a = 20.00d;
	double b = 80.00d;

	double c = 100.00d * (a + b);
	System.out.println("doulbe c: " + c);

	double d = (c % 40.00d);
	System.out.println("double d: " + d);

	Boolean isNotRemainder = (d == 0.00) ? true : false;
	System.out.println("bool of remainder: " + isNotRemainder);

	if (!isNotRemainder){
		System.out.println("Boolean 'e' got some remainder: " + isNotRemainder);
	}
	

	}


} 

/*
	if-else statements

	problems:

	it happens because it takes in a boolean condition
	since isCar is assigning it to true and return as a boolean, it will access to the if statement
	Boolean isCar = false;
	if(isCar = true){
		System.out.println("heyy"); // this will be printed
	}

	// tenary operator
	operand 1 ? operand 2 : operand 3

	test if operand 1 is true, returns operand 2 otherwise, return operand 3

	String makeOfCar = "Ford";
	Boolean isDomestic = (makeOfCar == "Ford") ? false : true;
	
	if (isDomestic){
		System.out.println("Made in Singapore" + isDomestic);
	}

	better way of writing

	String s = (isDomestic) ? "This is domestic" : "This is not Domestic";
	System.out.println(s);


*/