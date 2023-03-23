package Javapractice.JavaMethodChallenge;

public class SpeedConverterE2 {
	public static void main(String[] args) {
		int testarr[] = {-2,-25,0,2,-1,-10,0,5,100};
		double testarr2[] = {1.25,95.75,100.4,10.25,15.25,55.75,60.5};

		for(int i = 0; i<testarr.length; i++){
			
			System.out.println("test value: " + testarr[i]);
			printConversion(testarr[i]);
			

		}

		for(int j =0; j<testarr2.length; j++){

			System.out.println("test value: " + testarr2[j]);
			printConversion(testarr2[j]);
			
		}
	}

	public static long toMilesPerHour(double kilometersPerHour){
        
        long results = -1;
        
        if(kilometersPerHour >= 0){
            results = (long) (Math.round(kilometersPerHour/1.609));
        }
        
        return results;
    }
    
    public static void printConversion(double kilometersPerHour){
        
        long convertedValue = toMilesPerHour(kilometersPerHour);
        
        if(convertedValue >= 0){
            System.out.println(kilometersPerHour +" km/h = " + convertedValue + " mi/h" );
        }else{
            System.out.println(convertedValue + " Invalid Value");
        }
        
    }
}
