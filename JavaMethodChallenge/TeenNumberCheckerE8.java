package Javapractice.JavaMethodChallenge;

public class TeenNumberCheckerE8 {
	/*
		We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

		Write a method named hasTeen with 3 parameters of type int.

		The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.


		EXAMPLES OF INPUT/OUTPUT:

		hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19

		hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19

		hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19


		Write another method named isTeen with 1 parameter of type int.

		The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

		EXAMPLES OF INPUT/OUTPUT:

		isTeen(9);  should return false since 9 is in not range 13 - 19

		isTeen(13);  should return true since 13 is in range 13 - 19 
	*/
	public static void main(String[] args) {
		hasTeen(13, 99, 1);
		hasTeen(20, 10, 9);
		isTeen(12);
		isTeen(13);
	}

	public static boolean hasTeen(int a,int b, int c){
        
        if((a >= 13) && (a <= 19)){
            System.out.println("Has a teen");
            return true;
        }
        
        if((b >= 13) && (b <= 19)){
            System.out.println("Has a teen");
            return true;
        }
        
        if((c >= 13) && (c <= 19)){
            System.out.println("Has a teen");
            return true;
        }
        
        System.out.println("Do not have a teen");
        return false;
        
    }
    
    public static boolean isTeen(int a){
        
        if((a >= 13) && (a <= 19)){
            System.out.println("is a teen");
            return true;
        }
        System.out.println("It is not a teen");
        return false;
        
    }
	
}
