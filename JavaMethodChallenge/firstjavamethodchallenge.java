package Javapractice.JavaMethodChallenge;

public class firstjavamethodchallenge {
	
	public static void main(String[] args) {

		// testing boundaries by using extreme values
		int[] score = {1500,1000,500,100,25};
		String[] name = {"Tim","John","Keem","Joy","Jane"};

		for(int i = 0; i < score.length; i++ ){	

			displayHighScorePosition(name[i], calculateHighScorePosition(score[i]));
		}


	}

	//methods 

	public static void displayHighScorePosition(String name,int pos){
		System.out.println(name+" manage to get in to position " + pos + " on the hight score list");
	}

	public static int calculateHighScorePosition(int score){

		int position = 4;
		if(score >= 1000){
			return position = 1;

		}else if(score >= 500){
			return position = 2;
			
		}else if(score >= 100){
			return position = 3;
		}

		return position;
		

	}
}
