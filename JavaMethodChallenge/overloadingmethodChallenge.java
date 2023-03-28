package Javapractice.JavaMethodChallenge;

public class overloadingmethodChallenge {

	public static void main(String[] args) {
		System.out.println("68 inch = " + convertToCentimeters(68));
		System.out.println("5 feet 8 inch = " + convertToCentimeters(5, 8));

	}

	public static double convertToCentimeters(int inches) {

		double result = 0d;

		// 1 inch = 2.54cm
		if(result >= 0){
			result = inches * 2.54;
		}
		return result;
		
	}

	public static double convertToCentimeters(int feet,int inches) {

		double result = 0d;

		//1 foot = 12 inch
		inches += (feet*12);

		result = convertToCentimeters(inches);

		return result;
		
	}
	
}
