package Javapractice.JavaMethodChallenge;

public class MegaBytesConverterE3 {
	public static void main(String[] args) {
		
		int test[] = {-1024,-1,-2050,0,1024,2050,3000};

		for(int i=0;i<test.length;i++){

			printMegaBytesAndKiloBytes(test[i]);
		}

	}


	public static void printMegaBytesAndKiloBytes(int kiloBytes){
        
        int KB = (kiloBytes % 1024);
        int MB = Math.round(kiloBytes/1024);
        
        if(kiloBytes >= 0){
            System.out.println(kiloBytes  + " KB = " + MB + " MB " + "and " + KB + " KB" );
        }else{
            System.out.println("Invalid Value: " + kiloBytes);
        }
	}

        
}
