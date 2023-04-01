package Javapractice.JavaMethodChallenge;
/*
	Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal. 

	The parameter bigCount represents the count of big flour bags (5 kilos each).

	The parameter smallCount represents the count of small flour bags (1 kilo each).

	The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

	Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.

	If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.

	If any of the parameters are negative, return false.


	EXAMPLE INPUT/OUTPUT:

	* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

	* canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

	* canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.

	* canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 

	* canPack (-3, 2, 12); should return false since bigCount is negative.


*/

public class FlourPackerE25 {

	public static void main(String[] args) {

		System.out.println("can i pack? : " + canPack (3, 15, 27));
		System.out.println("---------------------------------------------------------\n");
		System.out.println("can i pack? : " + canPack (1, 0, 5));
		System.out.println("---------------------------------------------------------\n");
		System.out.println("can i pack? : " + canPack (0, 5, 4));
		System.out.println("---------------------------------------------------------\n");
		System.out.println("can i pack? : " + canPack (2, 2, 11));
		System.out.println("---------------------------------------------------------\n");
		System.out.println("can i pack? : " + canPack (-3, 2, 12));
		System.out.println("---------------------------------------------------------\n");
		System.out.println("can i pack? : " + canPack (2, 1, 5));
		System.out.println("---------------------------------------------------------\n");

	}

	public static boolean canPack(int bigCount, int smallCount, int goal){
        
		// if invalid numbers or no goals
        if(bigCount < 0 || smallCount < 0 || goal <= 0){
            return false;
        }
		// if all there are no bags but there is a goal
		if(bigCount == 0 && smallCount == 0 && goal != 0){
			return false;
		}
        
        int noOfBigPacks = goal/5;
		System.out.println("noOfBigPacks: " + noOfBigPacks);
        int noOfSmallPacks = goal%5;
		System.out.println("noOfsmallPacks: " + noOfSmallPacks);
		System.out.println("\n");
        int leftoverBigPacks = 0;
		int leftoverSmallPacks = 0; // to see if there are additional leftover packs
		int weightCounter = 0; // the main condition to check the goal
		
        
        // to see how many bigCount possible pack i can fit in 5kg
        if( (noOfBigPacks) > 0 ){
            
            //check if there are unfufiled leftovers and bring over to small pack
            if(bigCount < noOfBigPacks){
                leftoverBigPacks = noOfBigPacks - bigCount;
				weightCounter = bigCount * 5;
				System.out.println("leftoverBigPacks<: " + leftoverBigPacks);
				System.out.println("WeightCounter<: " + weightCounter);
				System.out.println("\n");
            }else if (bigCount > noOfBigPacks){
                leftoverBigPacks = bigCount - noOfBigPacks;
				weightCounter = noOfBigPacks * 5;
				System.out.println("leftoverBigPacks>: " + leftoverBigPacks);
				System.out.println("WeightCounter>: " + weightCounter);
				System.out.println("\n");
            }else if(bigCount == noOfBigPacks){
				weightCounter = noOfBigPacks * 5;
				System.out.println("WeightCounter=: " + weightCounter);
				System.out.println("\n");
			}
			//calculate the number of small packs needed to fufil the goal
			noOfSmallPacks += (leftoverBigPacks*5);
        }

		// calculate the to see if the leftover could fufil the goal
		if(noOfSmallPacks > 0){

			if(smallCount < noOfSmallPacks){
				leftoverSmallPacks = noOfSmallPacks - smallCount;
				weightCounter += smallCount;
				System.out.println("leftoverSmallPacks<: " + leftoverSmallPacks);
				System.out.println("WeightCounter<: " + weightCounter);
				System.out.println("\n");
			}else if(smallCount > noOfSmallPacks){
				leftoverSmallPacks = smallCount - noOfSmallPacks;
				weightCounter += noOfSmallPacks; 
				System.out.println("leftoverSmallPacks<: " + leftoverSmallPacks);
				System.out.println("WeightCounter>: " + weightCounter);
				System.out.println("\n");

			}else if(smallCount == noOfSmallPacks){
				weightCounter += noOfSmallPacks;
				System.out.println("WeightCounter=: " + weightCounter);
				System.out.println("\n");
			}

		}

		System.out.println("WeightCounterFinal: " + weightCounter);
		System.out.println("Goal: " + goal);
		System.out.println("\n");
		
		if(weightCounter >= goal){
			return true;
		}
		return false;
	}
	
}
