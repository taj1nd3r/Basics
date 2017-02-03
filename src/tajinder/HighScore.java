package tajinder;

public class HighScore {
	public static void main(String args[]){
		
//		for (int i=1;i<=3;i++){
//			
//		}
		
		int position = calculateHighScorePosition(1500);
		displayHighScorePosition( "Tajinder" , position );
		position=	calculateHighScorePosition(900);
		displayHighScorePosition( "abc" , position );
		position=calculateHighScorePosition(400);
		displayHighScorePosition( "dcf" , position );
		position=calculateHighScorePosition(50);
		displayHighScorePosition( "www" , position );



	}

	public static void displayHighScorePosition(String player, int position){
		System.out.println(player+" managed to get into position "+position+" on high score table" );

	}
	public static int calculateHighScorePosition(int score){
		if(score>1000){
			return 1;
		}
		else if(score >500 && score<1000){
			return 2;
		}else if(score >100 && score<500){
			return 3;
		}else
			return 4;
	}


}
