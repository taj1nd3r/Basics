package tajinder;

import java.util.Random;

public class RandomNum {
	public static void main(String args[]){
		Random dice = new Random();
		int number;

		for(int counter=1; counter<=10;counter++){
			number = 1+dice.nextInt(6);
			if(number==6){
				System.out.println("Hurray you are a winner "+number);
			}
			else{
				System.out.println("Sorry the number is "+number+" Try again");
			}
		}
	}

}
