package Javapractice.JavaMethodChallenge;

public class PositiveNegativeZeroE1 {

	public static void main(String[] args) {
		
		int test[] = {1,3278,-1,-14,0};

		for(int i = 0; i<test.length;i++){
			checkNumber(test[i]);
		}
	}

	public static void checkNumber(int number){
        
        if(number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
	}
	
}
