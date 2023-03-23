package Javapractice.JavaMethodChallenge;

public class DecimalComparatorE6 {

	/*
		Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
		The method should return boolean and it needs to return true 
		if two double numbers are the same up to three decimal places. Otherwise, return false.

		TIP: Use casting.
	
	*/


	public static void main(String[] args) {

		areEqualByThreeDecimalPlaces(-3.1756, -3.175); //return true
        areEqualByThreeDecimalPlaces(3.175, 3.176);    //return false
        areEqualByThreeDecimalPlaces(3.0, 3.0);        //return true
        areEqualByThreeDecimalPlaces(-3.123, 3.123);   //return false
	}

	public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        int c = (int) (a * 1000);
        int d = (int) (b * 1000);
        
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        
        if(c == d){
			System.out.println("true");
            return true;
        }
		System.out.println("false");
        return false;
        
    }
	
}
