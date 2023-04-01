package Javapractice.FirstJavaFile;
import java.util.Scanner;

public class Scannersection {

	public static void main(String[] args) {

		//readUserInputChallenge(true);

		maxMinChallenge(0);
		
		
	}

	public static String getInputFromScanner(int currentyear) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hi what is your name");
		String name = scanner.nextLine();

		System.out.println("Hi " + name);
		System.out.println("Enter your YOB ");
		boolean validDOB = false;
		int age =0;
		do{
			System.out.println("Enter a Year of brith >=" + 
				(currentyear - 125) + " and <= " + currentyear);
			try{
				age = checkdata(currentyear, scanner.nextLine());
				validDOB = age < 0 ? false:true;
			}catch(NumberFormatException baduserdata){
				System.out.println("Characters not allowed!!!");

			}
				
		}while(!validDOB);
		scanner.close();
		return "so you are " + age + " years old";

	}

	public static void readUserInputChallenge(boolean trigger) {

		String number = "0";
		int sum = (Integer.parseInt(number));
		int num = 1;

		Scanner scanner = new Scanner(System.in);

		do {

			try {
				System.out.println("Enter Number #" + num + ": ");
				number = scanner.nextLine();
				sum += (Integer.parseInt(number));
			} catch (NumberFormatException baduserData) {
				System.out.println("Invalid Number!!");
			}
			num++;
			
			if(num > 5){
				scanner.close();
				System.out.println("Total: " + sum);
				trigger = false;
			}
		} while (trigger);

	}

	public static void maxMinChallenge(int trigger) {

		String min = "", max="";

		Scanner scanner = new Scanner(System.in);

		do{
			try {
				System.out.println("Enter Min Number: ");
				min = scanner.nextLine();

				System.out.println("Enter Max Number: ");
				max = scanner.nextLine();

			} catch (NumberFormatException nfe) {
				System.out.println("Enter Number only!");
				trigger = 0;
				scanner.close();
			}

			if(Integer.parseInt(max) < Integer.parseInt(min)){
				System.out.println("max cannot be smaller than min!");

			}else{
				trigger = 0;
				scanner.close();
				System.out.println("Min  value: " + min);
				System.out.println("Max  value: " + max);
			}
			
		}while (trigger == 1);

	}

	public static int checkdata(int currentyear, String dateOfBirth) {
		int dob = Integer.parseInt(dateOfBirth);
		int minimumYear = currentyear - 125;
		if((dob < minimumYear) || (dob > currentyear)){
			return -1;
		}
		return (currentyear - dob);

	}
	
}
/*

import java.util.Scanner

// to initialise scanner class
// system.in, is the inputStream that takes in arguments/read from the terminal
Scanner scanner = new Scanner(System.in);

scanner.nextLine(); reads the next line of arguemnts




*/
