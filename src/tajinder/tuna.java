package tajinder;

import java.util.Scanner;

public class tuna {
public static void main(String args[]){
	Scanner name = new Scanner(System.in);
	
	//System.out.println("Enter girl Name");
	//String girlName =name.nextLine();
	
	sushi sushiObject= new sushi("gurpinder");
	//sushiObject.setGirlName(girlName);
	sushi sushiObject1= new sushi("gimpy");
	
	sushiObject.saying();
	sushiObject1.saying();
}
}
