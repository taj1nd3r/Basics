package tajinder;

import java.util.Scanner;

public class userInput {
	public static void main(String args[]){
		Scanner user= new Scanner(System.in);// user will be entering the value will be saved in user object
		System.out.println("text entered"+user.nextLine()); //value printed which was saved in user in the next line
		//System.out.println("value entered is "+user);
	}

}
