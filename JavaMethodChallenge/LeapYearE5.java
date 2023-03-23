package Javapractice.JavaMethodChallenge;

public class LeapYearE5 {
	/*
		To determine whether a year is a leap year, follow these steps: 

		1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
		2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
		3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
		4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
		5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false. 
	 
	 */

	public static void main(String[] args) {

		int test[] = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600,1600, 2000, 2400};

		for (int i = 0; i < test.length; i++) {
			
			System.out.println("year:" + test[i]);
			System.out.println("is leap year? : " + isLeapYear(test[i]));
		}
		
	}

	public static boolean isLeapYear(int year){
        
        if((year < 1) || (year > 9999)){
            return false;
        }
        
        int check1 = year % 4;
        int check2 = year % 100;
        int check3 = year % 400;
        
        
        if((check1 == 0) && (check2 == 0) && (check3 == 0)){
            return true;
        }else if ((check1 == 0) && (check2 != 0)){
            return true;
        }
        return false;
        
    }


}
