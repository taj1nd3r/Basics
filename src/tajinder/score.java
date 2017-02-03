package tajinder;

public class score {
	public static void main(String args[]){
		//int finalScore;
		
		int highScore=calculateScore(true,2000,7,300);
				System.out.println("final score is "+highScore);
		//		boolean gameover=true;
		//		int score=1000, levelCompleted=8, bonus=200;
		//		if(gameover!=true){
		//			
		//			
		//			int finalScore= score+((levelCompleted*bonus));
		//			System.out.println("1st final score is "+finalScore);
		//		}else{
		//			int finalScore=score+(levelCompleted*bonus);
		
	}



	public static int calculateScore(boolean gameover, int score,int levelCompleted,int bonus){
		int finalScore =score+(levelCompleted*bonus);
		
		return finalScore;

	}

}
